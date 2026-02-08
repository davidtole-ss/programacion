package Ej10;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> notas = new ArrayList<Integer>();
        notas.add(1);
        notas.add(2);
        notas.add(3);
        notas.add(4);
        notas.add(5);
        notas.add(6);
        notas.add(7);
        ArrayList<Integer> numerosPares = new ArrayList<>();
        for(Integer nota : notas){
            if(nota%2==0){
                numerosPares.add(nota);
            }
        }
        System.out.println(numerosPares);
    }
}
