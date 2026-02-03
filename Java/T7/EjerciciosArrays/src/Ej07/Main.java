package Ej07;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos=new Scanner(System.in);
        int min=0;
        int max=0;
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
            }
            if(array[i]>max){
                max=array[i];
            }
        }
        for(int i=0;i<array.length;i++){
            if(array[i]==min){
                System.out.println(array[i]+" Mínimo");
            }else if(array[i]==max){
                System.out.println(array[i]+" Máximo");
            }else{
                System.out.println(array[i]);
            }
        }

    }
}
