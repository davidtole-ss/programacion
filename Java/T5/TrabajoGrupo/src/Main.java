public class Main {
    public static void main(String[] args) {
        PersonajeJuego pj = new PersonajeJuego(100,120,"mago",20,10,1);
        pj.setPuntosMagia(50);

        pj.mostrarInfo();

        pj.atk();
        pj.curarse();
        pj.atk();
        pj.subirlvl();
        pj.mostrarInfo();

    }
}
