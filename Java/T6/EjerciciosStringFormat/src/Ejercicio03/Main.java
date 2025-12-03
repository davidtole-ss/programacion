package Ejercicio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println("Introduce el numero de participantes");
        int nParticipantes = datos.nextInt();
        String tabla="";

        for (int x = 0; x < nParticipantes; x++) {
            System.out.println("Introduce el nombre del participante.");
            String nombre = datos.next();
            System.out.println("Introduce la puntuacion del participante.");
            int puntuacion = datos.nextInt();
            String resultado=String.format("|%-10s|%10s|",nombre,puntuacion);
            tabla+=resultado+"\n";
        }
        System.out.print(tabla);


    }
}
