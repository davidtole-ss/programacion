package Ej05;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int num[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int[] fila : num) {
            for (int columna : fila) {
                System.out.print(columna + "  ");
            }
            System.out.println();
        }


        /*for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j]+"  ");
            }
            System.out.println();
        }*/
    }

}
