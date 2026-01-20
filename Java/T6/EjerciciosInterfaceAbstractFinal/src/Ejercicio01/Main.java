package Ejercicio01;

public class Main {
    public static void main(String[] args) {
        Encendible r1= new Radio();
        r1.encender();
        r1.apagar();
        Encendible l1= new Lampara();
        l1.encender();
        l1.apagar();
    }
}
