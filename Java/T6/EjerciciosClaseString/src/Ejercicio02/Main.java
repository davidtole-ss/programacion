package Ejercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println("Ingresa una frase de 3 palabras ");
        String frase = datos.nextLine();

        int posicion1 = frase.indexOf(" ");
        String subcadena1 = frase.substring(posicion1+1, frase.length() - 1);
        int posicion2 = subcadena1.indexOf(" ");
        String subcadena2 = subcadena1.substring(0, posicion2);
        System.out.println(subcadena2);


    }
}
