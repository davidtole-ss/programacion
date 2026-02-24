package generico.EjercicioClase;

public class Alumno<V> {
    protected String nombre;
    protected String apellido;
    protected String asignatura;
    protected V nota;


    public Alumno(String nombre, String apellido, String asignatura, V nota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.asignatura = asignatura;
        this.nota = nota;
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

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public V getNota() {
        return nota;
    }

    public void setNota(V nota) {
        this.nota = nota;
    }
}
