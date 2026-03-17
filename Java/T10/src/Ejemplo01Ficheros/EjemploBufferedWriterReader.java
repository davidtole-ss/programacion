package Ejemplo01Ficheros;


import java.io.*;

public class EjemploBufferedWriterReader {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("C:\\archivosTxt\\Ejemplo1.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Linea 1");
            bw.newLine();
            bw.write("Linea 2");
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
        try {
            FileReader fr = new FileReader("C:\\archivosTxt\\Ejemplo1.txt");
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
}
