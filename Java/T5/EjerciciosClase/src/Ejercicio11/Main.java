package Ejercicio11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        Automovil coche1 = new Automovil();
        System.out.println("Introduce los atributos del coche:");
        System.out.println("Marca: ");
        String marca = datos.nextLine();
        coche1.setMarca(marca);
        System.out.println("Modelo: ");
        String modelo = datos.nextLine();
        coche1.setModelo(modelo);
        System.out.println("Motor: ");
        double motor = datos.nextDouble();
        coche1.setMotor(motor);
        System.out.println("Número de puertas: ");
        int numeroPuertas = datos.nextInt();
        coche1.setNumeroPuertas(numeroPuertas);
        System.out.println("Cantidad de asientos: ");
        int cantidadAsientos = datos.nextInt();
        coche1.setCantidadAsientos(cantidadAsientos);
        System.out.println("Velocidad máxima: ");
        int velocidadMaxima = datos.nextInt();
        coche1.setVelocidadMaxima(velocidadMaxima);
        System.out.println("Velocidad actual: ");
        int velocidadActual = datos.nextInt();
        coche1.setVelocidadActual(velocidadActual);

        coche1.mostrarInfo();

        coche1.tiempoDeLlegada(420);

        coche1.setVelocidadActual(100);
        velocidadActual = coche1.getVelocidadActual();
        System.out.println("La velocidad actual es: " + velocidadActual + " km/h.");
        coche1.acelerar(20);
        velocidadActual = coche1.getVelocidadActual();
        System.out.println("La velocidad actual es: " + velocidadActual + " km/h.");
        coche1.desacelerar(50);
        velocidadActual = coche1.getVelocidadActual();
        System.out.println("La velocidad actual es: " + velocidadActual + " km/h.");
        coche1.frenar();
        velocidadActual = coche1.getVelocidadActual();
        System.out.println("La velocidad actual es: " + velocidadActual + " km/h.");


    }
}
