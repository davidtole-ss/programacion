package EjerciciosLecturaEscritura.Ej01;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("C:\\archivosTxt\\ej01NumerosNaturales.csv");
            for(int i = 0; i < 10; i++){
                fw.write(i+1+(" "));
            }
            fw.close();
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
        try {
            FileReader fr = new FileReader("C:\\archivosTxt\\ej01NumerosNaturales.csv");
            int linea = fr.read();
            while (linea!= -1) {
                System.out.print((char)linea);
                linea = fr.read();
            }
            fr.close();
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
}
