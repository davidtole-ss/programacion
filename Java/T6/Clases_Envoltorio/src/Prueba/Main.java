package Prueba;

public class Main {
    public static void main(String[] args) {
        String cadena="Esto es una cadena";
        int longitud=cadena.length();
        System.out.println(longitud);



        int posicion=cadena.indexOf("u");
        System.out.println(posicion);

        String subcadena=cadena.substring(8,cadena.length());
        System.out.println(subcadena);

        char letra=cadena.charAt(8);
        System.out.println(letra);

        boolean resultado=cadena.equals(subcadena);
        System.out.println(resultado);




    }
}
