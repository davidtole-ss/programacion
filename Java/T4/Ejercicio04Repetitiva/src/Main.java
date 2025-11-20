import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = datos.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero+"x"+i+"="+numero*i);
        }
    }
}
