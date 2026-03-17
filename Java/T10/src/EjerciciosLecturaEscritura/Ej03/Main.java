package EjerciciosLecturaEscritura.Ej03;

import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        imprimeCadenas();
    }
    public static void imprimeCadenas(){
        try {
            FileReader fr = new FileReader("C:\\archivosTxt\\ej02PruebaArray.csv");
            int caracter = fr.read();

            while (caracter != -1) {
                if ((char) caracter != '|') {
                    System.out.print((char) caracter);
                } else {
                    System.out.println();
                }
                caracter = fr.read();
            }
            fr.close();
        } catch (Exception e) {
            System.err.print(e.getMessage());
        }
    }
}
