package EjemploAbstractVehiculo;

public class Bicicleta extends Vehiculo {
    public Bicicleta() {}
    public Bicicleta(String marca) {
        super(marca);
    }
    @Override
    public void mover() {
        System.out.println("La bicicleta se esta desplazando.");
    }
}
