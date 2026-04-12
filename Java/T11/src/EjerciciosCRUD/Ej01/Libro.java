package EjerciciosCRUD.Ej01;

public class Libro {
    private int id_libro;
    private String autor;
    private String titulo;
    private String anio;

    public Libro(){}
    public Libro(int id_libro,String autor, String titulo, String anio) {
        this.id_libro = id_libro;
        this.autor = autor;
        this.titulo = titulo;
        this.anio = anio;
    }

    public int getId_libro() {
        return id_libro;
    }

    public void setId_libro(int id_libro) {
        this.id_libro = id_libro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "id_libro=" + id_libro +
                ", autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", anio='" + anio + '\'' +
                '}';
    }
}
