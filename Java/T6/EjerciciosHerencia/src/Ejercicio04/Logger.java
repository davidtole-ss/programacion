package Ejercicio04;

public class Logger {
    private String mensaje;
    private int nivel;
    private boolean guardar;

    public Logger() {

    }
    public Logger(String mensaje, int nivel, boolean guardar) {
        this.mensaje=mensaje;
        this.nivel=nivel;
        this.guardar=guardar;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public boolean isGuardar() {
        return guardar;
    }

    public void setGuardar(boolean guardar) {
        this.guardar = guardar;
    }

    public void log(String mensaje) {
        System.out.println("[LOG] "+mensaje);

    }

    public void log(String mensaje, int nivel) {
        if (nivel == 1) {
            System.out.println("[INFO] "+mensaje);
        } else if (nivel == 2) {
            System.out.println("[WARNING] "+mensaje);
        } else if (nivel == 3) {
            System.out.println("[ERROR] "+mensaje);
        }else{
            System.out.println("¿QUE HACES?");
        }

    }
    public void log(String mensaje, boolean guardarEnFichero) {
        if(guardarEnFichero==true){
            System.out.println("Guardando en fichero: "+mensaje);
        }else{
            System.out.println(mensaje);
        }

    }


}
