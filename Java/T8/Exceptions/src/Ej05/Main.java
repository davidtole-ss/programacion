package Ej05;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        try {
            System.out.print("Introduce el tamaño del array.");
            int tam = datos.nextInt();
            int[] array = null;
            try {
                if (tam == 0) {
                    throw new IllegalArgumentException("El tamaño no puede ser 0.");
                }
                array = new int[tam];
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
            } catch (NegativeArraySizeException e) {
                System.err.println("El tamaño no puede ser negativo.");
            }

            for (int i = 0; i < tam; i++) {
                try {
                    System.out.print("Introduce el elemento " + (i + 1) + " :");
                    array[i] = datos.nextInt();
                } catch (InputMismatchException e) {
                    System.err.println("Esto no es un numero entero.");
                    break;
                }
            }
            if (array != null) {
                double media = calculaMediaArray(array);
                System.out.println(media);
            }

        } catch (InputMismatchException e) {
            System.err.println("Esto no es un numero entero.");

        }
    }
    public static double calculaMediaArray(int[] array) {
        double media = 0;
        for (int i = 0; i < array.length; i++) {
            media += array[i];


        }
        return media / array.length;
    }
}
