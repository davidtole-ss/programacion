package generico.EjemplosGenéricos;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Integer[] entero = {1, 2, 3, 4, 5};
        Double[] decimal = {1.0, 2.0, 3.0, 4.0, 5.0};

        System.out.println(convertidorEnetero(entero));
        System.out.println(convertidorDecima(decimal));
    }

    public static ArrayList<Integer> convertidorEnetero(Integer[] enteros) {
        ArrayList<Integer> listaEnteros = new ArrayList<>();

        for (Integer entero : enteros) {
            listaEnteros.add(entero);
        }
        return listaEnteros;
    }

    public static ArrayList<Double> convertidorDecima(Double[] enteros) {
        ArrayList<Double> listaDecimales = new ArrayList<>();

        for (Double entero : enteros) {
            listaDecimales.add(entero);
        }
        return listaDecimales;
    }

    public static <E> ArrayList<E> convertidorGenerico(E[] enteros) {
        ArrayList<E> listaDecimales = new ArrayList<>();

        for (E entero : enteros) {
            listaDecimales.add(entero);
        }
        return listaDecimales;
    }
}
