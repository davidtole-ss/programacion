package crearGrupos2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static ArrayList<Integer> numeros = new ArrayList<>();
    public static int contador = 0;
    public static void main(String[] args) {
        String[] alumnos = {"David", "Pablo", "Juanma", "Oke", "Adam", "Aitor", "Pirry", "Asier", "Machaco", "Angel", "Daka", "Marco"};
        String[] grupo = arrayAleatorio(alumnos,2);
        String[] grupo2 = arrayAleatorio(alumnos,2);
        String[] grupo3 = arrayAleatorio(alumnos,2);
        String[] grupo4 = arrayAleatorio(alumnos,2);
        String[] grupo5 = arrayAleatorio(alumnos,2);
        String[] grupo6 = arrayAleatorio(alumnos,2);
        System.out.println("Grupos: ");
        System.out.println(Arrays.toString(grupo));
        System.out.println(Arrays.toString(grupo2));
        System.out.println(Arrays.toString(grupo3));
        System.out.println(Arrays.toString(grupo4));
        System.out.println(Arrays.toString(grupo5));
        System.out.println(Arrays.toString(grupo6));
        System.out.println("contador: "+contador);

    }
    public static String[] arrayAleatorio(String[] alumnos,int tamGrupos) {
        String[] grupo = new String[tamGrupos];
        for (int i = 0; i < grupo.length; i++) {
            boolean seguir = true;
            while (seguir) {
                contador++;
                int azar = (int) (Math.random() * alumnos.length);
                if (!numeros.contains(azar)) {
                    grupo[i] = alumnos[azar];
                    numeros.add(azar);
                    seguir = false;
                }
            }
        }
        return grupo;
    }
}
