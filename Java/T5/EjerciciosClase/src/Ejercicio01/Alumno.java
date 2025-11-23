package Ejercicio01;

public class Alumno {
    private String nombre;
    private double nota;

    public Alumno() {

    }

    public Alumno(String pnombre, double pnota) {
        this.nombre = pnombre;
        this.nota = pnota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String pnombre) {
        this.nombre = pnombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double pnota) {
        this.nota = pnota;
    }

    public boolean esAprobado(){
        boolean aprobado = true;
        if(this.nota>=5){
             aprobado = true;

        }else{
             aprobado = false;
        }

        return aprobado;
    }
    public void mostrarInfromacion(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Nota: " + this.nota);
    }
    public void mostrarAprobado(boolean aprobado){
        if(aprobado==true){
            System.out.println("Alumno esta aprobado.");
        }else{
            System.out.println("Alumno esta suspenso.");
        }
    }
}
