package Ejercicio03;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println("Ingresa una frase.");
        String frase = datos.nextLine();
        System.out.println("Ingresa una palabra de la frase que sera la prohibida.");
        String palabra = datos.nextLine();
        StringBuffer frase2 = new StringBuffer();
        int posicionProhibida = 0;
        int posicionFrase = 0;

        while (posicionProhibida != -1) {
            posicionProhibida = frase.indexOf(palabra, posicionFrase);
            if (posicionProhibida != -1) {
                frase2.append(frase.substring(posicionFrase, posicionProhibida));
                frase2.append("***");
                posicionFrase = posicionProhibida + palabra.length();
            } else {
                frase2.append(frase.substring(posicionFrase, frase.length()));
            }


        }
        System.out.println("Frase: " + frase2);
    }
}
