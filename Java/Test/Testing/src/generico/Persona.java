package generico;

public class Persona<V> {
    private String nom;
    private String ap;
    private V edad;

    public Persona(String nomb, String ap, V edad) {
        this.nom = nomb;
        this.ap = ap;
        this.edad = edad;
    }

    public V getEdad() {
        return edad;
    }

    public void setEdad(V edad) {
        this.edad = edad;
    }

    public void mostrarPersona() {
        System.out.println("Nombre: " + nom);
        System.out.println("Apellidos: " + ap);
        System.out.println("Edad: " + edad);
    }
}



