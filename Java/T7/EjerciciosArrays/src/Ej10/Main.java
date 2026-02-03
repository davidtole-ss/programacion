package Ej10;

public class Main {
    public static void main(String[] args) {
        int [] temperaturaMeses={6,7,3,4,5,1,2,8,3,11,2,4};
        for(int temperatura:temperaturaMeses){
            System.out.println(temperatura);

        }
        for(int i=0;i<temperaturaMeses.length;i++){
            for(int j=0;j<temperaturaMeses[i];j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
