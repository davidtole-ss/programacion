package Ejercicio07;

import java.time.LocalTime;

public abstract class Reloj implements Funciones {
    protected String marcaReloj;
    protected String tipo;
    protected LocalTime hora=LocalTime.now();

    public Reloj(String marcaReloj, String tipo){
        this.marcaReloj = marcaReloj;
        this.tipo = tipo;
    }
    @Override
    public abstract void mostrarHora() throws InterruptedException;
    @Override
    public final void mostrarInfo(){
        System.out.println("Marca del reloj: "+marcaReloj);
        System.out.println("Tipo de reloj: "+tipo);
    }

}
