package Ejercicio06;

public class NotificacionEmail extends Notificacion{
    public NotificacionEmail(String mensaje) {
        super(mensaje);
    }
    @Override
    public void enviar() {
        System.out.println("Enviando EMAIL: "+mensaje);
    }
}
