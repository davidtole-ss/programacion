package EjerciciosLecturaEscritura.Ej05;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        try{
            FileWriter fw = new FileWriter("C:\\archivosTxt\\ej04Cachopos.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.newLine();
            System.out.print("Introduce el nombre del local: ");
            String nombre = datos.nextLine();
            bw.write(nombre+"|");
            System.out.print("Introduce la ciudad: ");
            String ciudad = datos.nextLine();
            bw.write(ciudad+"|");
            System.out.print("Introduce el codigo postal: ");
            String codigoPostal = datos.nextLine();
            bw.write(codigoPostal);
            bw.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        try {
            FileReader fr = new FileReader("C:\\archivosTxt\\ej04Cachopos.txt");
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
