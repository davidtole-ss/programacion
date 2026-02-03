package Ej01;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> numeros = new HashSet();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(null);
        HashSet<Integer> numeros2 = new HashSet<>();
        for (Integer numero : numeros) {
            if(numero!=null){
                if (numero %2==0) {
                    numeros2.add(numero);
                }
            }
        }
        System.out.println(numeros2);
    }
}
