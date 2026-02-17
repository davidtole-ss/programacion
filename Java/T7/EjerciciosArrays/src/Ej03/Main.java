package Ej03;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < array.length  /2; i++) {
            int j = array.length - 1 - i;

            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        System.out.print(Arrays.toString(array));
        /*
        int [] num2=new int [num.length];
        int j=num.length;
        for(int x=0;x<num.length;x++){
            j--;
            num2[x]=num[j];
        }
        System.out.print(Arrays.toString(num2));
         */


        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int posicion = Arrays.binarySearch(array2, 9);
        int[] nuevo = insertar(array2, posicion);
        System.out.println(Arrays.toString(nuevo));
    }

    public static int[] insertar(int[] array, int posicion) {
        int[] nuevo = new int[array.length - 1];

        System.arraycopy(array, 0, nuevo, 0, posicion);

        System.arraycopy(array, posicion + 1, nuevo, posicion, array.length - posicion - 1);
        return nuevo;

    }
}
