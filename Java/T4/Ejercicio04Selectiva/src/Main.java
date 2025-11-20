import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        String cadena;
        System.out.println("Ingrese la contraseña. ");
        cadena = datos.nextLine();

        if(cadena.equals("1234")){
            System.out.println("Acceso concedido");
        }else {
            System.out.println("Acceso denegado.");
        }

    }
}
