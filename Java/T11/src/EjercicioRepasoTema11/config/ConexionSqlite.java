package EjercicioRepasoTema11.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionSqlite {
    private static final String URL = "jdbc:sqlite:T11/BBDD/empresa";
    public static Connection connect() {
        try {
            return DriverManager.getConnection(URL);
        } catch (SQLException e) {
            throw new RuntimeException("Error al conectar con la base de datos", e);
        }
    }
}
