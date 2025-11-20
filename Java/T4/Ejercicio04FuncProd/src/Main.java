import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        boolean resultado;
        System.out.println("Introduce un numero");
        int numero = datos.nextInt();
        resultado = parImpar(numero);
        System.out.println(resultado);
    }

    public static boolean parImpar(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
