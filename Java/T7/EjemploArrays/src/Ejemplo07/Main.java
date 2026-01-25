package Ejemplo07;
 import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] array = {15,30,14,25};
        int[] arrayClonado = array.clone();
        arrayClonado[0]=0;
        System.out.println(Arrays.toString(array));
        System.out.println(array[0]);
        System.out.println(arrayClonado[0]);
    }
}
