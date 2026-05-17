package EjerciciosRepasoClase.Ej01;

public class Poblacion {
    protected String nombre;
    protected String codigoPostal;
    protected int id;

    public Poblacion() {
    }

    public Poblacion(String nombre, String codigoPostal, int id) {
        this.nombre = nombre;
        this.codigoPostal = codigoPostal;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String toString(){
        return nombre+"|"+codigoPostal+"|"+id;
    }
}
