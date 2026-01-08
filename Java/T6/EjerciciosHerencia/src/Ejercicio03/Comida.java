package Ejercicio03;

public class Comida extends Producto{
    private String fechaCaducidad;

    public Comida(String nombre,double precio,String fechaCaducidad) {
        super(nombre,precio);
        this.fechaCaducidad=fechaCaducidad;

    }
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Fecha de Caducidad: "+fechaCaducidad);
    }
}
