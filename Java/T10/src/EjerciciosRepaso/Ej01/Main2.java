package EjerciciosRepaso.Ej01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

public class Main2 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\archivosTxt\\ejercicioRepasoCodigosPostales.txt");
        BufferedReader br = new BufferedReader(fr);
        String linea = br.readLine();
        int[] codigosPostales = new int[25];
        int contador = 0;
        while (linea != null) {
            if(!linea.isEmpty()){
                String[] linea2 = linea.split("\\|");
                codigosPostales[contador] = parseInt(linea2[1].trim());
                contador++;
            }
            linea = br.readLine();
        }
        br.close();
        System.out.println(Arrays.toString(codigosPostales));
        double suma = 0.0;
        for (int codigoPostal : codigosPostales) {
            suma += codigoPostal;
        }
        double media=suma/codigosPostales.length;
        System.out.println("Media de los codigos postales: "+media);
    }
}
