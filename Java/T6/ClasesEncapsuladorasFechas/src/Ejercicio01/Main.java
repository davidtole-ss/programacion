package Ejercicio01;


import java.time.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println("Introduce tu fecha de nacimiento:");
        System.out.println("Año: ");
        int anio = datos.nextInt();
        System.out.println("Mes: ");
        int mes = datos.nextInt();
        System.out.println("Dia: ");
        int dia = datos.nextInt();

        LocalDate añoNacimiento=LocalDate.of(anio,mes,dia);
        LocalDate añoActual=LocalDate.now();
        Period period= Period.between(añoNacimiento,añoActual);

        System.out.println("Tienes "+period.getYears()+" años, "+period.getMonths()+" meses y "+period.getDays()+" dias.");


    }
}
