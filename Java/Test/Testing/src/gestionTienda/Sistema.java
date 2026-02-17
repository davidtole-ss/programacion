package gestionTienda;

import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    protected ArrayList<ProductosBici> productos;

    public Sistema(ArrayList<ProductosBici> productos) {
        this.productos = productos;
    }

    public boolean insertarProducto() {
        Scanner datos = new Scanner(System.in);
        boolean seguir = true;
        while (seguir) {
            System.out.println("Ingresa el tipo de producto que quieres insertar: ");
            System.out.println("Bicicleta o Articulo vendible: ");
            String tipoArticulo = datos.nextLine();
            if (tipoArticulo.equals("Bicicleta")) {
                Bicicleta bicicleta = new Bicicleta();
                while (existeNumSerie(bicicleta.getNumSerie())) {
                    System.out.println("Numero de serie repetido, introduce uno diferente: ");
                    bicicleta.setNumSerie(datos.nextInt());
                    datos.nextLine(); // limpia buffer
                }
                productos.add(bicicleta);
                seguir = false;
            } else if (tipoArticulo.equals("Articulo")) {
                ArticuloVendible articuloVendible = new ArticuloVendible();
                while (existeNumSerie(articuloVendible.getNumSerie())) {
                    System.out.println("Introduce un numero de serie: ");
                    articuloVendible.setNumSerie(datos.nextInt());
                    datos.nextLine(); // limpia buffer
                }
                productos.add(articuloVendible);
                seguir = false;
            } else {
                System.out.println("No existe el tipo de producto que quieres insertar: ");
            }

        }
        return true;

    }

    private boolean existeNumSerie(int numSerie) {
        for (ProductosBici p : productos) {
            if (p.getNumSerie() == numSerie) {
                return true;
            }
        }
        return false;
    }

    public void productos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos");
        } else {
            for (ProductosBici p : productos) {
                p.infoProducto();
            }

        }
    }

    public boolean comprar() {
        Scanner datos = new Scanner(System.in);
        System.out.println("Introduce el producto que quieres comprar: ");
        String nombreProducto = datos.nextLine();
        System.out.println("Introduce cuanto quieres comprar: ");
        int cantidad = datos.nextInt();
        for (ProductosBici p : productos) {
            if (p instanceof Bicicleta) {
                if (p.getNombre().equals(nombreProducto)) {
                    ((Bicicleta) p).comprarBici(cantidad);
                }
            } else if (p instanceof ArticuloVendible) {
                if (p.getNombre().equals(nombreProducto)) {
                    p.comprarProducto(cantidad);
                }

            }
        }

        return true;
    }
}
