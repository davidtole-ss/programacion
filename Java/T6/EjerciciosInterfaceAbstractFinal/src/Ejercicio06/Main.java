package Ejercicio06;

public class Main {
    public static void main(String[] args) {
        Electrodomestico l1=new Lavadora("Lavadora Boshc",1);
        l1.consumoTotal(10);
        System.out.println();
        Electrodomestico n1=new Nevera("Nevera Samsung",0.4);
        n1.consumoTotal(10);

    }
}
