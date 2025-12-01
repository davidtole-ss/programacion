package Ej2;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// Introducir datos del titular
        System.out.print("Introduce el nombre del titular: ");
        String titular = sc.nextLine();
// Crear objeto CuentaBancaria
        CuentaBancaria objcuenta = new CuentaBancaria(titular, 100);
// Mostrar saldo inicial
        System.out.println("\nEstado inicial de la cuenta:");
        objcuenta.mostrarSaldo();
// Depositar dinero
        System.out.print("Introduce cantidad a depositar: ");
        int deposito = sc.nextInt();
        objcuenta.depositarSaldo(deposito);
        objcuenta.mostrarSaldo();
// Retirar dinero
        System.out.print("Initroduce cantidad a retirar: ");
        int retiro = sc.nextInt();
        objcuenta.retirar(retiro);
        objcuenta.mostrarSaldo();
        sc.close();
    }
}
