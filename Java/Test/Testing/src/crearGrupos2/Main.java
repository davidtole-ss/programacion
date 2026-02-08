package crearGrupos2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static ArrayList<Integer> numeros = new ArrayList<>();
    public static void main(String[] args) {
        String[] alumnos = {"David", "Pablo", "Juanma", "Oke", "Adam", "Aitor", "Pirry", "Asier", "Machaco", "Angel", "Daka", "Marco"};
        String[] grupo = arrayAleatorio(alumnos,4);
        String[] grupo2 = arrayAleatorio(alumnos,4);
        String[] grupo3 = arrayAleatorio(alumnos,4);
        System.out.println("Grupos: ");
        System.out.println(Arrays.toString(grupo));
        System.out.println(Arrays.toString(grupo2));
        System.out.println(Arrays.toString(grupo3));

    }
    public static String[] arrayAleatorio(String[] array,int tamGrupos) {
        String[] grupo = new String[tamGrupos];
        for (int i = 0; i < grupo.length; i++) {
            boolean seguir = true;
            while (seguir) {
                int azar = (int) (Math.random() * array.length);
                if (!numeros.contains(azar)) {
                    grupo[i] = array[azar];
                    numeros.add(azar);
                    seguir = false;
                }
            }
        }
        return grupo;
    }
}
