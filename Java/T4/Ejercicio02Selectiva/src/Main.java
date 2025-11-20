import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int edad;
        System.out.println("Ingresa tu edad");
        edad = datos.nextInt();

        if(edad>=18){
            System.out.println("Eres mayor de edad.");
        }else{
            System.out.println("Eres menor de edad.");
        }
    }
}
