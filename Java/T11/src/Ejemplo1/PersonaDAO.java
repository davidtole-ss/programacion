package Ejemplo1;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
// DAO (Data Access Object)
class PersonaDAO {
    public void crearTabla() {
        String sql = "CREATE TABLE IF NOT EXISTS personas (id INTEGER PRIMARY KEY AUTOINCREMENT, nombre TEXT, edad INTEGER)";
        try (Connection conn = ConexionSQLITE.connect();
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void insertar(Persona persona) {
        String sql = "INSERT INTO personas (nombre, edad) VALUES (?, ?)";
        try (Connection conn = ConexionSQLITE.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, persona.getNombre());
            pstmt.setInt(2, persona.getEdad());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public List<Persona> obtenerTodas() {
        List<Persona> personas = new ArrayList<>();
        String sql = "SELECT * FROM personas";
        try (Connection conn = ConexionSQLITE.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                personas.add(new Persona(rs.getInt("id"), rs.getString("nombre"), rs.getInt("edad")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return personas;
    }
    public void actualizar(int id, String nombre, int edad) {
        String sql = "UPDATE personas SET nombre = ?, edad = ? WHERE id = ?";
        try (Connection conn = ConexionSQLITE.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nombre);
            pstmt.setInt(2, edad);
            pstmt.setInt(3, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void eliminar(int id) {
        String sql = "DELETE FROM personas WHERE id = ?";
        try (Connection conn = ConexionSQLITE.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

