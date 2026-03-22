package EjercicioVehiculoJson;

public class Vehiculo {
    protected  String marca;
    protected String modelo;
    protected int anio;
    protected String color;
    protected int precio;
    public Vehiculo() {}
    public Vehiculo(String marca, String modelo, int anio, String color, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public String toString(){
        return "Coche{" +
                "Marca='" + marca + '\'' +
                ", modelo=" + modelo +
                ", anio=" + anio +
                ", anio='" + anio + '\'' +
                '}';
    }
}
