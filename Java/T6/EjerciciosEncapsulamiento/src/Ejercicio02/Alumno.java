package Ejercicio02;

public class Alumno {
    private double nota;

    public Alumno() {

    }

    public Alumno(double nota) {
        if(nota>=0 && nota<=10){
            this.nota = nota;
        }else{
            System.out.println("La nota no es valida.");
        }
    }
    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        if(nota>=0 && nota<=10){
            this.nota = nota;
        }else{
            System.out.println("La nota no es valida.");
        }
    }
    public void mostrarInfo(){
        System.out.println("Nota: "+nota);
    }
}
