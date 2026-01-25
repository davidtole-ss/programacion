package Ejemplo06;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        String [] alumnos = {"Paco","Pedro","Miguel","Marcos"};
        System.out.println("Array sin ordenar: " + Arrays.toString(alumnos));
        Arrays.sort(alumnos);
        System.out.println("Array ordenado: " + Arrays.toString(alumnos));
        int posicion =Arrays.binarySearch(alumnos, "Miguel");
        System.out.println("Se ha encontrado en la posición: " + posicion);

    }
}
