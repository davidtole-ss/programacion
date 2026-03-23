package EjerciciosTema10.EjerciciosLecturaEscritura.Ej04;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("C:\\archivosTxt\\ej04Cachopos.txt");
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
//            while (line != null) {
//                    if (line.contains("|6")) {
//                        System.out.println(line);
//                        line = br.readLine();
//                    } else {
//                        line = br.readLine();
//                    }
//                }
//                br.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
