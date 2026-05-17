package EjercicioRepasoTema11.repository;

import EjercicioRepasoTema11.config.ConexionSqlite;
import EjercicioRepasoTema11.model.Factura;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FacturaDAO {
    public void insertar(Factura factura) {
        String sql = "INSERT INTO facturas (cantidad) VALUES (?)";
        try (Connection conn = ConexionSqlite.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, factura.getCantidad());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void eliminar(Factura factura) {
        String sql = "DELETE FROM facturas WHERE id = ?";
        try(Connection conn = ConexionSqlite.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, factura.getId());
            pstmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();

        }
    }
    public void modificar(int id,Factura factura) {
        String sql="UPDATE facturas SET cantidad = ? WHERE id = ?";
        try(Connection conn = ConexionSqlite.connect();
        PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, factura.getCantidad());
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public ArrayList<Factura> listar() {
        ArrayList<Factura> lista = new ArrayList<>();
        String sql = "SELECT * FROM facturas";
        try(Connection conn=ConexionSqlite.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();){
            while (rs.next()) {
                Factura f = new Factura();
                f.setId(rs.getInt("id"));
                f.setCantidad(rs.getInt("cantidad"));
                lista.add(f);
            }

        }catch(SQLException e){
            e.printStackTrace();

        }
        return lista;
    }

}
