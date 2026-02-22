package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] array = new Integer[10];
        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> lista2 = new ArrayList<>();
        Integer[] arrayEstatico = new Integer[10];
        lista2.toArray(arrayEstatico);


    }
}
