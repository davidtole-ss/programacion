package Ejercicio09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        Libro libro1 = new Libro();
        System.out.println("Ingrese el titulo del libro");
        String titulo = datos.nextLine();
        libro1.setTitulo(titulo);
        System.out.println("Ingrese el autor del libro");
        libro1.setAutor(datos.nextLine());
        libro1.estado();

    }
}
