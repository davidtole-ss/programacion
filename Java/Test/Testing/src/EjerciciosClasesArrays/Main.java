package EjerciciosClasesArrays;

import java.util.*;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        Alumno<Integer> alumno = new Alumno<>("Jorge", "Perez", 34);
        Alumno<Integer> alumno2 = new Alumno<>("Miguel", "Domingo", 20);
        Alumno alumno3 = new Alumno("Pepe", "Lopez", "34");
        Alumno alumno4 = new Alumno("Maria", "Maria", "12");
        ArrayList<Alumno> alumnos = new ArrayList<>();
        alumnos.add(alumno);
        alumnos.add(alumno2);
        alumnos.add(alumno3);
        alumnos.add(alumno4);


        System.out.println(getAlumnos(alumnos));
    }

    public static int getAlumnos(ArrayList<Alumno> alumnos) {
        int suma = 0;
        try {
            for (Alumno alumno : alumnos) {
                int n = parseInt(alumno.getEdad().toString());
                suma += n;
            }
            return suma;
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            return 0;
        }

    }
}
