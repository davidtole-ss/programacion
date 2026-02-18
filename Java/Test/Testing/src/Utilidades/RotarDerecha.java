package Utilidades;

public class RotarDerecha {
    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 5};

        int ultimo = numeros[numeros.length - 1]; // guardamos el último

        // desplazamos hacia la derecha
        for (int i = numeros.length - 1; i > 0; i--) {
            numeros[i] = numeros[i - 1];
        }

        numeros[0] = ultimo; // ponemos el último al principio

        for (int n : numeros) {
            System.out.print(n + " ");
        }
    }
}

