package recursividad;

public class Main {
    public static void main(String[] args) {
        int factorial=factorial(5);
        System.out.print(factorial);
    }
    public static int factorial(int n) {
        if (n == 0) {          // Caso base
            return 1;
        }
        return n * factorial(n - 1);   // Caso recursivo
    }
}
