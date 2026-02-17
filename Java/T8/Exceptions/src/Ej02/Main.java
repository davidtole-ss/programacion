package Ej02;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        int[] arrayInverso = new int[10];
        Scanner sc = new Scanner(System.in);
        try{
            for (int i = 0; i < 10; i++) {
                System.out.println(i + "Introduce un numero: ");
                array[i] = sc.nextInt();
            }
            for (int i = 0; i < 10; i++) {
                arrayInverso[i] = array[array.length - 1-i];

            }

        }catch(Exception e){
            System.err.println("Error: "+e.getMessage());
        }

    }
}
