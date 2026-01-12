package Ejercicio06;

public class Main {
    public static void main(String[] args) {
        Notificacion n1=new Notificacion("Descarga completada");
        n1.enviar();
        n1.enviar("App Store");
        n1.enviar(false);
        NotificacionEmail n2=new NotificacionEmail("Pago multa.");
        n2.enviar();
        NotificacionSMS n3=new NotificacionSMS("Codigo: 931239");
        n3.enviar();
    }
}
