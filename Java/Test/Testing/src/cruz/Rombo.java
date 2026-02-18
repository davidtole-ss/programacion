package cruz;

import java.util.Scanner;

public class Rombo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la altura (número impar recomendado): ");
        int altura = sc.nextInt();

        // Parte superior (triángulo normal)
        for (int i = 1; i <= altura; i++) {

            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Parte inferior (triángulo invertido SIN repetir la fila central)
        for (int i = altura - 1; i >= 1; i--) {

            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}

