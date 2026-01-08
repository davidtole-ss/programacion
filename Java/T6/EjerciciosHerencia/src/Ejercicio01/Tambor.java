package Ejercicio01;

public class Tambor extends Instrumento {
    protected double diametro;

    public Tambor(String tipo, String nombre, int diametro) {
        super(tipo, nombre);
        this.diametro = diametro;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
    @Override
    public void tocar(){
        System.out.println(nombre+" suena al golpear su membrana de "+diametro+" cm.");
    }
}

