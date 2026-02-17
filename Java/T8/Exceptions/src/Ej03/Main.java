package Ej03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        try {
            System.out.println("Ingrese el numero de las columnas: ");
            int numColumnas = datos.nextInt();
            int[][] array = new int[5][numColumnas];
            Random rnd = new Random();
            for (int x = 0; x < array.length; x++) {
                for (int y = 0; y < numColumnas; y++) {
                    array[x][y] = rnd.nextInt(0, 11);
                    System.out.printf("%-3d %s",array[x][y]," ");
                }
                System.out.println("\n");

            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
