package Ej12;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    ArrayList<Alumno> lista = new ArrayList<Alumno>();
    Alumno alumno1 = new Alumno("Maria", "Silva");
    Alumno alumno2 = new Alumno("Pedro", "Maria Silva");
    lista.add(alumno1);
    lista.add(alumno2);
   for (Alumno alumno : lista) {
       System.out.println(alumno.getNombre()+" "+alumno.getApellido());

   }
   System.out.println();
   lista.set(0, new Alumno("Marcos", "Sanchez"));//Modificamos el primer elemento
        for (Alumno alumno : lista) {
            System.out.println(alumno.getNombre()+" "+alumno.getApellido());

        }


    }
}
