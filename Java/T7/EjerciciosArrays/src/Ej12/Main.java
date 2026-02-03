package Ej12;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = new int[20];
        int divisor = 0;
        int esPrimo = 0;
        for (int j = 0; j < array1.length; j++) {
            array1[j] = (int) (Math.random() * 100);
        }
        for (int j = 0; j < array1.length; j++) {
            divisor = 0;

            for (int k = 1; k <= array1[j]; k++) {
                if (array1[j] % k == 0) {
                    divisor++;
                }
            }
            if (divisor <= 2&&array1[j] > 1) {
                esPrimo++;
            }
        }
        int[] array2 = new int[esPrimo];
        int i = 0;
        for (int j = 0; j < array1.length; j++) {
            divisor = 0;
            for (int k = 1; k <= array1[j]; k++) {
                if (array1[j] % k == 0) {
                    divisor++;
                }
            }
            if (divisor <= 2&&array1[j] > 1) {
                array2[i] = array1[j];
                i++;
            }
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}
