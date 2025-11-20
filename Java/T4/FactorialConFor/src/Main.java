import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int factorial=1;
        System.out.println("Ingrese un numero: ");
        int numero = datos.nextInt();
        for (int i = 1; i <= numero; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}
