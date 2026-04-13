package EjerciciosCRUD.Ej03;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductoDAO pdao = new ProductoDAO();
        PedidoDAO pedao = new PedidoDAO();
        pdao.crearTabla();
        pedao.crearTabla();
        boolean seguir = true;
        Scanner sc = new Scanner(System.in);

        while (seguir) {
            System.out.println("--- Gestión de Pedidos y Productos ---");
            System.out.println("1. Agregar producto");
            System.out.println("2. Agregar pedido");
            System.out.println("3. Mostrar productos");
            System.out.println("4. Mostrar pedidos");
            System.out.println("5. Actualizar producto");
            System.out.println("6. Eliminar producto");
            System.out.println("7. Eliminar pedido");
            System.out.println("8. Mostrar pedidos por fecha");
            System.out.println("9. Mostrar productos más vendidos");
            System.out.println("10. Mostrar valor total pedido");
            System.out.println("11. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("Ingresa el nombre:");
                    String nombre = sc.nextLine();
                    System.out.println("Ingresa la descripcion:");
                    String descripcion = sc.nextLine();
                    System.out.println("Ingresa el precio:");
                    double precio = Double.parseDouble(sc.nextLine());
                    System.out.println("Ingresa el stock:");
                    int stock = Integer.parseInt(sc.nextLine());
                    pdao.insertar(new Producto(0, nombre, descripcion, precio, stock));
                    break;
                case 2:
                    List<Producto> productos = pdao.obtenerTodas();
                    System.out.println("Productos disponibles:");
                    for (Producto p : productos) {
                        System.out.println(p);
                    }
                    System.out.println("Ingresa el id del producto:");
                    int id_producto = Integer.parseInt(sc.nextLine());
                    System.out.println("Ingresa la cantidad:");
                    int cantidad = Integer.parseInt(sc.nextLine());
                    System.out.println("Ingresa la fecha (YYYY-MM-DD):");
                    String fecha = sc.nextLine();
                    pedao.insertar(new Pedido(0, id_producto, cantidad, fecha));
                    break;
                case 3:
                    productos = pdao.obtenerTodas();
                    System.out.println("Lista de productos:");
                    for (Producto p : productos) {
                        System.out.println(p);
                    }
                    break;
                case 4:
                    List<Pedido> pedidos = pedao.obtenerTodas();
                    System.out.println("Lista de pedidos:");
                    for (Pedido p : pedidos) {
                        System.out.println(p);
                    }
                    break;
                case 5:
                    System.out.println("Ingresa el nombre del producto a actualizar:");
                    nombre = sc.nextLine();
                    System.out.println("Ingresa el nuevo precio:");
                    precio = Double.parseDouble(sc.nextLine());
                    System.out.println("Ingresa el nuevo stock:");
                    stock = Integer.parseInt(sc.nextLine());
                    pdao.actualizar(nombre, precio, stock);
                    break;
                case 6:
                    System.out.println("Ingresa el nombre del producto a eliminar:");
                    nombre = sc.nextLine();
                    pdao.eliminar(nombre);
                    break;
                case 7:
                    System.out.println("Ingresa el id del pedido a eliminar:");
                    int id_pedido = Integer.parseInt(sc.nextLine());
                    pedao.eliminar(id_pedido);
                    break;
                case 8:
                    System.out.println("Ingresa la fecha (YYYY-MM-DD):");
                    fecha = sc.nextLine();
                    pedidos = pedao.obtenerTodas(fecha);
                    System.out.println("Pedidos de la fecha " + fecha + ":");
                    for (Pedido p : pedidos) {
                        System.out.println(p);
                    }
                    break;
                case 9:
                    List<Producto> masVendidos = pdao.obtenerMasVendidos();
                    System.out.println("Productos más vendidos:");
                    for (Producto p : masVendidos) {
                        System.out.println("Producto: " + p.getNombre() + " - Total pedidos: " + p.getTotal_pedido());
                    }
                    break;
                case 10:
                    pedidos = pedao.valorTotalPedido();
                    System.out.println("Valor total por pedido:");
                    for (Pedido p : pedidos) {
                        System.out.println("Pedido " + p.getId_pedido() + " - Total: " + p.getValor_total_pedido());
                    }
                    break;
                case 11:
                    seguir = false;
            }
        }
        sc.close();
    }
}
