package Ejemplo01Ficheros;

import java.io.FileWriter;
import java.io.IOException;

public class EjemploFileWriter {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("C:\\descargas\\nuevo_archivo.txt");
            fw.write("¡Hola, mundo!");
            fw.close();
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
}
