package Excepciones2.Ej02;

public class Main {
    public static void main(String[] args) {
        try{
            verificarEdad(18);
            verificarEdad(17);
        }catch(Exception e){
            System.err.println(e.getMessage());
        }

    }
    public static void verificarEdad(int edad) {
        if (edad < 18) {
            throw new IllegalArgumentException("Error: Edad insuficiente para votar.");
        }else{
            System.out.println("Puedes votar.");
        }

    }
}
