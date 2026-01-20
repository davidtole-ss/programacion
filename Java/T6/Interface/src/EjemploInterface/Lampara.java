package EjemploInterface;

public class Lampara implements Encendible {
    @Override
    public void encender() {
        System.out.println("Encendiendo la lampara.");
    }
    @Override
    public void apagar() {
        System.out.println("Apagando la lampara.");
    }
}
