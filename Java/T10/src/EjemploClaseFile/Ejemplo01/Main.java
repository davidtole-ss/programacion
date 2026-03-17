package EjemploClaseFile.Ejemplo01;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        String filePath = "C:\\archivosTxt\\ej02PruebaArray.csv";
        File file = new File(filePath);
        if (file.exists()) {
            System.out.println("El archivo/directorio existe.");
            if (file.isFile()) {
                System.out.println("Es un archivo.");
                System.out.println("Tamaño: " + file.length() + " bytes.");
            }
            if (file.isDirectory()) {
                System.out.println("Es un directorio.");
            }
        } else {
            System.out.println("El archivo/directorio no existe.");
        }
    }
}
