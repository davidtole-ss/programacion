package Hashset;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashSet<String> objHash=new HashSet<>();
        objHash.add("Miercoles");
        objHash.add("Martes");
        objHash.add("Juan");
        System.out.println(objHash);
        HashSet<String> objHash2=new HashSet<>();
        objHash2.add("Miercoles");
        objHash2.retainAll(objHash);
        System.out.println(objHash2);
    }
}
