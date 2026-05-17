package EjerciciosRepasoClase.Ej01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

public class Main2 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\archivosTxt\\ejercicio1Repaso.txt");
        BufferedReader br = new BufferedReader(fr);
        String linea = br.readLine();
        int[] numeros = new int[15];
        int contador = 0;
        while (linea != null) {
            if(!linea.isEmpty()){
                String[] linea2 = linea.split("\\|");
                numeros[contador] = parseInt(linea2[2].trim());
                contador++;
            }
            linea = br.readLine();
        }
        br.close();
        System.out.println(Arrays.toString(numeros));
        double suma = 0.0;
        for (int n : numeros) {
            suma += n;
        }
        System.out.println("Suma de las edades es : "+suma);
    }
}
