package Ej03;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < array.length / 2; i++) {
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



    }
}
