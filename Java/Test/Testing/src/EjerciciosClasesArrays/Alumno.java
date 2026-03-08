package EjerciciosClasesArrays;

public class Alumno <V>{
    protected String nombre;
    protected String apellido;
    protected V edad;

    public Alumno(){

    }
    public Alumno(String nombre, String apellido, V edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public V getEdad() {
        return edad;
    }

    public void setEdad(V edad) {
        this.edad = edad;
    }
}
