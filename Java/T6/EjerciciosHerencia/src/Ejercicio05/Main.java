package Ejercicio05;

public class Main {
    public static void main(String[] args) {
        Pago pago = new Pago(50);
        pago.procesarPago();
        PagoTarjeta pagoTarjeta = new PagoTarjeta(100);
        pagoTarjeta.procesarPago();
        PagoBizum pagoBizum = new PagoBizum(350);
        pagoBizum.procesarPago();
        PagoPaypal pagoPaypal = new PagoPaypal(250);
        pagoPaypal.procesarPago();
    }
}
