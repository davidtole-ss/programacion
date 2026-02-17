package Ejemplo1;

public class Animal {
    private String nombre;
    private int numPatas;

    public Animal() {

    }

    public Animal(String nombre, int numPatas) {
        this.nombre = nombre;
        this.numPatas = numPatas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public void hacerSonido() {
        System.out.println("Hacer sonido.");

    }public void hacerSonidos() {
        System.out.println("Hacer sonido.");

    }

}
