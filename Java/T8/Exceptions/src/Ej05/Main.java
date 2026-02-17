package Ej05;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.print("Introduce el tamaño del array.");
        int tam = datos.nextInt();
        try {
            if (tam <= 0) {
                throw new ArithmeticException();
            }
        } catch (ArithmeticException e) {
            System.err.println("Array vacio.");
        }
        int[] array = new int[tam];
        for (int i = 0; i < tam; i++) {
            try {
                System.out.print("Introduce el elemento " + (i + 1) + " :");
                array[i] = datos.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("Esto no es un numero entero.");
                break;
            }
        }
        double media = calculaMediaArray(array);
        System.out.println("Media: " + media);

    }

    public static double calculaMediaArray(int[] array) {
        double media = 0;
        for (int i = 0; i < array.length; i++) {
            media += array[i];

        }
        return media / array.length;
    }
}
