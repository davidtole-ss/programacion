package Ejemplo02;

public class Main {
    public static void main(String[] args) {
        int [] [] arrayBidimensional= new int [2][2];
        int [] [] arrayBidimensional2={{1,2},{3,4}};
        arrayBidimensional[0][0] = 1;
        arrayBidimensional[0][1] = 2;
        arrayBidimensional[1][0] = 3;
        arrayBidimensional[1][1] = 4;
        System.out.println(arrayBidimensional[1][1]);
        System.out.println(arrayBidimensional2[1][0]);
    }
}
