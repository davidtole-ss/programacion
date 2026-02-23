package pr1;

import java.util.Arrays;

public class Main5 {
    public static void main(String[] args) {
        int[] array = {3, 8, 1, 6, 9, 2};
        int[] invertido= new  int[array.length];
        for(int i=0;i<array.length;i++){
            invertido[array.length-i-1]=array[i];
        }
        System.out.println(Arrays.toString(invertido));
    }
}
