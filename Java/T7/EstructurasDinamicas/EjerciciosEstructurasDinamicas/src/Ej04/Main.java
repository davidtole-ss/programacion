package Ej04;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner datos = new Scanner(System.in);
    HashSet<String> nombres = new HashSet<>();
    boolean seguir = true;
    while(seguir){
        System.out.println("Ingresa un nombre:");
        String nombre = datos.nextLine();
        if(nombre.equals("FIN")){
        seguir = false;
        }else{
            nombres.add(nombre);
        }
    }
    System.out.println(nombres);

    }
}
