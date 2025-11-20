import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        double resultado;
        System.out.println("Introduce la base del triandulo.");
        double base = datos.nextDouble();
        System.out.println("Introduce la altura del triandulo.");
        double altura = datos.nextDouble();
        resultado = (areaTriangulo(base, altura));
        System.out.println("El area del triangulo es: " + resultado);

    }
    public static double areaTriangulo(double base, double altura){
        return (base * altura)/2;

    }
}
