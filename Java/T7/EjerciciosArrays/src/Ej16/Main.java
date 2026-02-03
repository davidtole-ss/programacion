package Ej16;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] array =creaArrayAleatorio(5,15);
        System.out.println(Arrays.toString(array));
    }

    //Método que crea un array con el tamaño que tu quieras y con valores aleatorios y primos
    public static int[] creaArrayAleatorio(int min, int max){
        Scanner datos = new Scanner(System.in);
        System.out.print("Introduce el tamaño del array.");
        int tam=datos.nextInt();
        int [] array= new int[tam];
        for(int i=0;i<tam;i++){
            boolean esPrimo=true;
            while(esPrimo){
                int numero=generadorNumeros(min,max);
                if(esPrimo(numero)){
                    array[i]=numero;
                    esPrimo=false;
                }
            }
        }return array;
    }
    //Método que genera un numero aleatorio entre el rango que el pases
    private static int generadorNumeros(int min, int max){
        int numeroAleatorio=(int)(Math.random()*(max-min+1)+min);
        return numeroAleatorio;
    }
    //Método que comprueba si es primo
    public static boolean esPrimo(int numero) {
        int cuentaDivisores = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                cuentaDivisores++;
            }
        }
        if (cuentaDivisores <= 2&&numero>1) {
            return true;
        } else {
            return false;
        }
    }
}
