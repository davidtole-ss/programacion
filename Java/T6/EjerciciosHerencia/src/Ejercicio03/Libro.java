package Ejercicio03;

public class Libro extends Producto {
    private String autor;

    public Libro() {
    }

    public Libro(String nombre, double precio, String autor) {
        super(nombre, precio);
        this.autor = autor;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Autor: " + autor);
        super.mostrarInfo();

    }
}
