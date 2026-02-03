package matrizInvertida;

public class Main {
    public static void main(String[] args) {
        int num[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int y = 0; y < num[0].length; y++) {   // columnas
            for (int x = 0; x < num.length; x++) { // filas
                System.out.print(num[x][y] + "  ");
            }
            System.out.println();
        }
    }
}
