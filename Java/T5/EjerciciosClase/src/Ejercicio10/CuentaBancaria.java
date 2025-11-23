package Ejercicio10;

public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria() {

    }

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = 0;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double cantidad) {
        this.saldo += cantidad;
    }

    public void retirar(double cantidad) {
        if (saldo >= cantidad) {
            this.saldo -= cantidad;
        } else {
            System.out.println("Saldo insuficiente.");
        }

    }

    public void mostrarSaldo() {
        System.out.println("Saldo: " + this.saldo);
    }

}
