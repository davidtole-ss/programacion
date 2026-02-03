package Ej08;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int array []={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
        int ultimaPosicion=array[array.length-1];
        for(int i= array.length-1;i>0;i--){
            array[i]=array[i-1];
        }
        array[0]=ultimaPosicion;


        System.out.println(Arrays.toString(array));
    }
}
