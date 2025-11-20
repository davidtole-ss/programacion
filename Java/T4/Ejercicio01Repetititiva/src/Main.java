public class Main {
    public static void main(String[] args) {
        int precio = 5;
        int pagoFinal=0;
        for (int x = 1; x <= 12; x++) {
            pagoFinal=pagoFinal+precio;
            precio = precio*2;
        }
        System.out.println("El precio a pagar es:"+pagoFinal);
    }
    }
