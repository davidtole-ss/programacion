package LinkedHashset;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<String> arrNombres = new LinkedHashSet<>();
    // Agregar nombres al HashSet
        arrNombres.add("Juan");
        arrNombres.add("Ana");
        arrNombres.add(null);
        arrNombres.add("Luis");
        arrNombres.add("Ana"); // Nombre repetido, no se añadirá de nuevo
    // Mostrar los nombres únicos almacenados
        for (String arrNombre : arrNombres) {
            System.out.println(arrNombre);
        }
    }
}
