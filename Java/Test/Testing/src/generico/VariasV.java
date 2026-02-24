package generico;

import java.util.*;

public class VariasV {
    public static void main(String[] args) {
        Integer[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayList<Integer> lista = convertToArrayList(numeros, "Manolo");
        System.out.println("Lista: " + lista);

        String[] palabras = {"manolo","perro","pepe"};
        ArrayList<String> listaPalabras = convertToArrayList(palabras, "Pedro");
        System.out.println("Lista: " + listaPalabras);
    }

    public static <V, V2> ArrayList<V> convertToArrayList(V[] array, V2 otroTipoDeDato) {
        ArrayList<V> miLista = new ArrayList<>();
        // Con el tipo V voy a hacer, por ejemplo, lo que estaba haciendo antes
        for (V numero : array) {
            miLista.add(numero);
        }
        //Otra froma: ArrayList<V> miLista = new ArrayList<>(Arrays.asList(array));
        // Y con el tipo V2, por ejemplo, simplemente voy a imprimirlo por pantalla
        System.out.println(otroTipoDeDato);
        return miLista;
    }
}
