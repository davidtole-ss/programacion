package Ejercicio06;

public class Nevera extends Electrodomestico {
    public Nevera(String nombre, double consumoPorHora) {
        super(nombre,consumoPorHora);
    }
    public double consumoTotal(int horas){
        double consumoTotal=consumoPorHora*horas*0.8;
        info();
        System.out.println("El consumo total de la nevera en "+horas+" horas: "+consumoTotal+" kWh.");
        return consumoTotal;
    }
    public void info(){
        super.info();

    }
}
