package Treeset;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
        // Crear un HashSet para almacenar nombres
        TreeSet<String> arrNombres = new TreeSet<>();
// Agregar nombres al HashSet
        arrNombres.add("Juan");
        arrNombres.add("Ana");
        arrNombres.add(null);
        arrNombres.add("Luis");
        arrNombres.add("Ana"); // Nombre repetido, no se añadirá de nuevo
// Mostrar los nombres únicos almacenados
        Iterator<String> itr = arrNombres.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println(arrNombres);
        */
        TreeSet <Integer>tree1= new TreeSet();
        tree1.add(1);
        tree1.add(2);
        tree1.add(3);
        System.out.println(tree1);
        TreeSet <Integer>tree2= new TreeSet<Integer>(tree1);
        tree2.add(4);
        System.out.println(tree2);
    }
}
