package Excepciones2.Ej01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner datos = new Scanner(System.in);

        System.out.println("Introduce el primer número:");
        double a = datos.nextDouble();

        System.out.println("Introduce el segundo número:");
        double b = datos.nextDouble();

        try {
            double resultado = dividir(a, b);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }
    }

    public static double dividir(double a, double b) {

        if (b == 0||a==0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }

        return a / b;
    }
}
