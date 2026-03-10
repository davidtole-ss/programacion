package Ejemplo01Ficheros;

import java.io.FileReader;
import java.util.*;
import java.io.IOException;

public class FileReaderEjemplo {
    public static void main(String[] args) {
        try {
            int contador = 0;
            FileReader fr = new FileReader("C:\\archivosTxt\\PrimerFichero.txt");
            int caracter = fr.read();
            while (caracter != -1) {
                if((char) caracter == 'o'){
                    contador ++;
                }
                caracter = fr.read();
            }
            System.out.println("Numero de O: "+contador);
            fr.close();
        } catch (IOException e) {
            System.out.print(e.getMessage());

        }
    }

}
