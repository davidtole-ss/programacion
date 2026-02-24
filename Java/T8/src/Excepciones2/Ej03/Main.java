package Excepciones2.Ej03;

import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        try {
            int[] numeros = {1, 2, 43, 76, 12, 4, 54, 7, 12};
            buscarNumeroArray(numeros, 12);
        } catch (NoSuchElementException e) {
            System.err.println(e.getMessage());
        }

    }
    public static void buscarNumeroArray(int[] array, int numero) {
        boolean encontrado = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero) {
                encontrado = true;
            }
        }
        if (encontrado) {
            System.out.println("El elemento " + numero + " existe en el array.");
        } else {
            throw new NoSuchElementException("Número no encontrado.");
        }

    }
}
