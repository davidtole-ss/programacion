import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        boolean seguir = true;
        int cuentaIntentos = 1;
        String correcta = "DAM2025";
        String contraseña;

        while (seguir && cuentaIntentos < 4) {
            System.out.println("Ingresa la contraseña.");
            contraseña = datos.nextLine();
            if (contraseña.equals(correcta)) {
                System.out.println("Contrasña correcta.");
                seguir = false;
            } else {
                System.out.println("Contrasña incorrecta.");
                cuentaIntentos++;
            }

        }
    }
}
