package Ejemplo08;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = Arrays.copyOfRange(a,0,a.length);
        int[] c = Arrays.copyOfRange(a,a.length-2,a.length);
        int[] d = Arrays.copyOf(a,a.length);
        int[] e = Arrays.copyOf(a,2);
        System.out.println("Array A: " + Arrays.toString(a));
        System.out.println("Array B: " + Arrays.toString(b));
        System.out.println("Array C: " + Arrays.toString(c));
        System.out.println("Array D: " + Arrays.toString(d));
        System.out.println("Array E: " + Arrays.toString(e));
    }
}
