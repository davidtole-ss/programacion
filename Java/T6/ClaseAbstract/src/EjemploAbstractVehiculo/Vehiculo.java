package EjemploAbstractVehiculo;

public abstract class Vehiculo {
    String marca;
    public Vehiculo() {}
    public Vehiculo(String marca) {
        this.marca = marca;
    }
    public abstract void mover();
    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
    }


}
