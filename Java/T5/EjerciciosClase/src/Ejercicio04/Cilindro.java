package Ejercicio04;

public class Cilindro {
    private double radio;
    private double altura;

    public Cilindro() {

    }
    public Cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double calcularVolumen(){
        double resultadoVolumen=Math.PI*Math.pow(this.radio,2)*altura;
        return resultadoVolumen;
    }
    public double calcularAreaLateral(){
        double resultadoAreaLateral=2*Math.PI*this.radio*this.altura;
        return resultadoAreaLateral;
    }
    public void mostrarMedidas(){
        System.out.println("Radio: "+this.radio);
        System.out.println("Altura: "+this.altura);
        System.out.println("Area lateral: "+this.calcularAreaLateral());
        System.out.println("Volumen: "+this.calcularVolumen());
    }



}
