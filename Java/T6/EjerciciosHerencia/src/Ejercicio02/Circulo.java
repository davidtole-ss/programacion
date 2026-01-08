package Ejercicio02;

public class Circulo extends Figura {
    private double radio;

    public Circulo(String color, double radio){
        super(color);
        this.radio = radio;

    }
    @Override
    public void calcularArea(){
        System.out.println("Circulo: color "+color);
        double area=Math.PI*Math.pow(radio,2);
        String resultado= String.format("Area: %.2f",area);
        System.out.println(resultado);
    }
}
