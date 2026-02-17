package gestionTienda;

import java.util.Scanner;

public class Bicicleta extends ProductosBici {
    protected String marca;
    protected String tipo;
    protected String estado;

    public Bicicleta() {
        String tipo = "";
        String marca = "";
        String estado = "";
        Scanner datos = new Scanner(System.in);
        while (!tipo.equals("Montaña") && !tipo.equals("Paseo") && !tipo.equals("Carretera")) {
            System.out.print("Ingresa el tipo de bicicleta: ");
            tipo = datos.nextLine();
            this.tipo = tipo;
        }
        while (marca.isEmpty()) {
            System.out.print("Ingresa la marca: ");
            marca = datos.nextLine();
            this.marca = marca;
        }
        System.out.print("Ingresa el estado: ");
        estado = datos.nextLine();
        this.estado = estado;
    }

    public Bicicleta(String marca, String tipo, String estado, int numSerie, double precio, String nombre, int unidades) {
        super(numSerie, precio, nombre, unidades);
        Scanner datos = new Scanner(System.in);
        while (!tipo.equals("Montaña") && !tipo.equals("Paseo") && !tipo.equals("Carretera")) {
            System.out.print("Ingresa el tipo de bicicleta: ");
            tipo = datos.nextLine();
            this.tipo = tipo;
        }
        while (marca.isEmpty()) {
            System.out.print("Ingresa la marca: ");
            marca = datos.nextLine();
            this.marca = marca;
        }
        this.estado = estado;
    }


    @Override
    public void infoProducto() {
        super.infoProducto();
        System.out.println("Marca: " + marca);
        System.out.println("Tipo: " + tipo);
        System.out.println("Estado Bicicleta: " + estado);
    }

    public boolean comprarBici(int cantidad) {
        boolean comprado = super.comprarProducto(cantidad);
        if (comprado) {
            this.estado = "Vendida.";
            System.out.println("Bicicleta vendida!");
            infoProducto();
        }else{
            System.out.println("No queda el producto que quieres comprar.");
        }
        return comprado;
    }


}
