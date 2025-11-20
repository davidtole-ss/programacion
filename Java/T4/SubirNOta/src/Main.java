import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner date = new Scanner(System.in);
        int numero;
        int sumaPares=0;
        int contadorImpares=0;
        int numerosIntroducir=0;
        int contadorNegativos=0;
        System.out.println("Cuantos numeros quieres introducir: ");
        numerosIntroducir = date.nextInt();

        for(int i=1;i<=numerosIntroducir;i++){
            System.out.println("Introduce un numero");
            numero = date.nextInt();
            sumaPares = sumaPares+pares(numero);
            contadorImpares=contadorImpares+impares(numero);
            contadorNegativos=contadorNegativos+negativos(numero);

        }
        System.out.println("La suma de pares es: "+sumaPares);
        System.out.println("El numero de impares introducidos es: "+contadorImpares);
        System.out.println("El numero de negativos es: "+contadorNegativos);


    }

    public static int pares(int numero) {
        int resultado = 0;

        if (numero % 2 == 0&& numero > 0) {
            resultado=resultado+numero;
        }
        return resultado;
    }

    public static int impares(int numero) {
        int impares = 0;
        if (numero % 2 != 0) {
            impares++;
        }
        return impares;
    }

    public static int negativos(int numero) {
        int numeroNegativos = 0;
        if (numero<0) {
            numeroNegativos++;

        }
        return numeroNegativos;
    }
}
