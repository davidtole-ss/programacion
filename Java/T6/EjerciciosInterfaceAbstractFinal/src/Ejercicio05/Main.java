package Ejercicio05;

public class Main {
    public static void main(String[] args) {
        Programable microondas1= new Microondas();
        microondas1.iniciarPrograma(3);
        microondas1.enFuncionamiento();
        microondas1.detenerPrograma();
        microondas1.enFuncionamiento();
        System.out.println();
        Programable lavadora1= new Lavadora();
        lavadora1.iniciarPrograma(60);
        lavadora1.enFuncionamiento();
        lavadora1.detenerPrograma();
        lavadora1.enFuncionamiento();

    }
}
