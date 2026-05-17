package RepasoExamenFormulario.Form3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionSQlite {
    private static final String url = "jdbc:sqlite:videojuegos.db";

    public static Connection connect() {
        try {
            return DriverManager.getConnection(url);
        } catch (SQLException e) {
            throw new RuntimeException("Error al conectar con la base de datos", e);
        }
    }
}
