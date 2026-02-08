package Ej3MetodosArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int tamMax;
    public static int tamMin;
    public static Scanner datos = new Scanner(System.in);

    public static void main(String[] args) {
        String[] arrayPalabras = rellenaArray();
        System.out.println(Arrays.toString(arrayPalabras));
        boolean comprobar = comprobarPalabrasIguales(arrayPalabras);
        System.out.println(comprobar);

    }

    public static String[] creaArray(int tam) {
        boolean seguir = true;
        while (seguir) {
            if (tam > 0) {
                seguir = false;
            } else {
                System.out.print("Introduce un numero mayor a 0: ");
                tam = datos.nextInt();
            }
        }
        return new String[tam];
    }

    public static boolean comprobarVocal(String cadena, char vocal) {
        if (cadena.contains(vocal + "")) {
            return true;
        } else {
            return false;
        }

    }

    public static void pideTamanios() {
        int max = tamMax;
        int min = tamMin;
        boolean seguir = true;
        while (seguir) {
            if (max > min && max > 0 && min > 0) {
                seguir = false;
            } else {
                System.out.print("Introduce el tamaño Maximo: ");
                max = datos.nextInt();
                System.out.print("Introduce el tamaño Minimo: ");
                min = datos.nextInt();

            }
            tamMax = max;
            tamMin = min;

        }
    }

    public static String[] rellenaArray() {
        System.out.print("Introduce el tamaño del array: ");
        int tamanioArray = datos.nextInt();
        String[] array = creaArray(tamanioArray);
        System.out.println("Introduce una vocal que estara en todas las palabras del array: ");
        char vocal = datos.next().charAt(0);
        System.out.println("Introduce el tamaño que tendran las palabras del array: ");
        pideTamanios();

        boolean seguir = true;
        for (int i = 0; i < array.length; i++) {
            seguir = true;
            while (seguir) {
                System.out.print("Introduce una palabra:");
                array[i] = datos.next();
                if (array[i].length() <= tamMax && array[i].length() >= tamMin) {
                    boolean comprobar = comprobarVocal(array[i], vocal);
                    if (comprobar) {
                        seguir = false;
                    }
                }

            }
        }
        return array;
    }

    public static boolean comprobarPalabrasIguales(String[] array) {
        int repetida = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    repetida++;
                }
                if (repetida > (array.length / 2)) {
                    return true;
                }
            }
            repetida = 0;
        }
        return false;
    }
}
