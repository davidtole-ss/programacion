package Ej13;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int array[][] = new int[4][5];
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array[x].length; y++) {
                array[x][y] = (int) (Math.random() * 10);
            }
        }
        int sumaFila = 0;
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array[x].length; y++) {
                sumaFila += array[x][y];
                if (y == array[x].length - 1) {
                    System.out.print(array[x][y] + "   S: " + sumaFila);
                } else {
                    System.out.print(array[x][y] + "  ");
                }
            }
            sumaFila = 0;
            System.out.println();
        }
        int sumaColumna2;
        int totalColumnas=0;
        for (int y = 0; y < array[0].length; y++) {   // columnas
            sumaColumna2 = 0;

            for (int x = 0; x < array.length; x++) { // filas
                sumaColumna2 += array[x][y];
            }
            totalColumnas+=sumaColumna2;

            System.out.print(sumaColumna2+" ");
        }
        System.out.print(" T: "+ totalColumnas);


    }
}
