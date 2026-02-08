package Ej06;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        LinkedList<String> historial = new LinkedList<String>();
        boolean seguir = true;
        while(seguir){
            System.out.println("Introduce un término de búsqueda: ");
            String elemento=datos.nextLine();
            if(elemento.equals("FIN")){
                seguir = false;
            }else{
                historial.add(elemento);
            }
        }
        System.out.println("Historial de búsqueda: "+"\n"+historial);
    }
}
