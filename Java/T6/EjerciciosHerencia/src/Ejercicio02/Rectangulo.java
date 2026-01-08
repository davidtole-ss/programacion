package Ejercicio02;

public class Rectangulo extends Figura{
    private double ancho;
    private double alto;

    public Rectangulo(String color, double ancho, double alto){
        super(color);
        this.ancho = ancho;
        this.alto = alto;
    }
    @Override
    public void calcularArea(){
        System.out.println("Rectangulo: color "+color);
        double area = ancho*alto;
        String resultado= String.format("Area: %.2f",area);
        System.out.println(resultado);
    }

}
