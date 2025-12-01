package Ej;

public class Alumno {
    // Atributos
    private String nombre;
    private String nombreAsignatura;
    private double notaParcial1Examen;
    private double notaParcial2Examen;
    private double notaExposicion;
    private double notaEjercicios;
    private double notaTrabajoClase;

    // Constructor vacío
    public Alumno() {
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreAsignatura() {
        return this.nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public double getNotaParcial1Examen() {
        return notaParcial1Examen;
    }

    public void setNotaParcial1Examen(double notaParcial1Examen) {
        this.notaParcial1Examen = notaParcial1Examen;
    }

    public double getNotaParcial2Examen() {
        return notaParcial2Examen;
    }

    public void setNotaParcial2Examen(double notaParcial2Examen) {
        this.notaParcial2Examen = notaParcial2Examen;
    }

    public double getNotaExposicion() {
        return notaExposicion;
    }

    public void setNotaExposicion(double notaExposicion) {
        this.notaExposicion = notaExposicion;
    }

    public double getNotaEjercicios() {
        return notaEjercicios;
    }

    public void setNotaEjercicios(double notaEjercicios) {
        this.notaEjercicios = notaEjercicios;
    }

    public double getNotaTrabajoClase() {
        return notaTrabajoClase;
    }

    public void setNotaTrabajoClase(double notaTrabajoClase) {
        this.notaTrabajoClase = notaTrabajoClase;
    }

    // Métodos
    public void insertarRegistro(String nombre, String nombreAsignatura, double parcial1, double parcial2,double exposicion, double ejercicios, double pTrabajos) {
        this.nombre = nombre;
        this.nombreAsignatura = nombreAsignatura;
        this.notaParcial1Examen = parcial1;
        this.notaParcial2Examen = parcial2;
        this.notaExposicion = exposicion;
        this.notaEjercicios = ejercicios;
        this.notaTrabajoClase = pTrabajos;
    }

    public void modificarRegistro(String nombre, String asignatura, double parcial1, double parcial2, double exposicion, double ejercicios, double pTrabajos) {
        insertarRegistro(nombre, nombreAsignatura, parcial1, parcial2, exposicion, ejercicios,pTrabajos);
    }

    public void eliminarRegistro() {
        this.nombre = null;
        this.nombreAsignatura = null;
        this.notaParcial1Examen = 0;
        this.notaParcial2Examen = 0;
        this.notaExposicion = 0;
        this.notaEjercicios = 0;
        this.notaTrabajoClase = 0;
    }

    public double calcularNotaPrimeraEvaluacion() {

        return (this.notaParcial1Examen * 0.3) +
                (this.notaParcial2Examen * 0.3) +
                (this.notaExposicion * 0.1) +
                (this.notaEjercicios * 0.2) +
                (this.notaTrabajoClase * 0.1);
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Asignatura: " + this.nombreAsignatura);
        System.out.println("Nota Parcial 1: " +
                this.notaParcial1Examen);
        System.out.println("Nota Parcial 2: " +
                this.notaParcial2Examen);
        System.out.println("Nota Exposición: " + this.notaExposicion);
        System.out.println("Nota Ejercicios: " + this.notaEjercicios);
        System.out.println("Nota Trabajos: " + this.notaTrabajoClase);
    }
}
