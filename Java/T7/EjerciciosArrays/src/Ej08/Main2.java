package Ej08;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        for (int i = 0; i < array.length - 1; i++) {
            int j= array.length-1-i;
            int temp2=array[j];
            array[j]=array[j-1];
            array[j-1]=temp2;
        }


        System.out.println(Arrays.toString(array));
    }
}
