package Ejercicio10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        CuentaBancaria cuenta1 = new CuentaBancaria();
        boolean seguir = true;
        System.out.println("Ingresa al titular de la cuenta.");
        String titular = datos.nextLine();
        cuenta1.setTitular(titular);
        System.out.println("Ingresa el saldo de la cuenta.");
        double saldo = datos.nextDouble();
        cuenta1.setSaldo(saldo);
        cuenta1.mostrarSaldo();
        while(seguir){
            System.out.println("¿Que opcion desea realizar?");
            System.out.println("1.Ingresar.");
            System.out.println("2.Retirar.");
            System.out.println("3.Mostrar saldo.");
            System.out.println("4.Salir.");
            int opcion = datos.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Ingresa la cantidad para ingresar:");
                    int cantidad = datos.nextInt();
                    cuenta1.depositar(cantidad);
                    break;
                case 2:
                    System.out.println("Ingresa la cantidad para retirar:");
                    int cantidadRetirada = datos.nextInt();
                    cuenta1.retirar(cantidadRetirada);
                    break;
                case 3:
                    cuenta1.mostrarSaldo();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    seguir = false;
                    break;
            }
        }

    }
}
