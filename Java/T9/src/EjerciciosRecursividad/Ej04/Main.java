package EjerciciosRecursividad.Ej04;

public class Main {
    public static void main (String[]args){
    System.out.print(cuentaDigitos(1234));

    }
    public static int cuentaDigitos(int n){
        if(n<=0) return 0;
        return 1 +(cuentaDigitos(n/10));

    }
}
