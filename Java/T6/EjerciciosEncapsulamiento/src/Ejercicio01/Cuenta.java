package Ejercicio01;

public class Cuenta {
    public double saldo;

    public Cuenta() {

    }
    public Cuenta(double saldo) {
        if (saldo>= 0) {
            this.saldo = saldo;
        }else{
            System.out.println("No puede ser negativo.");
        }

    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        }else{
            System.out.println("No puede ser negativo.");
        }
    }
    public void mostrarSaldo(){
        System.out.println("Saldo: " + this.saldo);
    }

}
