package EjemploClaseFile.Ejemplo02;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        File objFile1 = new File("C:\\archivosTxT");
        File[] si = objFile1.listFiles();
        for (File f : si) {
            if (f.isFile()) {
                System.out.println(f.getName());
            }
        }
    }
}

