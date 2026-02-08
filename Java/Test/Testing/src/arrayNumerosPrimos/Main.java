package arrayNumerosPrimos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int [] arrray= new int [10];
        for(int i=0;i<arrray.length;i++){
            System.out.println("Introduce el valor del numero "+(i+1)+":");
            arrray[i]=datos.nextInt();
        }
        int cuentaDivisores=0;
        int cuentaPrimos=0;
        for(int j=0;j<arrray.length;j++){
            cuentaDivisores=0;
            for(int i=1;i<=arrray[j];i++){
                if(arrray[j]%i==0){
                    cuentaDivisores++;
                }
            }
            if(cuentaDivisores<3&&arrray[j]>1){
                System.out.println("Numero primo: "+arrray[j]);
                cuentaPrimos++;
            }
        }
        if(cuentaPrimos==0){
            System.out.println("No hay numeros primos.");
        }
    }
}
