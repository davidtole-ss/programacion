public class Testeo {
    public static void main(String[] args) {
        int number = 42;
        String result = String.format("El número es: %d", number);
        System.out.println(result);

        double pi = 3.14159;
        String result2 = String.format("El valor de pi es: %f", pi);
        System.out.println(result2);

        String name = "Juan";
        String result3 = String.format("Hola %-10s!", name);
        System.out.println(result3);

        String name2 = "Ana";
        int age = 25;
        String result4 = String.format("Nombre: %d, Edad: %d", name2, age);
        System.out.println(result4);

        String result5 = String.format("Primero: %1$s, Segundo: %2$d, Primero otra vez: %1$s", "Hola", 42);
        System.out.println(result5);

    }
}
