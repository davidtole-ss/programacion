import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int intentos = 0;
        boolean adivinar = true;
        int azar = (int) (Math.random() * 50) + 1;
        System.out.println(azar);

        while (adivinar && intentos <6) {
            System.out.println("Introduce un numero del 1 al 50.");
            int numero = datos.nextInt();
            if (numero < azar) {
                System.out.println("Mayor");
                intentos++;

            } else {
                if (numero > azar) {
                    System.out.println("Menor");
                    intentos++;

                } else {
                    System.out.println("Has adivinado el número aleatorio, que era: "+azar);
                    System.out.println("Lo has conseguido en el intento nº: "+(intentos+1));
                    adivinar = false;
                    if (intentos== 6) {
                        intentos++;
                    }
                }

            }

        }
        if (intentos==6){
            System.out.println("Has alcanzado el numero maximo de intentos.");
        }

    }

}

