package Ejercicio08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        Rectangulo rectangulo1= new Rectangulo();
        System.out.println("Ingrese la altura del rectangulo");
        double altura = datos.nextDouble();
        rectangulo1.setAlto(altura);
        System.out.println("Ingrese la ancho del rectangulo");
        double ancho = datos.nextDouble();
        rectangulo1.setAncho(ancho);
        double area=rectangulo1.calcularArea();
        System.out.println("El area del rectangulo es: "+area);
        double perimetro=rectangulo1.calcularPerimetro();
        System.out.println("El perimetro del rectangulo es: "+perimetro);

    }



}
