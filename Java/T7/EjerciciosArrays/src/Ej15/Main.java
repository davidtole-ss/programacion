package Ej15;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main (String [] args){
    int[] array=creaArrayAleatorio(0,9);

    }
    public static int[] creaArrayAleatorio(int min, int max){
        int suma=0;
        Scanner datos = new Scanner(System.in);
        System.out.print("Introduce el tamaño del array.");
        int tam=datos.nextInt();
        int [] array= new int[tam];
        for(int i=0;i<tam;i++){
            array[i]=generadorNumeros(min,max);
            suma+=array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Suma de los valores : "+suma);

        return array;


    }
    private static int generadorNumeros(int min, int max){
        int numeroAleatorio=(int)(Math.random()*(max-min+1)+min);
        return numeroAleatorio;
    }
}
