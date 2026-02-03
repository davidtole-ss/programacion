package Ej02;

import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<Integer> numeros = new LinkedHashSet<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(null);
        LinkedHashSet<Integer> numeros2 = new LinkedHashSet<>();
        for (Integer numero : numeros) {
            if(numero!=null){
                if (numero %2!=0) {
                    numeros2.add(numero);
                }
            }
        }
        numeros2.removeLast();
        System.out.println(numeros2);

        }
    }

