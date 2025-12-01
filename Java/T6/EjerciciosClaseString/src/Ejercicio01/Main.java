package Ejercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int contador = 0;
        Scanner datos = new Scanner(System.in);
        System.out.println("Introduce una palabra.");
        String cadena1=datos.nextLine();
        System.out.println("Introduce otra palabra.");
        String cadena2=datos.nextLine();

        if(cadena1.equals(cadena2)){
            System.out.println("Las palabras son iguales");
        }
        else{
            for(int i=0;i<cadena1.length();i++){
                if(cadena1.charAt(i)==cadena2.charAt(i)){
                }else{
                    contador++;
                    System.out.println(contador+"ª Diferencia en la posicion : "+i);
                    System.out.println("Cadena 1: "+cadena1.charAt(i));
                    System.out.println("Cadena 2: "+cadena2.charAt(i));
                }
            }
        }
    }
}
