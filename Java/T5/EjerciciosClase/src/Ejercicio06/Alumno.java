package Ejercicio06;

import java.util.Scanner;

public class Alumno {
    private String nombre;
    private String nombreAsignatura;
    private double notaParcial1Examen;
    private double notaParcial2Examen;
    private double notaExposicion;
    private double notaEjercicios;
    private double notaTrabajos;

    public Alumno() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
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

    public double getNotaTrabajos() {
        return notaTrabajos;
    }

    public void setNotaTrabajos(double notaTrabajos) {
        this.notaTrabajos = notaTrabajos;
    }

    public void insertarRegistro(String nombre, String nombreAsignatura, double notaParcial1Examen, double notaParcial2Examen, double notaExposicion, double notaEjercicios, double notaTrabajos) {
        this.nombre = nombre;
        this.nombreAsignatura = nombreAsignatura;
        this.notaParcial1Examen = notaParcial1Examen;
        this.notaParcial2Examen = notaParcial2Examen;
        this.notaExposicion = notaExposicion;
        this.notaEjercicios = notaEjercicios;
        this.notaTrabajos = notaTrabajos;
    }
    public void modificarRegistro(String nombre, String nombreAsignatura, double notaParcial1Examen, double notaParcial2Examen, double notaExposicion, double notaEjercicios, double notaTrabajos) {
        this.nombre = nombre;
        this.nombreAsignatura = nombreAsignatura;
        this.notaParcial1Examen = notaParcial1Examen;
        this.notaParcial2Examen = notaParcial2Examen;
        this.notaExposicion = notaExposicion;
        this.notaEjercicios = notaEjercicios;
        this.notaTrabajos = notaTrabajos;
    }
    public void eliminarRegsitro() {
        this.nombre = null;
        this.nombreAsignatura = null;
        this.notaParcial1Examen = 0;
        this.notaParcial2Examen = 0;
        this.notaExposicion = 0;
        this.notaEjercicios = 0;
        this.notaTrabajos = 0;
    }
    public double calcularNotaPrimeraEvaluacion(double notaParcial1Examen, double notaParcial2Examen, double notaExposicion, double notaEjercicios, double notaTrabajos){
        double resultado=0;
        resultado=(notaParcial1Examen*0.25)+(notaParcial2Examen*0.45)+(notaExposicion*0.1)+(notaEjercicios*0.1)+(notaTrabajos*0.15);
        return resultado;
    }
    public void mostrarInformacion() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Nombre Asignatura: " + this.nombreAsignatura);
        System.out.println("Nota Parcial 1: " + this.notaParcial1Examen);
        System.out.println("Nota Parcial 2: " + this.notaParcial2Examen);
        System.out.println("Nota Exposicion: " + this.notaExposicion);
        System.out.println("Nota Ejercicio: " + this.notaEjercicios);
        System.out.println("Nota Trabajos: " + this.notaTrabajos);


    }



}
