package Testing;

public class test2 {
    public static void main(String[] args) {
        int inicio = 1;
        int contador = inicio;
        int fin = 19;
        while (contador <= fin) {
            if (contador % 2 == 0) {
                System.out.println("Par: "+contador);
            } else {
                System.out.println("Impar: "+contador);
            }
            contador++;


        }


    }
}
