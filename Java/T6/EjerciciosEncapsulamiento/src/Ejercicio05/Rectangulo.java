package Ejercicio05;

public class Rectangulo {
    private double ancho;
    private double alto;

    public Rectangulo(){

    }
    public Rectangulo(double ancho, double alto) {
        if(this.ancho>=0&&this.alto>=0){
            this.ancho=ancho;
            this.alto=alto;
        }else{
            System.out.println("El ancho y alto tienen que ser positivos.");
        }
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        if(ancho>=0){
            this.ancho=ancho;
        }else{
            System.out.println("El ancho tiene que ser positivo.");
        }
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        if(alto>=0){
            this.alto=alto;
        }else{
            System.out.println("El alto tiene que ser positivo.");
        }
    }
    public double getArea(){
        return this.alto*this.ancho;
    }
}
