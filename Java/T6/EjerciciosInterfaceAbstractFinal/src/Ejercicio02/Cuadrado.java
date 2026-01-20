package Ejercicio02;

public class Cuadrado extends Figura {
    private double l;
    public Cuadrado() {}
    public Cuadrado(double l) {
        this.l = l;
    }
    @Override
    double area() {
        return l * l;
    }
    public void calcularArea(){
        double area=area();
        System.out.println("Area del cuadrado: "+area);
    }

}
