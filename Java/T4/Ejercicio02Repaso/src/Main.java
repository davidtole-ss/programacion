import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int nota;
        double sumaNotas=0;
        for(int i=1;i<=5;i++){
            System.out.println("Introduce la nota.");
            nota = datos.nextInt();
            sumaNotas=sumaNotas+nota;

        }
        System.out.println("La media de las notas es: "+sumaNotas/5);
    }
}
