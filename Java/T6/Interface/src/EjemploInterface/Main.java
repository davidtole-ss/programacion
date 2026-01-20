package EjemploInterface;

public class Main {
    public static void main(String[] args) {
        Encendible lampara= new Lampara();
        lampara.encender();
        lampara.apagar();
        System.out.println();
        Encendible ordenador= new Ordenador();
        ordenador.apagar();
        ordenador.encender();
        lampara.hola();

    }
}
