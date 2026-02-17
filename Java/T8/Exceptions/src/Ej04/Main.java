package Ej04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos= new Scanner(System.in);
        boolean seguir= true;
        int numero=0;
        while(seguir){
            try{
                System.out.println("Introduce números, 0 para salir: ");
                 numero=datos.nextInt();
                if(numero==0){
                    seguir=false;
                }
            } catch (Exception e) {
                System.err.println("¡Cuidado! Solo puedes escribir números enteros.");
                datos.nextLine(); // Limpia lo que el usuario escribió mal
            }
        }
    }
}
