package Ejercicio06;

public class NotificacionSMS extends Notificacion {
    public NotificacionSMS(String mensaje) {
        super(mensaje);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando SMS: " + mensaje);
    }
}
