package Ejercicio02Clases;

public class Persona {
    private String nombre;
    private int edad;
    public Persona() {

    }

    public Persona(String pnombre, int pedad) {
        this.nombre = pnombre;
        this.edad = pedad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String pnombre) {
        this.nombre = pnombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int pedad) {
        this.edad = pedad;
    }

    public boolean esMayorEdad(){
        boolean mayor=true;
        if(this.edad>=18){
            mayor=true;
        }else{
            mayor=false;
        }
        return mayor;
    }
    public void mostrarInfromacion(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Edad: "+this.edad);

        if(this.edad>=18){
            System.out.println("Es mayor de edad.");
        }else{
            System.out.println("Es menor de edad.");
        }
    }
}
