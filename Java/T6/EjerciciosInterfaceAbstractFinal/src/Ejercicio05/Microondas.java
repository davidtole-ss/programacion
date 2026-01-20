package Ejercicio05;

public class Microondas implements Programable {
    private boolean funcionando;
    private int tiempoRestante;

    @Override
    public void iniciarPrograma(int minutos) {
        funcionando = true;
        System.out.println("Iniciando el microondas...");
        tiempoRestante = minutos;
        System.out.println("Tiempo restante: " + tiempoRestante+" minutos.");
    }
    @Override
    public void detenerPrograma() {
        tiempoRestante = 0;
        System.out.println("Microondas detenido.");
        funcionando = false;

    }
    @Override
    public boolean enFuncionamiento() {
        if (funcionando) {
            System.out.println("Microondas funcionando: "+funcionando);

        }else{
            System.out.println("Microondas funcionado: "+funcionando);

        }return funcionando;
    }
}
