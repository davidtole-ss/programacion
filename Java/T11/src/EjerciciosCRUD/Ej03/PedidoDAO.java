package EjerciciosCRUD.Ej03;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PedidoDAO {
    public void crearTabla() {
        String sql = "CREATE TABLE IF NOT EXISTS pedidos " +
                "(id_pedido INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "id_producto INTEGER, " +
                "cantidad INTEGER, " +
                "fecha TEXT, " +
                "FOREIGN KEY (id_producto) REFERENCES productos(id_producto))";

        try (Connection conn = ConexionSQLITE.connect();
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);   // la crea nueva con todas las columnas
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void insertar(Pedido pedido) {
        String sql = "INSERT INTO pedidos (cantidad,fecha,id_producto) VALUES (?,?,?)";
        try (Connection conn = ConexionSQLITE.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, pedido.getCantidad());
            pstmt.setString(2, pedido.getFecha());
            pstmt.setInt(3, pedido.getId_producto());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public List<Pedido> obtenerTodas() {
        List<Pedido> pedidos = new ArrayList<>();
        String sql = "SELECT pe.id_pedido, pe.id_producto, pe.cantidad, pe.fecha, pr.nombre \n" +
                "FROM pedidos pe \n" +
                "INNER JOIN productos pr ON pe.id_producto = pr.id_producto";
        try (Connection conn = ConexionSQLITE.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                pedidos.add(new Pedido(rs.getInt("id_pedido"),rs.getInt("id_producto"),rs.getInt("cantidad"),rs.getString("fecha"),rs.getString("nombre")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pedidos;
    }
    public List<Pedido> obtenerTodas(String fecha) {
        List<Pedido> pedidos = new ArrayList<>();
        String sql = "SELECT * FROM pedidos WHERE fecha =?";
        try (Connection conn = ConexionSQLITE.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql))
        {
            pstmt.setString(1, fecha);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                pedidos.add(new Pedido(rs.getInt("id_pedido"),rs.getInt("id_producto"),rs.getInt("cantidad"),rs.getString("fecha")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pedidos;
    }
    public List<Pedido> valorTotalPedido() {
        List<Pedido> pedidos = new ArrayList<>();
        String sql = "SELECT pe.id_pedido, (pe.cantidad*pr.precio) AS valor_total_pedido FROM pedidos pe INNER JOIN productos pr ON pe.id_producto=pr.id_producto GROUP BY pe.id_pedido";
        try (Connection conn = ConexionSQLITE.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql))
        {
            while (rs.next()) {
                pedidos.add(new Pedido(rs.getInt("id_pedido"),rs.getDouble("valor_total_pedido")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pedidos;
    }
    public void actualizar(String fecha,int id_pedido) {
        String sql = "UPDATE pedidos SET fecha = ? WHERE id_pedido = ?";
        try (Connection conn = ConexionSQLITE.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, fecha);
            pstmt.setInt(2, id_pedido);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void eliminar(int id_pedido) {
        String sql = "DELETE FROM pedidos WHERE id_pedido = ?";
        try (Connection conn = ConexionSQLITE.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id_pedido);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
