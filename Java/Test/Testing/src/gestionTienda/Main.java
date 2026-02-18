package gestionTienda;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ProductosBici> productosTienda = new ArrayList();
        Sistema s1= new Sistema(productosTienda);
        s1.insertarProducto();
        s1.comprar();

        //Mayor a menor
        productosTienda.sort((p1, p2) ->
                Double.compare(p2.getPrecio(), p1.getPrecio())
        );

        /*Menor a mayor
        productosTienda.sort((p1, p2) ->
                Double.compare(p1.getPrecio(), p2.getPrecio())
        );
        */



    }
}
