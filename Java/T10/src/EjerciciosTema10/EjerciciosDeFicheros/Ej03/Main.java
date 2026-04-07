package EjerciciosTema10.EjerciciosDeFicheros.Ej03;

import java.io.File;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner datos=new Scanner(System.in);
        System.out.println("Introduce una ruta");
        String rutaBase=datos.nextLine();
        File ruta=new File(rutaBase);
        if(!ruta.exists()){
            System.err.println("Error: ruta no encontrada.");

        }
        if(ruta.isFile()){
            System.out.println("Nombre: "+ruta.getName());
            System.out.println("Ruta absoluta: "+ruta.getAbsolutePath());
            System.out.println("Tamaño: "+ruta.length()+" bytes");
            System.out.println("Última modificación: "+new Date(ruta.lastModified()));

        }
        if(ruta.isDirectory()){
            System.out.println("La ruta pertenece a un DIRECTORIO: ");
            File [] archivos=ruta.listFiles();
            for(File a:archivos){
                if(a.isDirectory()){
                    System.out.println("[DIR] Nombre: "+a.getName());
                    System.out.println("Última modificación: "+new Date(a.lastModified()));
                    System.out.println();
                }
                if(a.isFile()){
                    System.out.println("[FICHERO] \nNombre: "+a.getName());
                    System.out.println("Tamaño: "+a.length()+" bytes.");
                    System.out.println("Última modificación: "+new Date(a.lastModified()));
                    System.out.println();

                }

            }


        }

    }
}
