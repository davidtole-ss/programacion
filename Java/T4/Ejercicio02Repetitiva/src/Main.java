import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int contador=1;
        int numero;
        System.out.println("Introduce un numero");
        int factorial = datos.nextInt();
        numero=factorial;

        while(contador<numero){
            factorial = factorial*contador;
            contador++;

        }
        System.out.println(factorial);
    }
}
