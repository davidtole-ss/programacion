package EjemploInterface;

public class Ordenador implements Encendible {
    @Override
    public void encender() {
        System.out.println("Encendiendo el ordenador.");
    }
    @Override
    public void apagar() {
        System.out.println("Apagando el ordenador.");
    }

}
