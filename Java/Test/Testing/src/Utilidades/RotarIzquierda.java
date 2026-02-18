package Utilidades;

public class RotarIzquierda {
    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 5};

        int primero = numeros[0]; // guardamos el primero

        // desplazamos hacia la izquierda
        for (int i = 0; i < numeros.length - 1; i++) {
            numeros[i] = numeros[i + 1];
        }

        numeros[numeros.length - 1] = primero; // ponemos el primero al final

        for (int n : numeros) {
            System.out.print(n + " ");
        }
    }
}

