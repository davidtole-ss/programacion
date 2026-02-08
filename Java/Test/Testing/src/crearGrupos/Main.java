package crearGrupos;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] alumnos = {"David", "Pablo", "Juanma", "Oke", "Adam", "Aitor", "Pirry", "Asier", "Machaco", "Angel", "Daka", "Marco"};
        desordenaArray(alumnos);
        String[] grupo1 = new String[4];
        String[] grupo2 = new String[4];
        String[] grupo3 = new String[4];

        for (int i = 0; i < grupo1.length; i++) {
            grupo1[i] = alumnos[i];
        }
        for (int i = 0; i < grupo2.length; i++) {
            grupo2[i] = alumnos[i + grupo2.length];
        }
        for (int i = 0; i < grupo3.length; i++) {
            grupo3[i] = alumnos[i + grupo3.length + grupo3.length];
        }
        System.out.println("Grupos");
        System.out.println(Arrays.toString(grupo1));
        System.out.println(Arrays.toString(grupo2));
        System.out.println(Arrays.toString(grupo3));
    }

    public static void desordenaArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            int azar=(int)(Math.random()*12);
            String nombre=array[i];
            array[i]=array[azar];
            array[azar]=nombre;
        }

    }


}
