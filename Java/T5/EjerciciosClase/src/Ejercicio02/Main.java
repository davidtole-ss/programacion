package Ejercicio02;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 34);
        boolean mayor1 = persona1.esMayorEdad();
        System.out.println(mayor1);
        persona1.mostrarInfromacion();

        Persona persona2 = new Persona("Jorge", 21);
        boolean mayor2 = persona2.esMayorEdad();
        System.out.println(mayor2);
        persona2.mostrarInfromacion();

        int nuevaEdad = 17;
        persona2.setEdad(nuevaEdad);
        persona2.mostrarInfromacion();
        boolean mayor3 = persona2.esMayorEdad();
        System.out.println(mayor3);
    }
}
