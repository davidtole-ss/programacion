package Excepciones1.Ej07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println("Introduce una contraseña.");
        String contraseña = datos.nextLine();

        try {
            validarContraseña(contraseña);
            System.out.println("SYSTEMA: [CONTRASEÑA SEGURA ESTABLECIDA]");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
    public static void validarContraseña(String contrasenia) {
        if (contrasenia.length() < 8) {
            throw new IllegalArgumentException("Error: La contraseña debe contener al menos 8 caracteres.");
        }
        boolean mayus = false;
        boolean minus = false;
        boolean num = false;
        boolean espacios = false;
        boolean caracterEspecial = false;

        for (int x = 0; x < contrasenia.length(); x++) {
            char c = contrasenia.charAt(x);
            if (Character.isUpperCase(c)) {
                mayus = true;
            }
            if (Character.isLowerCase(c)) {
                minus = true;
            }
            if (Character.isDigit(c)) {
                num = true;
            }
            if (!Character.isLetter(c) && !Character.isDigit(c) && c != ' ') {
                caracterEspecial = true;
            }
            if (c == ' ') {
                espacios = true;
            }
        }
        if (espacios) {
            throw new IllegalArgumentException("Error: La contraseña no puede contener espacios.");
        } else if (!mayus) {
            throw new IllegalArgumentException("Error: La contraseña debe contener al menos 1 mayúscula.");
        } else if (!minus) {
            throw new IllegalArgumentException("Error: La contraseña debe contener al menos 1 minúscula.");
        } else if (!num) {
            throw new IllegalArgumentException("Error: La contraseña debe contener al menos 1 número.");
        } else if (!caracterEspecial) {
            throw new IllegalArgumentException("Error: La contraseña debe contener al menos 1 carácter especial.");
        }
    }
}