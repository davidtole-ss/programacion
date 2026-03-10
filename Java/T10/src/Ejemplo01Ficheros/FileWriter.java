package Ejemplo01Ficheros;

import java.io.IOException;

public class FileWriter {
    public static void main(String[] args) {
        try {
            String ruta ="C:\\archivosTxt\\PrimerFichero.txt";
            java.io.FileWriter fw = new java.io.FileWriter(ruta);
            fw.write("Hola mundo");

            fw.close();
        } catch (IOException e) {
            System.err.print(e.getMessage());
        }
    }
}
