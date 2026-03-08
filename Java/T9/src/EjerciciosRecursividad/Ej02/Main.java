package EjerciciosRecursividad.Ej02;

public class Main {
    public static void main(String[] args) {

    contarAscendente(8);
    }

    public static void contarAscendente(int n){
        if(n<1){
            return;
        }
        contarAscendente(n-1);
        System.out.println(n);
    }
}
