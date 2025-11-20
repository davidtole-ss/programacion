package Ejercicio09;

public class Libro {
    private String titulo;
    private String autor;
    private boolean prestado;

    public Libro() {

    }

    public Libro(String etitulo, String eautor, boolean eprestado) {
        this.titulo = etitulo;
        this.autor = eautor;
        this.prestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
    public void prestar(){
        if(prestado==false){
            System.out.println("Prestado.");
            this.prestado=true;
        }
    }
    public void devolver(){
        if(prestado==true){
            System.out.println("Devuelto.");
            this.prestado=false;
        }
    }
    public void estado(){
        if(prestado==true){
            System.out.println("Prestado");
        }else{
            System.out.println("Disponible.");
        }
    }

}
