import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int intentos = 0;
        boolean seguir = true;
        int opcion;
        int pin = 1234;
        int introducirPin;
        int ingreso;
        int retirarDinero;
        int saldo = 1000;
        while (intentos < 3) {
            System.out.println("Introduce el pin.");
            introducirPin = datos.nextInt();
            if (introducirPin == 1234) {
                while (seguir) {
                    System.out.println("¿Que operacion deseas realizar?");
                    System.out.println("1.Consultar saldo");
                    System.out.println("2.Ingresar dinero");
                    System.out.println("3.Retirar dinero");
                    System.out.println("4.Salir");
                    opcion = datos.nextInt();
                    switch (opcion) {
                        case 1:
                            System.out.println("Tu saldo es: " + saldo);
                            break;
                        case 2:
                            System.out.println("¿Cuanto deseas ingresar?");
                            ingreso = datos.nextInt();
                            saldo = saldo + ingreso;
                            break;
                        case 3:
                            System.out.println("¿Cuanto deseas retirar?");
                            retirarDinero = datos.nextInt();
                            saldo = saldo - retirarDinero;
                            break;
                        case 4:
                            seguir = false;
                            intentos = 3;
                            break;
                    }


                }
            } else {
                System.out.println("Pin incorrecto.");
                intentos++;
            }
            if (intentos == 3) {
                System.out.println("Numero máximo de intentos alcanzado.");

            }


        }
    }
}
