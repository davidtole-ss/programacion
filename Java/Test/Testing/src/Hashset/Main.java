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
        Integer [] array={1,2,4,5};
        ArrayList<Integer> objArrayList=new ArrayList<>(Arrays.asList(array));
        objArrayList.toArray(array);
        objArrayList.add(2,3);
        Integer[]num=new Integer[objArrayList.size()];
        objArrayList.toArray(num);
        System.out.println(objArrayList);



        Integer[] num2=new Integer[objArrayList.size()];
        objArrayList.toArray(num2);
        System.out.println(Arrays.toString(num2));






    }
}
