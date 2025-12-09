package Ejercicio02;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println("Introduce un hora con sus horas y minutos.");
        int hora = datos.nextInt();
        int minutos = datos.nextInt();
        System.out.println("Introduce otra hora con sus horas y minutos.");
        int hora2 = datos.nextInt();
        int minutos2 = datos.nextInt();

        LocalTime fin;
        LocalTime inicio;

        if (hora <= hora2) {
            fin = LocalTime.of(hora2, minutos2);
            inicio = LocalTime.of(hora, minutos);
        } else {
            fin = LocalTime.of(hora, minutos);
            inicio = LocalTime.of(hora2, minutos2);

        }
        Duration periodo = Duration.between(inicio, fin);

        long mins = periodo.toMinutes() % 60;


        System.out.println("Duración: " + periodo.toMinutes()/60 + " horas y " + mins + "minutos.");

    }
}
