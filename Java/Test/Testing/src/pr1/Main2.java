package pr1;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        int [] numeros={1,2,3,4,5};
        int [] nuevoArray=insertar(numeros,89,4);
        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(nuevoArray));


    }
    public static int [] insertar(int []array,int numero,int posicion){
        int [] nuevo=new int [array.length+1];
        System.arraycopy(array,0,nuevo,0,posicion);
        nuevo[posicion]=numero;
        System.arraycopy(array,posicion,nuevo,posicion+1,array.length-posicion);

        return nuevo;
    }
}
