package EjerciciosRecursividad;

public class Ejemplo {
    public static void main(String[] args) {
        funcionRecursiva(5);
    }

    public static void funcionNoRecursiva(int n){
        for(int i=n;i>0;i--){
            System.out.println(i);
        }
    }
    public static void funcionRecursiva(int n){
        if(n==0){
            System.out.println("0");
        }else{
            funcionRecursiva(n-1);
            System.out.println(n);
        }
    }
}
