package Ejercicio04;

import java.util.Scanner;

public class replace {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println("Ingresa una frase.");
        String cadena = datos.nextLine();
        System.out.println("Ingresa una palabra");
        String palabra = datos.nextLine();
        cadena= cadena.replace(palabra,"***");
        System.out.println(cadena);
    }

}
