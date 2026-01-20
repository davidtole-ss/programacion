package Ejercicio05;

public class Lavadora implements Programable{
    public boolean funcionando;
    public int tiempoRestante;
    @Override
    public void iniciarPrograma(int minutos) {
    tiempoRestante = minutos;
    System.out.println("Iniciando la lavadora...");
    System.out.println("Tiempo restante: "+tiempoRestante+" minutos.");
    funcionando = true;

    }
    @Override
    public void detenerPrograma() {
        System.out.println("Lavadora deteniendose.");
        tiempoRestante = 0;
        funcionando = false;
    }

    @Override
    public boolean enFuncionamiento() {
        if(funcionando){
            System.out.println("Lavadora funcionando: "+funcionando);
        }else{
            System.out.println("Lavadora funcionando: "+funcionando);

        }
        return false;
    }
}
