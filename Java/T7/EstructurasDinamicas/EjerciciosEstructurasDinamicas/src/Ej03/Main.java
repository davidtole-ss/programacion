package Ej03;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> numeros = new TreeSet<>();
        int suma = 0;
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(9);
        numeros.add(10);
        for(Integer numero : numeros){
            suma+=numero;
        }
        System.out.println(suma);
    }
}
