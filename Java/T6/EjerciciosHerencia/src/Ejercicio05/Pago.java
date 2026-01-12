package Ejercicio05;

public class Pago {
    protected double cantidad;

    public Pago() {
    }

    public Pago(double cantidad) {
        this.cantidad = cantidad;
    }

    public void procesarPago() {
        System.out.println("Procesando pago genérico de " + cantidad + " euros.");
    }

}
