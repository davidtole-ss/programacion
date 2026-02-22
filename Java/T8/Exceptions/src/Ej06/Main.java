package Ej06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos= new Scanner(System.in);
        System.out.println("Introduce una temperatura en grados celsius.");
        double gradosCelsius= datos.nextInt();
        convertirTemperatura(gradosCelsius);

    }
    public static void convertirTemperatura(double temperatura){
        try{
            if(temperatura<=-273.15){
                throw new Exception("Los grados celsius no pueden estar por debajo de -273.15.");
            }
            double fh=(temperatura * 9 / 5) + 32;
            System.out.printf("%.2f grados celsius son %.2f grados Fahrenheit.",temperatura,fh);
        }catch(Exception e){
            System.out.println(e.getMessage());


        }
    }
}
