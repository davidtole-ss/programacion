package Utilidades;

public class OrdenarAsc {

        public static void main(String[] args) {

            int[] numeros = {5, 2, 9, 1, 7};
            int [] numerosOrdenados=ordenaArrayAscendente(numeros);

            for (int n : numerosOrdenados) {
                System.out.print(n + " ");
            }
        }
        public static int [] ordenaArrayAscendente(int []array){
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 0; j < array.length - 1; j++) {

                    if (array[j] > array[j + 1]) {  // condición ascendente
                        int aux = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = aux;
                    }
                }
            }
            return array;
        }
   }
    


