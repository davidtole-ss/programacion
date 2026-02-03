package Treeset;

import java.util.*;

public class Main {
    public static void main(String[] args) {
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
    }
}
