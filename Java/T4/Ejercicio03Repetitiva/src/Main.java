import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        boolean continuar = true;
        while(continuar){
        System.out.println("Introduce una letra");
        String letra = datos.nextLine();
        switch (letra){
            case "a":
                System.out.println("Vocal");
                break;
            case "e":
                System.out.println("Vocal");
                break;
            case "i":
                System.out.println("Vocal");
                break;
            case "o":
                System.out.println("Vocal");
                break;
            case "u":
                System.out.println("Vocal");
                break;
            case" ":
                System.out.println("Saliendo...");
                continuar = false;
                    break;
                default:
                    System.out.println("Consonante");


        }
        }
    }
}
