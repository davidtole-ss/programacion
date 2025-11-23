package Ejercicio05;

public class Main {
    public static void main(String[] args) {
        Rectangulo r1=new Rectangulo();
        r1.setAlto(3.5);
        r1.setAncho(7.5);
        double area=r1.getArea();
        System.out.println("Area: "+area);
        r1.setAncho(15);
        area=r1.getArea();
        System.out.println("Area: "+area);
    }
}
