package Ejercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println("Introduce tu nombre:");
        String nombre = datos.nextLine();
        System.out.println("Introduce tu edad:");
        int edad = datos.nextInt();
        String resultado=String.format("Hola, me llamo %s y tengo %d años.", nombre, edad);
        System.out.println(resultado);

    }
}
