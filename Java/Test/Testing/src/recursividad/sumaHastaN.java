package recursividad;

public class sumaHastaN {
    public static void main() {
        System.out.println(suma(5));

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

    public static int potencia2(int n){
        if(n==0){
            return 1;
        }
        return 2 *potencia2(n-1);

    }

    public static int suma(int n){
        if(n==1){
            System.out.print("1 = ");
            return 1;
        }
        System.out.print(n+" + ");
        return n+suma(n-1);
    }


    public static int sumaAsc(int n){

        if(n == 1){
            System.out.print("1 ");
            return 1;
        }
        int resultado = sumaAsc(n-1);
        System.out.print("+ " + n+" ");
        return resultado + n;
    }


}
