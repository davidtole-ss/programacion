package Ej07;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
public static void main(String[] args) {
    Scanner datos = new Scanner(System.in);
    int numeros []=new int[10];
    for(int i=0;i<numeros.length;i++){
        System.out.print("Introduce el numero "+(i+1)+": ");
        numeros[i]=datos.nextInt();
    }
    Arrays.sort(numeros);
    for(int i=0;i<numeros.length;i++){
        if(i==0){
            System.out.println("Mínimo: "+numeros[i]);
        }else if(i==numeros.length-1){
            System.out.println("Máximo: "+numeros[i]);
        }else{
            System.out.println(numeros[i]);
        }
    }
}
}
