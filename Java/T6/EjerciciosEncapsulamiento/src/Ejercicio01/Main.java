package Ejercicio01;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta();
        cuenta1.saldo=-100;
        cuenta1.mostrarSaldo();
        cuenta1.setSaldo(-50);
        cuenta1.setSaldo(100);
        cuenta1.mostrarSaldo();

    }
}
