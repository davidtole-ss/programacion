package pr1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner datos = new Scanner(System.in);
        /*
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = aleatorio.nextInt(1, 101);

        }
        System.out.println(Arrays.toString(array));

        int[] array2 = {1, 4, 5, 15, 20, 15};
        boolean seguir = true;
        int x = 0;
        int numero = datos.nextInt();
        while (seguir) {
            if (array2[x] == numero) {
                System.out.println("Posicion: " + x);
                seguir = false;
            } else if (x == array2.length - 1) {
                seguir = false;

            } else {
                x++;
            }

        }
        */
        int[][] array3 = new int[3][4];
        for (int x = 0; x < array3.length; x++) {
            for (int y = 0; y < array3[x].length; y++) {
                array3[x][y] = aleatorio.nextInt(1, 10);
                System.out.print(array3[x][y] + "  ");
            }
            System.out.println();
        }


        for (int x = 0; x < array3.length; x++) {
            int sumaFila = 0;
            for (int y = 0; y < array3[x].length; y++) {
                sumaFila += array3[x][y];


            }
            System.out.println("Fila " + x + ": " + sumaFila);
        }

        for (int y = 0; y < array3[0].length; y++) {
            int sumaColumna = 0;
            for (int x = 0; x < array3.length; x++) {
                sumaColumna += array3[x][y];


            }
            System.out.println("Columna " + y + ": " + sumaColumna);
        }


    }
}

