package Ej09;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner datos=new Scanner(System.in);
        int [] array=new int [20];
        for(int i=0;i<array.length;i++){
            array[i]=(int)(Math.random()*100);
        }
        for(int j=0;j<array.length;j++){
            System.out.print(array[j]+" ");
        }
        System.out.println();
        System.out.println("Introduce el numero que quieres cambiar: ");
        int numCambiar=datos.nextInt();
        System.out.println("Introduce el numero que quieres que lo reemplaze: ");
        int reemplazo=datos.nextInt();
        for(int i=0;i<array.length;i++){
            if(array[i]==numCambiar){
                array[i]=reemplazo;
            }
        }
        for(int numero:array){
            if(numero==reemplazo){
                System.out.print("'"+reemplazo+"' ");
            }else{
                System.out.print(numero+" ");
            }

        }
    }
}
