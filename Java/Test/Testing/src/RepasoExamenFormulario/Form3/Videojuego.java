package RepasoExamenFormulario.Form3;


public class Videojuego {
    private Integer id;
    private String titulo;
    private String plataforma;
    private Double precio;

    public Videojuego() {}
    public Videojuego(Integer id, String titulo, String plataforma, Double precio) {
        this.id = id;
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.precio = precio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
