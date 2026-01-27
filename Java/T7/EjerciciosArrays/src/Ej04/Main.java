package Ej04;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int numero[] = new int[20];
        int cuadrado[]= new int[20];
        int cubo[]=new int [20];
        for (int i = 0; i < numero.length; i++) {
            numero[i] = (int)(Math.random() * 100);
            cuadrado[i] = numero[i]*numero[i];
            cubo[i] = numero[i]*numero[i]*numero[i];
        }
        System.out.println("Numero "+" Cuadrado "+" Cubo ");
        for (int i = 0; i < numero.length; i++) {
            System.out.println(numero[i]+"  "+cuadrado[i]+"  "+cubo[i]);
        }
    }
}
