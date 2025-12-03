package Ejercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos=new Scanner(System.in);
        System.out.println("Introduce el precio del producto.");
        double precio=datos.nextDouble();
        String resultado=String.format("El precio es: %.2f€.",precio);
        System.out.println(resultado);
    }
}
