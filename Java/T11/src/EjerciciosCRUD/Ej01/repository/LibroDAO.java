package EjerciciosCRUD.Ej01.repository;


import EjerciciosCRUD.Ej01.model.Libro;
import EjerciciosCRUD.Ej01.config.ConexionSQLITE;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LibroDAO {
    public void crearTabla() {
        String sql  = "CREATE TABLE IF NOT EXISTS libros " +
                "(id_libro INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "autor TEXT, titulo TEXT, anio TEXT)";

        try (Connection conn = ConexionSQLITE.connect();
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);   // la crea nueva con todas las columnas
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void insertar(Libro libro) {
        String sql = "INSERT INTO libros (autor, titulo,anio) VALUES ( ?,?,?)";
        try (Connection conn = ConexionSQLITE.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, libro.getAutor());
            pstmt.setString(2, libro.getTitulo());
            pstmt.setString(3, libro.getAnio());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public List<Libro> obtenerTodas() {
        List<Libro> libros = new ArrayList<>();
        String sql = "SELECT * FROM libros";
        try (Connection conn = ConexionSQLITE.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                libros.add(new Libro(rs.getInt("id_libro"),rs.getString("autor"), rs.getString("titulo"), rs.getString("anio")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return libros;
    }
    public void actualizar(String autor, String titulo, String anio) {
        String sql = "UPDATE libros SET autor = ?, titulo = ? WHERE anio = ?";
        try (Connection conn = ConexionSQLITE.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, autor);
            pstmt.setString(2, titulo);
            pstmt.setString(3, anio);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void eliminar(int id_libro) {
        String sql = "DELETE FROM libros WHERE id_libro = ?";
        try (Connection conn = ConexionSQLITE.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id_libro);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

