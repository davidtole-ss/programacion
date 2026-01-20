package Ejercicio06;

public class Lavadora extends Electrodomestico{
    public Lavadora(String nombre, double consumoPorHora) {
        super(nombre,consumoPorHora);
    }
    public double consumoTotal(int horas){
        double consumoTotal=consumoPorHora*horas*1.2;
        info();
        System.out.println("El consumo total de la lavadora en "+horas+" horas: "+consumoTotal+" kWh.");
        return consumoTotal;
    }
    public void info(){
        super.info();

    }
}
