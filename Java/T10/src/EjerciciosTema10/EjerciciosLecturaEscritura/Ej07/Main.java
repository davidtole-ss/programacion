package EjerciciosTema10.EjerciciosLecturaEscritura.Ej07;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Main {
    public static void main() {
        String[] array = {"Uno", "Dos", "Tres", "Cuatro", "Cinco"};
        escribeCadenas(array);
    }

    public static void escribeCadenas(String[] array) {
        try {
            FileWriter fw = new FileWriter("C:\\archivosTxt\\ej07PruebaArray.csv");
            BufferedWriter bw = new BufferedWriter(fw);
            for (int x=0;x< array.length;x++) {
                if(x== array.length-1){
                    bw.write(array[x]);
                }else {
                    bw.write(array[x] + "|");
                }
            }
            bw.close();
        } catch (Exception e) {
            System.err.print(e.getMessage());
        }
    }
}

