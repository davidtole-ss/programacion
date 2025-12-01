package Ejercicio02;

import java.util.Scanner;

public class Metodo2 {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println("Introduce una frase de 3 palabras");
        String frase = datos.nextLine();
        int posicion1 = frase.indexOf(" ");
        int posicion2 = frase.indexOf(" ", posicion1+1);
        String subcadena1 = frase.substring(posicion1+1,posicion2);
        System.out.println(subcadena1);
    }
}
