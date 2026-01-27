package EliminarElementoArray;
import java.util.*;
public class Main2 {
    public static String[] eliminarElemento (String[] array, int posicion){
        String [] nuevoArray= new String[array.length-2];
        System.arraycopy(array, 0, nuevoArray, 0, posicion);
        System.arraycopy(array, posicion+2, nuevoArray, posicion, nuevoArray.length-posicion);
        return nuevoArray;
    }
    public static void main (String[] args) {
        String [] arrayEjemplo = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
        int posicion = 2;
        System.out.println("Array original: " + Arrays.toString(arrayEjemplo));
        arrayEjemplo= eliminarElemento(arrayEjemplo, posicion);
        System.out.println("Array quitando un elemento: " + Arrays.toString(arrayEjemplo));
    }
}
