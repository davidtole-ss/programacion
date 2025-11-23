package Ejercicio03;

public class Main {
    public static void main(String[] args) {
        Termometro termometro1 = new Termometro(33);
        System.out.println(termometro1.getTemperaturaCelsius());
        double temperaturaFahrenheit=termometro1.getTemperaturaFahrenheit(termometro1.getTemperaturaCelsius());
        System.out.println(temperaturaFahrenheit);
    }
}
