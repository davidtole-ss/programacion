package EjemploClaseFile.Serializable;

import java.io.Serial;
import java.io.Serializable;

class Persona implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    String nombre;
    int edad;
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    @Override
    public String toString() {
        return "Persona{" + "nombre='" + nombre + '\'' + ", edad=" + edad + '}';
    }
}