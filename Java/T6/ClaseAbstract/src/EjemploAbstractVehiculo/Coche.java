package EjemploAbstractVehiculo;

public class Coche extends Vehiculo {
    public Coche() {}
    public Coche(String marca) {
        super(marca);
    }
    @Override
    public void mover() {
        System.out.println("El coche se esta desplazando.");
    }
}
