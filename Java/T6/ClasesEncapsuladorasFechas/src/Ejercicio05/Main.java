package Ejercicio05;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        boolean correcto = true;
        int empieza1 = 1;
        int empieza2 = 1;
        int acaba1 = 1;
        int acaba2 = 1;
        int posicion = 0;
        int contador = 0;
        int posicion2 = 0;
        String horaReunion = "";

        while (correcto) {
            System.out.println("Introduce a que hora empieza la reunion y a que hora acaba.");
            horaReunion = datos.nextLine();
            if (horaReunion.length() != 0 && horaReunion.length() >= 10) {
                while (posicion2 != -1) {
                    posicion2 = horaReunion.indexOf(":", posicion2);
                    if (posicion2 != -1) {
                        contador++;
                        posicion2 += 1;
                    }
                }
                if (contador == 2) {
                    posicion = horaReunion.indexOf(":");
                    String horaEmpieza1 = horaReunion.substring(posicion - 2, posicion);
                    String horaEmpieza2 = horaReunion.substring(posicion + 1, posicion + 3);
                    posicion += horaEmpieza1.length();
                    posicion = horaReunion.indexOf(":", posicion);
                    String horaAcaba1 = horaReunion.substring(posicion - 2, posicion);
                    String horaAcaba2 = horaReunion.substring(posicion + 1, posicion + 3);
                    empieza1 = Integer.parseInt(horaEmpieza1);
                    empieza2 = Integer.parseInt(horaEmpieza2);
                    acaba1 = Integer.parseInt(horaAcaba1);
                    acaba2 = Integer.parseInt(horaAcaba2);
                    if ((empieza1 >= 0 && empieza1 <= 23 && empieza2 >= 0 && empieza2 <= 59) && (acaba1 >= 0 && acaba1 <= 23 && acaba2 >= 0 && acaba2 <= 59) && (empieza1 <= acaba1)) {
                        if (empieza1 == acaba1) {
                            if (empieza2 <= acaba2) {
                                correcto = false;
                            }
                        } else {
                            correcto = false;
                        }

                    }
                }
            }
        }
        LocalTime horaEmpieza = LocalTime.of(empieza1, empieza2);
        LocalTime horaAcaba = LocalTime.of(acaba1, acaba2);

        Duration duracionReunion = Duration.between(horaEmpieza, horaAcaba);

        long minutos = duracionReunion.toMinutes() % 60;
        String mensaje = String.format("La reunion dura %d horas y %d minutos.", duracionReunion.toHours(), minutos);

        System.out.println(mensaje);


    }
}
