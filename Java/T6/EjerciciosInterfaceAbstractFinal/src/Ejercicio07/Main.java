package Ejercicio07;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        RelojDigital digital= new RelojDigital("Casio","Pared",55);
        digital.mostrarInfo();
        digital.incrementarInfinito();

    }
}
