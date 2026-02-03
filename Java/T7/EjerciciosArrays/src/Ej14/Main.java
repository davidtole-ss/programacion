package Ej14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int [] array = new int[10];
    rellenaArray(array);
    mostrarPosicionYValor(array);
    }
    public static void rellenaArray(int [] array){
        Scanner datos = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduce el elemento " + (i + 1) + ": ");
            array[i] = datos.nextInt();
        }

    }
    public static void mostrarPosicionYValor(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("En el indice " + (i) + " esta el valor: "+array[i]);
        }

    }
}
