package EjerciciosTema10.EjerciciosDeFicheros.Ej02;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ruta base: ");
        String rutaBase = sc.nextLine();

        System.out.print("Nombre del proyecto: ");
        String nombreProyecto = sc.nextLine();

        File proyecto = new File(rutaBase, nombreProyecto);

        if (proyecto.exists()) {
            File backup = new File(rutaBase, nombreProyecto + "_backup");
            if (proyecto.renameTo(backup)) {
                System.out.println("Proyecto existente, renombrado a: " + backup.getAbsolutePath());
            } else {
                System.out.println("No se pudo renombrar el proyecto existente.");
            }
        }

        File src = new File(proyecto, "src");
        File data = new File(proyecto, "data");

        if (proyecto.mkdirs()) {
            System.out.println("Creado: " + proyecto.getAbsolutePath());
        }
        if (src.mkdirs()) {
            System.out.println("Creado: " + src.getAbsolutePath());
        }
        if (data.mkdirs()) {
            System.out.println("Creado: " + data.getAbsolutePath());
        }

        File readme = new File(proyecto, "README.txt");
        try {
            if (readme.createNewFile()) {
                System.out.println("Archivo creado: " + readme.getAbsolutePath());
            } else {
                System.out.println("El archivo README.txt ya existía.");
            }
        } catch (IOException e) {
            System.out.println("Error al crear README.txt: " + e.getMessage());
        }
        System.out.println("Ruta del proyecto (getPath): " + proyecto.getPath());

        sc.close();
    }


}

