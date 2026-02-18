package cruz;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* Scanner datos = new Scanner(System.in);
        System.out.println("Ingresa un numero.");
        int numero = datos.nextInt();
        for(int x=0;x<numero;x++){
            for(int y=0;y<numero;y++){
                if(x==y||y+x==numero-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
        */
        int [] arrayNummeros={1,2,3,4,5,6,7,8};
        int [] arrayNuevo=eliminarElementoArray(arrayNummeros,4);
        System.out.println(Arrays.toString(arrayNuevo));

    }
    public static int[] añadirElementoArray(int[] array, int elemento, int posicion) {
        int[] nuevoArray = new int[array.length + 1];
        System.arraycopy(array, 0, nuevoArray, 0, posicion);
        nuevoArray[posicion] = elemento;
        System.arraycopy(array, posicion, nuevoArray, posicion + 1, array.length-posicion);

        return nuevoArray;
    }
    public static int [] eliminarElementoArray(int[] array, int elemento) {
        int [] nuevoArray = new int[array.length - 1];
        int posicion =Arrays.binarySearch(array, elemento);
        System.arraycopy(array, 0, nuevoArray, 0, posicion);
        System.arraycopy(array, posicion+1, nuevoArray, posicion, nuevoArray.length-posicion);
        return nuevoArray;

    }
}
