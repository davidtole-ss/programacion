package EjerciciosRecursividad.Ej03;

public class Main {
    public static void main(String[] args) {
        contarDescendente(5);

    }

    public static void contarDescendente(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        contarDescendente(n - 1);
    }
}
