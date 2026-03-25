package EjerciciosRepaso.Ej02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        for (int x = 1; x <= 5; x++) {
            String rutaCarpeta = "C:\\archivosTxt\\carpeta_" + x;
            File carpeta = new File(rutaCarpeta);
            carpeta.mkdir();

            for (int y = 1; y <= 5; y++) {
                String rutaSubcarpeta = rutaCarpeta + "\\subcarpeta_" + y;
                File subcarpeta = new File(rutaSubcarpeta);
                subcarpeta.mkdir();

                for (int k = 1; k <= 5; k++) {
                    String rutaFichero = rutaSubcarpeta + "\\fichero_" + k + ".txt";
                    File fichero = new File(rutaFichero);

                    try {
                        fichero.createNewFile();
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                }
            }
        }

        File rutita = new File("C:\\archivosTxt");
        mostrar(rutita);



    }

    public static void mostrar(File ruta){
        File [] archivos=ruta.listFiles();
        for(File archivo:archivos){
            System.out.print("Nombre del archivo/directorio: "+archivo.getName());
            System.out.println("Tamaño"+archivo.length());

            if(archivo.isDirectory()){
                mostrar(archivo);
            }
        }
    }


}
