import java.util.Scanner;

public class Main {
    public static void main(String[] args) {Scanner datos = new Scanner(System.in);
    int resultado;
    System.out.println("Introduce un numero.");
    int numero = datos.nextInt();
        resultado=dobleNumero(numero);
    System.out.println(resultado);
    }
    public static int dobleNumero(int a){
        return a*2;
    }
}
