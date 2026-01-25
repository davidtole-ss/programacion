package Ejemplo03;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] ejemploArray = {1,2,3,4};

        ejemploArray = sumaArray(ejemploArray);
        for(int numero : ejemploArray){
            System.out.println(numero);
        }
    }
    public static int [] sumaArray(int [] array){

        for(int x=0;x<array.length;x++){
            array[x]+=1;
        }
        return array;
    }

}
