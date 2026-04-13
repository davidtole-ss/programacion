package EjerciciosCRUD.Ej03;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO {
    public void crearTabla() {
        String sql = "CREATE TABLE IF NOT EXISTS productos " +
                "(id_producto INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "nombre TEXT, descripcion TEXT, precio REAL, stock INTEGER)";

        try (Connection conn = ConexionSQLITE.connect();
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);   // la crea nueva con todas las columnas
        } catch (
                SQLException e) {
            e.printStackTrace();
        }
    }
    public void insertar(Producto producto) {
        String sql = "INSERT INTO productos (nombre,descripcion,precio,stock) VALUES ( ?,?,?,?)";
        try (Connection conn = ConexionSQLITE.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, producto.getNombre());
            pstmt.setString(2, producto.getDescripcion());
            pstmt.setDouble(3, producto.getPrecio());
            pstmt.setInt(4, producto.getStock());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public List<Producto> obtenerTodas() {
        List<Producto> productos = new ArrayList<>();
        String sql = "SELECT * FROM productos";
        try (Connection conn = ConexionSQLITE.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                productos.add(new Producto(rs.getInt("id_producto"),rs.getString("nombre"),rs.getString("descripcion"),rs.getDouble("precio"),rs.getInt("stock")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productos;
    }
    public List<Producto> obtenerMasVendidos() {
        List<Producto> productos = new ArrayList<>();
        String sql = "SELECT pe.id_producto, COUNT(*) as total_pedido,pr.nombre FROM pedidos pe INNER JOIN productos pr ON pe.id_producto=pr.id_producto GROUP BY pe.id_producto,pr.nombre ORDER BY total_pedido DESC";
        try (Connection conn = ConexionSQLITE.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                productos.add(new Producto(rs.getString("nombre"),rs.getInt("total_pedido")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productos;
    }

    public void actualizar(String nombre, Double precio,int stock) {
        String sql = "UPDATE productos SET precio = ?,stock=? WHERE nombre = ?";
        try (Connection conn = ConexionSQLITE.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setDouble(1, precio);
            pstmt.setInt(2, stock);
            pstmt.setString(3, nombre);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void eliminar(String nombre) {
        String sql = "DELETE FROM productos WHERE nombre = ?";
        try (Connection conn = ConexionSQLITE.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nombre);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
