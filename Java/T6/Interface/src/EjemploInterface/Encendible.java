package EjemploInterface;

public interface Encendible {
    void encender();

    void apagar();

    int numero = 3;

    default void hola() {
        System.out.println("Hola!");
    }
}
