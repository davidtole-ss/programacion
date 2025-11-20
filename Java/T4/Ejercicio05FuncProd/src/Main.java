import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println("Introduce un numero.");
        int num = datos.nextInt();
        tablaMultiplicar(num);

    }

    public static void tablaMultiplicar(int numero){
        for(int i=1;i<=10;i++){
            System.out.println(numero+"x"+i+"="+numero*i);
        }

    }
}
