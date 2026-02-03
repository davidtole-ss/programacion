package busquedaBinaria;

public class Main {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5};
        int numero=5;
        int posicion=busquedaLineal(array,numero);
        System.out.println(posicion);
        int posicion2=busquedaBinaria(array,numero);
        System.out.println(posicion2);
    }
    public static int busquedaLineal(int [] array,int numero){
        for(int i=0;i<array.length;i++){
            if(array[i]==numero){
                return i;
            }
        }
        return -1;
    }
    public static int busquedaBinaria(int [] array1,int numero){
    int inicio=0;
    int fin=array1.length-1;
    while(inicio<=fin){
        int medio=(inicio+fin)/2;
        if(array1[medio]==numero){
            return medio;
        }else if(array1[medio]<numero){
            inicio=medio+1;
        }else if(array1[medio]>numero){
            fin=medio-1;
        }
    }
    return -1;
    }
}
