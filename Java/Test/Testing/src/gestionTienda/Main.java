package gestionTienda;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ProductosBici> productosTienda = new ArrayList();
        Sistema s1= new Sistema(productosTienda);
        s1.insertarProducto();
        s1.comprar();
        ArticuloVendible p1= new ArticuloVendible();
        
    }
}
