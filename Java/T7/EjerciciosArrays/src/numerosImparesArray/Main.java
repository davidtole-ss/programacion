package numerosImparesArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int array1 []={3,5,2,4,6,9};
        int  [] array2=new int[array1.length];
        for(int i=0;i<array1.length;i++){
            if(array1[i]%2!=0){
            array2[i]=array1[i];
            }
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}
