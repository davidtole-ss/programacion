package Ejercicio02;

public class Circulo extends Figura {
    private double radio;
    public Circulo (){}
    public Circulo(double radio) {
        this.radio=radio;
    }
    @Override
    public double area() {
        return Math.PI * radio * radio;
    }
    public void calcularArea(){
        double area=area();
        System.out.println("Area del circulo: "+area);
    }

}
