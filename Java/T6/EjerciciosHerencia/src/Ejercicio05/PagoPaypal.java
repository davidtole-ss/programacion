package Ejercicio05;

public class PagoPaypal extends Pago {
    public PagoPaypal(double cantidad){
        super.cantidad=cantidad;
    }

    public void procesarPago(){
        System.out.println("Procesando pago con Paypal de "+cantidad+" euros");
    }
}
