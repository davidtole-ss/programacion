package Ej2;

public class CuentaBancaria {
    // Atributos
    private String titular;
    private int saldo;

    // Constructor: inicializa titular y saldo en 0
    public CuentaBancaria(String titular, int saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    // Método para depositar dinero
    public void depositarSaldo(int cantidad) {
        if (cantidad >= 0) {
            this.saldo = this.saldo + cantidad;
            System.out.println("Depósito realizado: " + this.saldo +
                    "€");
        } else {
            System.out.println("Cantidad inválida para depósito.");
        }
    }

    // Método para retirar dinero
    public void retirar(int cantidad) {
        if (cantidad >= 0) {
            if (this.saldo >= cantidad) {
                this.saldo -= cantidad;
                System.out.println("Retiro realizado: " + cantidad +
                        " €");
            } else {
                System.out.println("Fondos insuficientes. Saldo actual: " +
                        this.saldo + " €");
            }
        } else {
            System.out.println("Cantidad inválida para retiro.");
        }
    }

    // Método para mostrar saldo
    public void mostrarSaldo() {
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo actual: " + this.saldo + " €");
        System.out.println("---------------------------");
    }
}
