import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int nota;
        System.out.println("Ingrese su nota: ");
        nota = datos.nextInt();
        if(nota>=0 && nota<=4){
            System.out.println("Suspenso");
        }
        if(nota>=5 && nota<=6){
            System.out.println("Aprobado");
        }
        if(nota>=7 && nota<=8){
            System.out.println("Notable");
        }
        if(nota>=9 && nota<=10){
            System.out.println("Sobresaliente");
        }
    }
}
