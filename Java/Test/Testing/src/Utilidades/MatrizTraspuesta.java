package Utilidades;

public class MatrizTraspuesta {
    public static void main(){
        int [][] matriz= {
                {1,2,3},
                {4,5,6},
                {7,8,9}


        } ;
        for(int i = 0; i < matriz[0].length; i++){
            for(int j = 0; j < matriz.length; j++){
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println();
        }


    }

}
