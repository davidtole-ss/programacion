import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int numero;
        int cuentaNegativos=0;
        for(int i=1;i<=10;i++){
            System.out.println("Introduce un numero");
            numero = datos.nextInt();
            if(numero<0){
                cuentaNegativos++;
            }

        }
        System.out.println("Has introducido "+cuentaNegativos+" numeros negativos.");
    }
}
