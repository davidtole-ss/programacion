package Ejercicio01;

public class Main {
    public static void main(String[] args) {
        Instrumento instrumento = new Instrumento("Viento","Flauta");
        instrumento.tocar();
        Tambor tambor1=new Tambor("percusion","Tambor Militar",40);
        tambor1.tocar();
        Guitarra guitarra1=new Guitarra("Cuerda","Guitarra Española",6);
        guitarra1.tocar();
    }
}
