package Ejercicio05;

public class PagoBizum extends Pago{

    public PagoBizum(double cantidad){
        super.cantidad=cantidad;
    }

    public void procesarPago(){
        System.out.println("Procesando pago con Bizum de "+cantidad+" euros");
    }
}
