import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String nombre = datos.nextLine();
        personalizado(nombre);
    }

    public static void personalizado(String nombre) {
        System.out.println("Hola " + nombre + " ¡bienvenido a PSeInt!");
    }
}
