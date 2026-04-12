package EjerciciosCRUD.Ej02;

public class Estudiante {
    private int id_estudiante;
    private String nombre;
    private String apellido;
    private int edad;
    private String curso;

    public Estudiante() {
    }
    public Estudiante(int id_estudiante, String nombre, String apellido, int edad, String curso) {
        this.id_estudiante = id_estudiante;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.curso = curso;
    }

    public int getId() {
        return id_estudiante;
    }

    public void setId(int id) {
        this.id_estudiante = id;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "id_estudiante=" + id_estudiante +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", curso='" + curso + '\'' +
                '}';
    }
}
