package Ejercicio04;

import java.util.Scanner;
import java.time.*;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        boolean correcto = true;
        String fecha = "";
        int dia1 = 0;
        int mes1 = 0;
        int anio1 = 0;
        int añoActual = Year.now().getValue();
        while (correcto) {
            System.out.println("Introduce una fecha en formato dd/MM/yyyy (DIA/MES/AÑO).");
            fecha = datos.nextLine();
            if ((fecha.length() == 10 || fecha.length() == 9 || fecha.length() == 8) && fecha.indexOf(" ") == -1 && fecha.indexOf("/") != -1) {
                int posicionFrase = 0;
                int posicionDia = fecha.indexOf("/", posicionFrase);
                String dia = fecha.substring(posicionFrase, posicionDia);
                posicionFrase = posicionFrase + dia.length() + 1;
                int posicionMes = fecha.indexOf("/", posicionFrase);
                String mes = fecha.substring(posicionFrase, posicionMes);
                posicionFrase = posicionFrase + mes.length() + 1;
                String anio = fecha.substring(posicionFrase, fecha.length());
                dia1 = Integer.parseInt(dia);
                mes1 = Integer.parseInt(mes);
                anio1 = Integer.parseInt(anio);
                if ((dia1 >= 1 && dia1 <= 31) && (mes1 >= 1 && mes1 <= 12) && (anio1 <= añoActual)) {
                    correcto = false;
                } else {
                    correcto = true;
                }
            } else {
                System.out.print("Error: ");
                correcto = true;
            }
        }


        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(anio1, mes1, dia1);

        String resultado = String.format("La fecha introducida es: %d-%d-%d", dia1, mes1, anio1);
        System.out.println(resultado);

        if (today.equals(birthDate)) {
            System.out.println("La fecha coincide con la actual.");

        } else {
            System.out.println("La fecha No coincide con la actual.");

        }


    }
}
