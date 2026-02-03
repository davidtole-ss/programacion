package numerosImparesArray;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        int array1 []={3,5,2,4,6,9};
        int numeroImpares=0;
        for(int i=0;i<array1.length;i++){
            if(array1[i]%2!=0) {
                numeroImpares++;
            }
        }
        int [] array2= new int[numeroImpares];
        int j=0;
        for(int i=0;i<array1.length;i++){
            if(array1[i]%2!=0){
                array2[j]=array1[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}
