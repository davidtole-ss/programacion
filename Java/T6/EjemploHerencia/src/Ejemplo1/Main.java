package Ejemplo1;

public class Main {
    public static void main(String[] args) {
        Perro perro1 = new Perro("Napoleon",5,"Audi");
        perro1.hacerSonido();
        Animal perro2 = new Perro();
        perro2.hacerSonidos();
    }
}
