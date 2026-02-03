package Ej06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas: ");
        int filas=datos.nextInt();
        System.out.println("Ingrese el numero de columnas: ");
        int columnas=datos.nextInt();
        int num [][]= new int[filas][columnas];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = (int)(Math.random()*1000);
            }
        }
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
    }
}
