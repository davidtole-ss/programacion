package EjerciciosTema10.EjerciciosLecturaEscritura.Ej06;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fr= new FileWriter("C:\\archivosTxt\\ej07NumerosNaturales.csv");
        BufferedWriter br= new BufferedWriter(fr);
        for(int x=1;x<=10;x++){
            br.write(x+" ");
        }
        br.close();
    }
}
