package EjerciciosCRUD.Ej02.config;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionSQLITE {
    private static final String ruta = "T11/BBDD/instituto.db";
    private static final String URL = "jdbc:sqlite:T11/BBDD/instituto.db";
    public static Connection connect() {
        try {
            return DriverManager.getConnection(URL);
        } catch (SQLException e) {
            throw new RuntimeException("Error al conectar con la base de datos", e);
        }
    }
    public boolean exist(){
        boolean existe = false;
        try{
            File f = new File(ruta);
            if(f.isFile()){
                existe = true;

            }else{
                existe = false;
            }
        }catch(Exception e){
            System.err.println("Error al obtener el id de la tabla: "+e.getMessage());
        }
        return existe;
    }
}
