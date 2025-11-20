package Ejercicio08;

public class Rectangulo {
    private double ancho;
    private double alto;
    public Rectangulo() {

    }
    public Rectangulo(double eancho, double ealto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double calcularArea() {
        return alto * ancho;
    }
    public double calcularPerimetro() {
        double perimetro=2*ancho+2*alto;
        return perimetro;
    }

    public void mostrarDimensiones() {
        System.out.println("Alto:"+this.alto);
        System.out.println("Ancho:"+this.ancho);
    }

}
