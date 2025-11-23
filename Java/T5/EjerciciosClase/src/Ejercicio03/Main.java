package Ejercicio03;

public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto("peonza",3.5,34);
        producto1.mostrarInfromacion();
        producto1.setPrecio(4.5);
        int cantidadVendida=20;
        producto1.vender(cantidadVendida);
        producto1.mostrarInfromacion();


    }
}
