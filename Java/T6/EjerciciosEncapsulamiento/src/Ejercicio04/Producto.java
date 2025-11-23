package Ejercicio04;

public class Producto {
    private double precio;

    public Producto() {
    }
    public Producto(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public double getPrecioConIva() {
        return precio=precio+(precio* 0.21);
    }
}
