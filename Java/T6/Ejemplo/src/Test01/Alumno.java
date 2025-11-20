package Test01;

public class Alumno {
    private int id;
    private String nombre;
    private int edad;

    public Alumno() {

    }

    public Alumno(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        if(edad>=0&&edad<=100){
            this.edad = edad;
        }else {
            System.out.println("La edad no es valido");
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad>=0&&edad<=100){
            this.edad = edad;
        }else {
            System.out.println("La edad no es valido");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    private void mostrarInfo(){
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
    public void prueba(){
        mostrarInfo();
    }
}
