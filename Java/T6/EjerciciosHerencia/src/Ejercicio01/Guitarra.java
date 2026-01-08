package Ejercicio01;

public class Guitarra extends Instrumento{
    protected int numCuerdas;

    public Guitarra(){
    }
    public Guitarra(String tipo,String nombre,int numCuerdas) {
        super(tipo,nombre);
        this.numCuerdas = numCuerdas;
    }

    public int getNumCuerdas() {
        return numCuerdas;
    }

    public void setNumCuerdas(int numCuerdas) {
        this.numCuerdas = numCuerdas;
    }

    @Override
    public void tocar(){
        System.out.println(nombre+" suena rasgueando sus "+numCuerdas+" cuerdas.");
    }

}
