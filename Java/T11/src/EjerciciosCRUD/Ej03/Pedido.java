package EjerciciosCRUD.Ej03;

public class Pedido {
    private int id_pedido;
    private int id_producto;
    private int cantidad;
    private String fecha;
    private String nombre;
    private double valor_total_pedido;

    public Pedido(){}
    public Pedido(int id_pedido, int id_producto, int cantidad, String fecha, String nombre) {
        this.id_pedido = id_pedido;
        this.id_producto = id_producto;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.nombre = nombre;
    }
    public Pedido(int id_pedido, int id_producto, int cantidad, String fecha) {
        this.id_pedido = id_pedido;
        this.id_producto = id_producto;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    public Pedido(int id_pedido,double valor_total_pedido) {
        this.id_pedido = id_pedido;
        this.valor_total_pedido = valor_total_pedido;
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

    public double getValor_total_pedido() {
        return valor_total_pedido;
    }

    public void setValor_total_pedido(double valor_total_pedido) {
        this.valor_total_pedido = valor_total_pedido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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


