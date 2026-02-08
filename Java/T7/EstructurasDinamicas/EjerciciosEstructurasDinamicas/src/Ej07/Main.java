package Ej07;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        LinkedHashSet <String> canciones= new LinkedHashSet <>();
        boolean seguir=true;
        while(seguir){
            System.out.println("Ingresa el nombre de una cancion: ");
            String nombre = datos.nextLine();
            if(nombre.equals("FIN")){
                seguir=false;
            }else{
                canciones.add(nombre);
            }
        }
        System.out.println(canciones);
    }
}
