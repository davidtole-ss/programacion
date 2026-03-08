package EjerciciosRecursividad.Ej01;

public class Main {
    public static void main(String[] args) {
        int resultado = sumaNumeros(5);
        System.out.println(resultado);
        System.out.println(factorial(5));
    }

    public static int sumaNumeros(int n) {
        if (n == 0) {
            return n;
        } else {
            return n + sumaNumeros(n - 1);
        }
    }
    public static int factorial(int n) {
        if (n == 1) {
            return n;
        } else {
            return n * factorial(n - 1);
        }
    }
}
