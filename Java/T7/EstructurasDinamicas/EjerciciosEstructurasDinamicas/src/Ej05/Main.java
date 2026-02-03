package Ej05;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        HashSet<String> matriculas = new HashSet<String>();
        boolean seguir = true;
        while(seguir){
            System.out.println("Ingrese la matricula: ");
            String matricula = datos.nextLine();
            if(matriculas.contains(matricula)){
                System.out.println("Matrícula repetida: "+matricula);
            }else if(matricula.equals("FIN")){
                System.out.println("FIN");
                seguir = false;
            }else {
                System.out.println("Matricula resgistrada: "+"\n "+matricula);
                matriculas.add(matricula);
            }
        }
        System.out.println("Total de coches únicos: "+matriculas.size());



    }
}
