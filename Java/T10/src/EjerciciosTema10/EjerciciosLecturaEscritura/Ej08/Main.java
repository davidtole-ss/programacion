package EjerciciosTema10.EjerciciosLecturaEscritura.Ej08;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) throws IOException {
        FileWriter fw = new FileWriter("C:\\archivosTxt\\ej08Cachopos.txt");
        BufferedWriter bw = new BufferedWriter(fw);
//        Scanner datos = new Scanner(System.in);
//        System.out.println("Introduce el numero de restaurantes que quieres ingresar.");
//        int numRestaurantes = datos.nextInt();
//        for (int x = 0; x < numRestaurantes; x++) {
//            bw.newLine();
//            System.out.print("Introduce el nombre del local: ");
//            String nombre = datos.nextLine();
//            bw.write(nombre + "|");
//            System.out.print("Introduce la ciudad: ");
//            String ciudad = datos.nextLine();
//            bw.write(ciudad + "|");
//            System.out.print("Introduce el codigo postal: ");
//            String codigoPostal = datos.nextLine();
//            bw.write(codigoPostal);
//        }
        bw.write("El Cachopo I|Gijón|28300");
        bw.newLine();
        bw.write("El Cachopo II|Gijón|28450");
        bw.newLine();
        bw.write("El Cachopo III|Gijón|28625");
        bw.newLine();
        bw.write("El Cachopo IV|Gijón|96325");
        bw.newLine();
        bw.write("El Cachopo V|Gijón|68950");
        bw.newLine();
        bw.write("El Cachopo VI|Gijón|66870");
        bw.newLine();
        bw.close();
        FileReader fr = new FileReader("C:\\archivosTxt\\ej08Cachopos.txt");
        BufferedReader br = new BufferedReader(fr);
        String linea = br.readLine();
        while (linea != null) {
            int p1 = linea.indexOf('|');
            int p2 = linea.indexOf('|', p1 + 1);
            String nombre = linea.substring(0, p1).trim();
            String ciudad = linea.substring(p1 + 1, p2).trim();
            String cp = linea.substring(p2 + 1).trim();
            if (cp.startsWith("6")) {
                System.out.println(linea);
            }
            linea = br.readLine();
        }
        br.close();
    }
}
