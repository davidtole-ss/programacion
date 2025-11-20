import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        boolean continuar = true;
        int contadorPrimo;
        while (continuar) {
            contadorPrimo = 0;
            System.out.println("Ingrese un numero.");
            int num = datos.nextInt();
            if (num > 0) {
                for (int i = 1; i < num + 1; i++) {
                    if (num % i == 0) {
                        contadorPrimo++;
                    }
                }
                if (contadorPrimo > 2) {
                    System.out.println("No es un numero primo.");
                } else {
                    System.out.println("Numero primo.");
                }
            } else {
                continuar = false;
            }

        }
    }
}
