package Ej01;

public class Main {
    public static void main(String[] args) {

        int [] num = new int [12];
        try{
            num[0] = 39;
            num[1] = -2;
            num[6] = 14;
            num[8] = 5;
            num[9] = 120;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("No existe el valor");
        }
    }
}
