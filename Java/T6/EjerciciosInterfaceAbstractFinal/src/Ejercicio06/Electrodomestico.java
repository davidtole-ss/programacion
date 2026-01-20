package Ejercicio06;

public abstract class Electrodomestico {
    protected String nombre;
    protected double consumoPorHora;

    public Electrodomestico(String nombre, double consumoPorHora) {
        this.nombre = nombre;
        this.consumoPorHora = consumoPorHora;
    }
    public abstract double consumoTotal(int horas);
    public void info(){
        System.out.println("Nombre del electromestico: "+nombre);
        System.out.println("Consumo por hora del electrodomestico: "+consumoPorHora+" kWh");
    }
}
