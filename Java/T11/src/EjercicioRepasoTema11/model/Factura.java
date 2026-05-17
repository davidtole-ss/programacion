package EjercicioRepasoTema11.model;

public class Factura {
    private Integer id;
    private Integer cantidad;

    public Factura() {}

    public Factura(Integer id, Integer cantidad) {
        this.id = id;
        this.cantidad = cantidad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "id=" + id +
                ", cantidad=" + cantidad +
                '}';
    }
}
