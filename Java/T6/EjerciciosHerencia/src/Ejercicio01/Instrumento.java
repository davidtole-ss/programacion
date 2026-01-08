package Ejercicio01;

public class Instrumento {
    protected String tipo;
    protected String nombre;

    public Instrumento() {}
    public Instrumento(String tipo, String nombre) {
        this.tipo = tipo;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void tocar(){
        System.out.println("Tocandose.");
    }
}
