package Ejercicio04;

public class Main {
    public static void main(String[] args) {
        Logger l1=new Logger("Inicio del sistema",1,true);
        l1.log(l1.getMensaje());
        l1.log(l1.getMensaje(), l1.getNivel());
        l1.log(l1.getMensaje(), l1.isGuardar());

    }
}
