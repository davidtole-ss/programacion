package Ejercicio03;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;
    public Producto() {

    }
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void modificarPrecio(double nuevoPrecio){
    this.precio=nuevoPrecio;
    }

    public void vender(int cantidadVendida){
        if(cantidadVendida>this.cantidad){
            System.out.println("Falta stock");
        }else {
            System.out.println("Éxito");
            this.cantidad=this.cantidad-cantidadVendida;
        }
    }

    public void mostrarInfromacion(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Precio: "+this.precio);
        System.out.println("Cantidad:"+this.cantidad);

    }


}
