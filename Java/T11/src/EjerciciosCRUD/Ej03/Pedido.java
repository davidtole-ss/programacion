package EjerciciosCRUD.Ej03;

public class Pedido {
    private int id_pedido;
    private int id_producto;
    private int cantidad;
    private String fecha;

    public Pedido(){}
    public Pedido(int id_pedido, int id_producto, int cantidad, String fecha) {
        this.id_pedido = id_pedido;
        this.id_producto = id_producto;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id_pedido=" + id_pedido +
                ", id_producto=" + id_producto +
                ", cantidad=" + cantidad +
                ", fecha='" + fecha + '\'' +
                '}';
    }
}


