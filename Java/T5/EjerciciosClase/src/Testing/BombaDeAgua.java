package Testing;

public class BombaDeAgua {
    private double capacidadMaxima;
    private double nivelActual;
    public BombaDeAgua() {

    }
    public BombaDeAgua(double capacidadMaxima, double nivelActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.nivelActual = nivelActual;
    }
    public double getCapacidadMaxima() {
        return capacidadMaxima;

    }
    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }
    public double getNivelActual() {
        return nivelActual;
    }
    public void setNivelActual(double nivelActual) {
        this.nivelActual = nivelActual;
    }
    public void llenar(double cantidad){
        if((cantidad+this.nivelActual)>=this.capacidadMaxima){
            this.nivelActual=this.capacidadMaxima;

        }else{
            this.nivelActual+=cantidad;

        }

    }
    public void vaciar(double cantidad){
        if((this.nivelActual-cantidad)<=0){
            this.nivelActual=0;

        }else{
            this.nivelActual-=cantidad;

        }
    }
    public void mostrarEstado(){
        System.out.println("La bomba de agua tiene "+this.nivelActual+" litros.");
    }
}
