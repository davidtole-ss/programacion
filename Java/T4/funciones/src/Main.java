public class Main {
    public static void main(String[] args) {
        String pasoVariable="Hola";
        procedimiento(pasoVariable);
        int num1=5;
        int num2=10;
        int result=sumaNumeros(num1,num2);
        System.out.println(result);
    }

    public static void procedimiento(String pasoVariable) {
        System.out.println(pasoVariable);

    }
    public static int sumaNumeros (int a, int b) {
        return a+b;
    }
}
