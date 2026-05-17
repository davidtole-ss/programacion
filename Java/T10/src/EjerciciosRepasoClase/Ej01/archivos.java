package EjerciciosRepasoClase.Ej01;

import java.io.File;

public class archivos {
    public static void main(String[] args) {
        File ruta = new File("C:\\archivosTxt");
        if (!ruta.exists()) {
            System.err.println("Error: ruta no encontrada.");
        } else {
            System.out.println("La ruta pertenece a un DIRECTORIO: ");
            File[] archivos = ruta.listFiles();
            for (File a : archivos) {
                if (a.isFile()) {
                    System.out.println("[FICHERO] \nNombre: " + a.getName());
                    System.out.println("Ruta: " + a.getAbsolutePath());
                    System.out.println("Tamaño: " + ((double) a.length() / 1024) + " KB.");
                    System.out.println();
                }
            }
        }
    }
}

