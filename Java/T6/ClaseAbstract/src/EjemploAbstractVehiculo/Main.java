package EjemploAbstractVehiculo;

public class Main {
    public static void main(String[] args) {
        Vehiculo v1= new Coche("Seat");
        v1.mover();
        v1.mostrarInfo();
        Bicicleta b3 = new Bicicleta("Mountain bike");
        b3.mover();
        b3.mostrarInfo();
    }
}