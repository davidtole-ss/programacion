public class PersonajeJuego {
    private int puntosDeSalud;
    private int puntosDeStamina;
    private int puntosMagia;
    private String clase;
    private int atk;
    private int def;
    private int lvl;

    public PersonajeJuego() {

    }

    public PersonajeJuego(int puntosDeSalud, int puntosDeStamina, String clase, int atk, int def, int lvl) {
        this.puntosDeSalud = puntosDeSalud;
        this.puntosDeStamina = puntosDeStamina;
        this.clase = clase;
        this.atk = atk;
        this.def = def;
        this.lvl = lvl;
    }

    public int getPuntosDeSalud() {
        return puntosDeSalud;
    }

    public void setPuntosDeSalud(int puntosDeSalud) {
        this.puntosDeSalud = puntosDeSalud;
    }

    public int getPuntosDeStamina() {
        return puntosDeStamina;
    }

    public void setPuntosDeStamina(int puntosDeStamina) {
        this.puntosDeStamina = puntosDeStamina;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public int getPuntosMagia() {
        return puntosMagia;
    }

    public void setPuntosMagia(int puntosMagia) {
        this.puntosMagia = puntosMagia;
    }

    public void subirlvl() {
        this.lvl++;
        this.puntosDeStamina =+10;
        this.puntosDeSalud +=50;
        this.puntosMagia +=15;
        this.atk +=10;

    }

    public void curarse() {
        this.puntosDeSalud=puntosDeSalud+5;
        this.puntosMagia=puntosMagia-10;
    }
    public void atk() {
        this.puntosDeStamina=puntosDeStamina-7;
    }
    public void mostrarInfo(){
        System.out.println("Puntos de salud: " + this.puntosDeSalud);
        System.out.println("Puntos de stamina: " + this.puntosDeStamina);
        System.out.println("Puntos de magia: " + this.puntosMagia);
        System.out.println("Nivel: " + this.lvl);
        System.out.println("Ataque: " + this.atk);
        System.out.println("Defensa: " + this.def);
        System.out.println("Clase: " + this.clase);


    }



}
