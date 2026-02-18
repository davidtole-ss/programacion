package Utilidades;

public class OrdenarElementos {

        public static void main(String[] args) {

            int[] numeros = {5, 2, 9, 1, 7};

            for (int i = 0; i < numeros.length - 1; i++) {
                for (int j = 0; j < numeros.length - 1 - i; j++) {

                    if (numeros[j] < numeros[j + 1]) {  // CAMBIA el signo
                        int aux = numeros[j];
                        numeros[j] = numeros[j + 1];
                        numeros[j + 1] = aux;
                    }
                }
            }

            for (int n : numeros) {
                System.out.print(n + " ");
            }
        }
    }


