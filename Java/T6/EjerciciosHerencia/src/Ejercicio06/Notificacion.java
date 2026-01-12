package Ejercicio06;

public class Notificacion {
    protected String mensaje;

    public Notificacion() {
    }

    public Notificacion(String mensaje) {
        this.mensaje = mensaje;
    }

    public void enviar() {
        System.out.println("Enviando notificación genérica: " + mensaje);
    }

    public void enviar(String remitente) {
        System.out.println("Enviando notificación genérica de " + remitente + ": " + mensaje);
    }

    public void enviar(boolean urgente) {
        if (urgente == true) {
            System.out.println("Enviando NOTIFICACIÓN URGENTE: " + mensaje);
        } else {
            System.out.println("Enviando notificación normal: " + mensaje);
        }
    }
}
