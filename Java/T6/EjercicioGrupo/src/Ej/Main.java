package Ej;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Alumno alumno = new Alumno();
        int opciones;
        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Insertar Alumno");
            System.out.println("2. Modificar Alumno");
            System.out.println("3. Eliminar Alumno");
            System.out.println("4. Mostrar Alumno");
            System.out.println("5. Calcular Nota Final");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            opciones = sc.nextInt();
            sc.nextLine(); // limpiar buffer
            switch (opciones) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Asignatura: ");
                    String asignatura = sc.nextLine();
                    System.out.print("Nota Parcial 1: ");
                    double p1 = sc.nextDouble();
                    System.out.print("Nota Parcial 2: ");
                    double p2 = sc.nextDouble();
                    System.out.print("Nota Exposición: ");
                    double expo = sc.nextDouble();
                    System.out.print("Nota Ejercicios: ");
                    double ejer = sc.nextDouble();
                    System.out.print("Nota Trabajos: ");
                    double trab = sc.nextDouble();
                    alumno.insertarRegistro(nombre, asignatura,
                            p1, p2, expo, ejer, trab);
                    break;
                case 2:
                    System.out.println("Modificando datos...");
                    System.out.print("Nuevo Nombre: ");
                    nombre = sc.nextLine();
                    System.out.print("Nueva Asignatura: ");
                    asignatura = sc.nextLine();
                    System.out.print("Nota Parcial 1: ");
                    p1 = sc.nextDouble();
                    System.out.print("Nota Parcial 2: ");
                    p2 = sc.nextDouble();
                    System.out.print("Nota Exposición: ");
                    expo = sc.nextDouble();
                    System.out.print("Nota Ejercicios: ");
                    ejer = sc.nextDouble();
                    System.out.print("Nota Trabajos: ");
                    trab = sc.nextDouble();
                    alumno.modificarRegistro(nombre, asignatura,
                            p1, p2, expo, ejer, trab);
                    break;
                case 3:
                    alumno.eliminarRegistro();
                    System.out.println("Registro eliminado.");
                    break;
                case 4:
                    alumno.mostrarDatos();
                    break;
                case 5:
                    System.out.println("Nota Final: " +
                            alumno.calcularNotaPrimeraEvaluacion());
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opciones!= 6);
        sc.close();
    }
}
