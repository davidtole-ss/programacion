package RepasoExamenFormulario.Form3;

import java.sql.*;
import java.util.ArrayList;

public class VideojuegoDAO {
    public void crearTabla() {
        String sql = "CREATE TABLE IF NOT EXISTS Videojuego " +
                "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "titulo TEXT, " +
                "plataforma TEXT, " +
                "precio REAL)";

        try (Connection conn = ConexionSQlite.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.execute();   // si no existe la crea nueva con todas las columnas
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean insertarJuego(Videojuego videojuego) {
        String sql = "INSERT INTO Videojuego (titulo, plataforma, precio) VALUES (?, ?, ?)";
        try(Connection conn=ConexionSQlite.connect(); PreparedStatement ps=conn.prepareStatement(sql);){
            ps.setString(1, videojuego.getTitulo());
            ps.setString(2, videojuego.getPlataforma());
            ps.setDouble(3, videojuego.getPrecio());
            int i=ps.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }

    public ArrayList<Videojuego> obtenerVideojuego(int id) {
        String sql = "SELECT * FROM Videojuego WHERE id = ?";
        ArrayList<Videojuego> videojuegos = new ArrayList<>();
        try(Connection connection = ConexionSQlite.connect();
        PreparedStatement ps = connection.prepareStatement(sql);){
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Videojuego videojuego = new Videojuego();
                videojuego.setTitulo(rs.getString("titulo"));
                videojuego.setPlataforma(rs.getString("plataforma"));
                videojuego.setPrecio(rs.getDouble("precio"));
                videojuegos.add(videojuego);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return videojuegos;
    }
    public ArrayList<Videojuego> obtenerVideosjuego() {
        ArrayList<Videojuego> videosjuego = new ArrayList<>();
        String sql = "SELECT * FROM Videojuego";
        try(Connection conn = ConexionSQlite.connect();){
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Videojuego videojuego = new Videojuego();
                videojuego.setId(rs.getInt("id"));
                videojuego.setTitulo(rs.getString("titulo"));
                videojuego.setPlataforma(rs.getString("plataforma"));
                videojuego.setPrecio(rs.getDouble("precio"));
                videosjuego.add(videojuego);
            }
        }catch(SQLException e){
            e.printStackTrace();

        }
        return videosjuego;
    }

}
