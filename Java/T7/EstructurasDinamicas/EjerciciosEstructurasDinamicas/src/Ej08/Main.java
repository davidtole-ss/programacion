package Ej08;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeSet<Double> notas = new TreeSet<Double>();
        Scanner datos = new Scanner(System.in);
        boolean seguir = true;
        while(seguir){
            System.out.println("Introduce una nota: ");
            String notaString =datos.nextLine();
            if(notaString.equals("FIN")){
                seguir = false;
            }else{
                Double numeroDouble = Double.parseDouble(notaString);
                notas.add(numeroDouble);
            }
        }
        System.out.println(notas);
    }
}
