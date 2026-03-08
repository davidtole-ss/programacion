package generico.EjercicioClase;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Alumno> alumnos = new ArrayList<>();
        Alumno <Integer>a1 = new Alumno<>("Mario","Perez","BBDD",9);
        Alumno <Double>a2 = new Alumno<>("Felipe","Jimenez","Programacion",8.0);
        Alumno <Double>a3 = new Alumno<>("Manuel","Sanchez","Ingles",7.0);
        alumnos.add(a1);
        alumnos.add(a2);
        alumnos.add(a3);

        ArrayList<String> nombres = new ArrayList<>();

        for (Alumno alumno : alumnos) {
            nombres.add(alumno.getNombre());
        }
        ArrayList<String> apellidos = new ArrayList<>();
        for (Alumno alumno : alumnos) {
            apellidos.add(alumno.getApellido());
        }
        ArrayList<String> asignaturas = new ArrayList<>();
        for (Alumno alumno : alumnos) {
            asignaturas.add(alumno.getAsignatura());
        }
        ArrayList<Double> notas = new ArrayList<>();
        for (Alumno alumno : alumnos) {
            notas.add((Double)alumno.getNota());
        }

        System.out.println("Alumnos de la lista:");
        System.out.printf("%-15s","Nombres: ");
        for (Alumno alumno : alumnos) {
            System.out.printf("%-15s",alumno.getNombre());
        }
        System.out.println();
        System.out.printf("%-15s","Apellidos: ");
        for (Alumno alumno : alumnos) {
            System.out.printf("%-15s",alumno.getApellido());
        }
        System.out.println();
        System.out.printf("%-15s","Asignatura: ");
        for (Alumno alumno : alumnos) {
            System.out.printf("%-15s",alumno.getAsignatura());
        }
        System.out.println();
        System.out.printf("%-15s","Nota: ");
        for (Alumno alumno : alumnos) {
            System.out.printf("%-15s",alumno.getNota());
        }


/*
for (int i = 0; i < 3; i++) {
            System.out.println("Alumno " + (i + 1));

            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Apellido: ");
            String apellido = sc.nextLine();

            System.out.print("Asignatura: ");
            String asignatura = sc.nextLine();

            System.out.print("Nota: ");
            Double nota = sc.nextDouble();
            sc.nextLine(); // limpiar buffer

            alumnos.add(new Alumno(nombre, apellido, asignatura, nota));
        }
* */

    }
}
