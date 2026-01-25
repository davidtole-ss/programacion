package Ejercicio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println("Introduce una palabra..");
        String palabra = datos.nextLine();
        int cuentaVocales = 0;
        for (int i = 0; i < palabra.length(); i++) {
            switch (palabra.charAt(i)) {
                case 'a', 'A':
                    cuentaVocales++;
                    break;
                case 'e', 'E':
                    cuentaVocales++;
                    break;
                case 'i', 'I':
                    cuentaVocales++;
                    break;
                case 'o', 'O':
                    cuentaVocales++;
                    break;
                case 'u', 'U':
                    cuentaVocales++;
                    break;
            }
        }
        System.out.println(cuentaVocales);


    }
}
