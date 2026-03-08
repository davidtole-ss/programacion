package recursividad;

public class sumaHastaN {
    public static void main() {
        sumaAscendenteProd(4);
        System.out.println(factorial(5));
        System.out.println(cuentaDigitos(1234));
        System.out.println(sumaDigitos(123));
        System.out.println(potencia(3,4));

    }

    public static int sumaAscendente(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumaAscendente(n - 1);
    }
    public static void sumaAscendenteProd(int n) {
        if (n == 0) {
            return;
        }
        sumaAscendenteProd(n-1);
        System.out.println(n);
    }
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static int cuentaDigitos(int n){
        if(n<=0){
            return 0;
        }
        return 1 +cuentaDigitos(n/10);
    }

    public static int sumaDigitos(int n){
        if(n<=0){
            return 0;
        }
        return n%10+sumaDigitos(n/10);
    }
    public static int potencia(int base,int exponente){
        if(exponente==0){
            return 1;
        }
        return base *potencia(base,exponente-1);

    }


}
