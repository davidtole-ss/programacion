package EjerciciosTema10.EjerciciosDeFicheros.Ej01;

import java.io.File;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Scanner datos = new Scanner(System.in);
        System.out.println("Introduce una ruta:");
        String ruta =datos.nextLine();
        System.out.println("Introduce el tamaño maximo del archivo:");
        int tam=datos.nextInt();
        File file = new File(ruta);
        if(file.exists()&&file.isDirectory()){
            System.out.println("=== CONTENIDO DEL DIRECTORIO === "+file.getAbsolutePath());
            File [] archivos = file.listFiles();
            for (File archivo : archivos) {
                if(archivo.length()<=tam){
                    if(archivo.isFile()){
                        Date fechaMod=new Date(archivo.lastModified());
                        System.out.printf("[FICH] %s %50s",archivo.getName(),fechaMod);
                        System.out.println();
                    }else if(archivo.isDirectory()){
                        Date fechaMod=new Date(archivo.lastModified());
                        System.out.printf("[DIR] %s %50s",archivo.getName(),fechaMod);
                        System.out.println();
                    }
                }
            }
            datos.nextLine();
            System.out.println("Los quieres eliminar");
            String eliminar = datos.nextLine();
            if(eliminar.equals("S")){
                for(File archivo : file.listFiles()){
                    System.out.println("[DELETED] "+archivo.getName());
                    archivo.delete();
                }
            }
        }
    }
}
