package gestionTienda;

import java.util.Scanner;

public class ArticuloVendible extends ProductosBici{
    private String categoria;
    private boolean pedirProducto=false;

    public ArticuloVendible() {
        String categoria;
        Scanner datos= new Scanner(System.in);
        while(!this.categoria.equals("Mejora")&&!this.categoria.equals("Reparacion")&&!this.categoria.equals("Entrenamiento")){
            System.out.println("Ingrese categoria: ");
            categoria=datos.next();
            this.categoria=categoria;

        }
    }
    public ArticuloVendible(String categoria,int numSerie, double precio, String nombre, int unidades){
        super(numSerie,precio,nombre,unidades);
        Scanner datos= new Scanner(System.in);
        while(!this.categoria.equals("Mejora")&&!this.categoria.equals("Reparacion")&&!this.categoria.equals("Entrenamiento")){
            System.out.println("Ingrese categoria: ");
            categoria=datos.next();
            this.categoria=categoria;

        }

    }
    public void pedirProducto(){
        if(unidades==0){
            pedirProducto=true;
        }
    }
    @Override
    public void infoProducto(){
        super.infoProducto();
        System.out.println("Categoria: "+categoria);
        System.out.println("Pedir producto: "+pedirProducto);
    }
    public boolean comprarProducto(int cantidad) {
        boolean comprado= super.comprarProducto(cantidad);
        if (comprado) {
            System.out.println("Producto vendido!");
            infoProducto();
        }

        return comprado;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isPedirProducto() {
        return pedirProducto;
    }

    public void setPedirProducto(boolean pedirProducto) {
        this.pedirProducto = pedirProducto;
    }
}
