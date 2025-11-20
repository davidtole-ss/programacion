package Ejercicio05;

public class Empleado {
    private String nombre;
    private double sueldo;

    public Empleado() {

    }
    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    public void aplicarIncremento(double porcentaje){
        porcentaje = porcentaje/100;
        double nuevoSueldo = sueldo * porcentaje;
        this.sueldo = sueldo+nuevoSueldo;

    }
    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Sueldo: "+sueldo);

    }

}
