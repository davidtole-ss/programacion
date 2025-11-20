import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int numero = datos.nextInt();
        if (numero%2==0){
            System.out.println("Numero par");

        }else {
            System.out.println("Numero impar");
        }

    }
}
