import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        boolean continuar=true;
        int numero;
        double cuentaNumeros=0;
        double sumaNumeros=0;
        while (continuar) {
            System.out.println("Introduce un numero.");
            numero = datos.nextInt();
            if (numero>=0) {
                sumaNumeros=sumaNumeros+numero;
                cuentaNumeros++;

            }else  {
                continuar=false;
            }


        }
        System.out.println("La media es: "+sumaNumeros/cuentaNumeros);
    }
}
