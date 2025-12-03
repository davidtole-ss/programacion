package Ejercicio05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println("Ingresa una palabra.");
        String palabra = datos.nextLine();
        System.out.println("Ingresa un prefijo.");
        String prefijo = datos.nextLine();
        System.out.println("Ingresa un sufijo.");
        String sufijo = datos.nextLine();
        boolean hayPrefijo = false;
        boolean haySufijo = false;

        int posicionPrefijo = palabra.indexOf(prefijo);
        if (posicionPrefijo != -1 && prefijo.length() > 0) {
            hayPrefijo = true;
        }
        int posicionSufijo = palabra.indexOf(sufijo);
        if (posicionSufijo != -1 && sufijo.length() > 0) {
            haySufijo = true;
        }
        System.out.println("¿Empieza por el prefijo?: " + hayPrefijo);
        System.out.println("¿Empieza por el sufijo?: " + haySufijo);


    }
}

