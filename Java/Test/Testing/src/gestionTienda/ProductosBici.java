package gestionTienda;

import java.util.Scanner;

public abstract class ProductosBici {
    protected int numSerie;
    protected double precio;
    protected String nombre;
    protected int unidades;

    public ProductosBici() {
        int numSerie=0;
        double precio=0;
        String nombre="";
        int unidades=0;
        Scanner datos = new Scanner(System.in);
        System.out.println("Ingrese el número de serie: ");
        numSerie = datos.nextInt();
        this.numSerie = numSerie;
        while (precio <= 0) {
            System.out.println("Ingresa el precio del producto: ");
            precio = datos.nextDouble();
            this.precio = precio;
            datos.nextLine();
        }
        while (nombre.isEmpty()) {
            System.out.println("Ingresa el nombre del producto: ");
            nombre = datos.nextLine();
            this.nombre = nombre;
        }
        while (unidades <= 0) {
            System.out.println("Ingresa las unidades del producto: ");
            unidades = datos.nextInt();
            this.unidades = unidades;
        }
    }

    public ProductosBici(int numSerie, double precio, String nombre, int unidades) {
        Scanner datos = new Scanner(System.in);
        this.numSerie = numSerie;
        System.out.println("Ingrese el número del serie: ");
        numSerie = datos.nextInt();
        this.numSerie = numSerie;
        while (precio <= 0) {
            System.out.println("Ingresa el precio del producto: ");
            precio = datos.nextDouble();
            this.precio = precio;
        }
        while (nombre == null) {
            System.out.println("Ingresa el nombre del producto: ");
            nombre = datos.nextLine();
            this.nombre = nombre;
        }
        while (unidades <= 0) {
            System.out.println("Ingresa las unidades del producto: ");
            unidades = datos.nextInt();
            this.unidades = unidades;
        }
    }

    public void infoProducto() {
        System.out.println("Número de serie del producto: " + numSerie);
        System.out.println("Nombre del producto: " + nombre);
        System.out.println("Precio del producto: " + precio);
        System.out.println("Unidades del producto que quedan: " + unidades);
    }

    public boolean comprarProducto(int cantidad) {
        if (cantidad <= this.unidades && cantidad > 0) {
            this.unidades -= cantidad;
            return true;
        } else {
            return false;
        }

    }

    public int getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
}
