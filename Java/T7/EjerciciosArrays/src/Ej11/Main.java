package Ej11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos=new Scanner(System.in);
        int min=0;
        int max=0;
        int posicionMin=0;
        int posicionMax=0;
        int array []= new int[10];
        for(int i=0;i<array.length;i++){
            System.out.print("Introduce un numero:");
            array[i]=datos.nextInt();
        }
        min=array[0];
        max=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
                posicionMin=i+1;
            }
            if(array[i]>max){
                max=array[i];
                posicionMax=i+1;
            }
        }

        for(int i=0;i<array.length;i++){
            System.out.println(array[i]+" ");
        }
        System.out.println("El máximo es: "+max+" y la posición es: "+posicionMax);
        System.out.println("El mínimo es: "+min+" y la posicion es: "+posicionMin);
    }
}
