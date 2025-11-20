package Ejercicio01Clases;

public class Main {
    public static void main(String[] args) {
        Alumno alumno1=new Alumno("Jorge",9.4);
        boolean aprobado=alumno1.esAprobado();
        alumno1.mostrarInfromacion();
        alumno1.mostrarAprobado(aprobado);

        Alumno alumno2=new Alumno("Victor",4.5);
        boolean aprobado2=alumno2.esAprobado();
        alumno2.mostrarInfromacion();
        alumno2.mostrarAprobado(aprobado2);

        Alumno alumno3=new Alumno("Julio",6.8);
        boolean aprobado3=alumno3.esAprobado();
        alumno3.mostrarInfromacion();
        alumno3.mostrarAprobado(aprobado3);
    }
}
