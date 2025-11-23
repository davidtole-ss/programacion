package Ejercicio03;

public class Termometro {
    private double temperaturaCelsius;

    public Termometro() {

    }

    public Termometro(double temperaturaCelsius) {
        this.temperaturaCelsius = temperaturaCelsius;

    }

    public void setTemperatura(double temperaturaCelsius) {
        this.temperaturaCelsius = temperaturaCelsius;
    }

    public double getTemperaturaCelsius() {
        return temperaturaCelsius;
    }

    public double getTemperaturaFahrenheit(double temperaturaCelsius) {
        temperaturaCelsius=temperaturaCelsius * 9 / 5 + 32;
        return temperaturaCelsius;
    }
}
