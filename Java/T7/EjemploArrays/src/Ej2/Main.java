package Ej2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println("Ingresa un numero.");
        int numero = datos.nextInt();
        int medio=(numero+1)/2;
        for(int x=0;x<numero;x++){
            for(int y=0;y<numero;y++){
                if(x==y||y+x==numero-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
