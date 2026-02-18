package Utilidades;

public class EliminarArray {
    public static void main(String[] args) {

        int[] numeros = {10, 20, 30, 40, 50};
        int posicionEliminar = 2; // eliminar el 30

        int[] nuevoArray = new int[numeros.length - 1];

        // Copiamos lo que está antes de la posición
        System.arraycopy(numeros, 0, nuevoArray, 0, posicionEliminar);

        // Copiamos lo que está después de la posición
        System.arraycopy(numeros, posicionEliminar + 1, nuevoArray, posicionEliminar, numeros.length - posicionEliminar - 1);

        // Mostrar resultado
        for (int n : nuevoArray) {
            System.out.print(n + " ");
        }
    }


}
