package Ej11;

import Ej12.Alumno;

import java.util.ArrayList;
import java.util.HashSet;


public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);
        for (Integer integer : hashSet) {
            System.out.println(integer);
        }
        System.out.println();
        ArrayList<Integer> arrayList = new ArrayList<>(hashSet);
        for (Integer numero : arrayList) {
            System.out.println(numero);
        }

    }
}
