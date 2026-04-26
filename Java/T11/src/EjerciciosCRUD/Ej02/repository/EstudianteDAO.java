package EjerciciosCRUD.Ej02.repository;


import EjerciciosCRUD.Ej02.model.Estudiante;
import EjerciciosCRUD.Ej02.config.ConexionSQLITE;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDAO {
    public void crearTabla() {
        String sql = "CREATE TABLE IF NOT EXISTS estudiantes " +
                "(id_estudiante INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "nombre TEXT, apellido TEXT, edad INTEGER, curso TEXT)";

        try (Connection conn = ConexionSQLITE.connect();
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);   // la crea nueva con todas las columnas
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertar(Estudiante estudiante) {
        String sql = "INSERT INTO estudiantes (nombre, apellido,edad,curso) VALUES ( ?,?,?,?)";
        try (Connection conn = ConexionSQLITE.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, estudiante.getNombre());
            pstmt.setString(2, estudiante.getApellido());
            pstmt.setInt(3, estudiante.getEdad());
            pstmt.setString(4, estudiante.getCurso());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Estudiante> obtenerTodas() {
        List<Estudiante> estudiantes = new ArrayList<>();
        String sql = "SELECT * FROM estudiantes";
        try (Connection conn = ConexionSQLITE.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                estudiantes.add(new Estudiante(rs.getInt("id_estudiante"), rs.getString("nombre"), rs.getString("apellido"), rs.getInt("edad"), rs.getString("curso")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return estudiantes;
    }

    public void actualizar(String nombre, String apellido, String curso) {
        String sql = "UPDATE estudiantes SET curso = ? WHERE nombre = ? AND apellido = ?";
        try (Connection conn = ConexionSQLITE.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, curso);
            pstmt.setString(2, nombre);
            pstmt.setString(3, apellido);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminar(String nombre, String apellido) {
        String sql = "DELETE FROM estudiantes WHERE nombre = ? AND apellido = ?";
        try (Connection conn = ConexionSQLITE.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nombre);
            pstmt.setString(2, apellido);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

