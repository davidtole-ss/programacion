package Test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int posicionFila;
        boolean correcta = true;

        while (correcta) {
            System.out.println("Ingresa el numero de filas.");
            int fila = datos.nextInt();
            System.out.println("normal o inverso.");
            String tipo = datos.next();
            if (tipo.equals("normal")) {
                posicionFila = fila;
                for (int x = 0; x < fila; x++) {
                    for (int y = 0; y < fila - posicionFila; y++) {
                        System.out.print(" ");
                    }
                    for (int i = fila - posicionFila; i < fila + (fila - posicionFila); i++) {
                        System.out.print("*");
                    }
                    posicionFila--;
                    System.out.println();
                }
                correcta = false;
            } else if (tipo.equals("inverso")) {
                posicionFila = 0;
                for (int x = 0; x < fila; x++) {
                    for (int y = 0; y < fila - posicionFila; y++) {
                        System.out.print(" ");
                    }
                    for (int i = fila - posicionFila; i < fila + (fila - posicionFila); i++) {
                        System.out.print("*");
                    }
                    posicionFila++;
                    System.out.println();
                }
                correcta = false;
            }else{
                System.out.println("Tipo incorrecto.");

            }
        }

    }
}
