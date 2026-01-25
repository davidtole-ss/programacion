package Ejemplo10;

public class Main {
    public static void main(String[] args) {
        int array1[]= {15,30,14,25};
        int array2[]= array1;
        int arrayClonado[] = array1.clone();
        System.out.println(array1 == arrayClonado);
        System.out.println(array1 == array2);
        System.out.println(java.util.Arrays.equals(array1,arrayClonado));
        System.out.println(array1+""+array2+""+arrayClonado);
    }
}
