package EjerciciosRepasoClase.Ej01;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try{
            String [] array1={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O"};
            Integer [] array2={81,32,23,24,52,62,27,82,29,102,112,122,123,124,125};
            FileWriter fw=new FileWriter("C:\\archivosTxt\\ejercicio1Repaso.txt");
            BufferedWriter bw=new BufferedWriter(fw);
            int contador=1;
            for(int i=0;i<15;i++){
                if(i<9){
                    bw.write("0"+contador+"|"+array1[i]+"|"+array2[i]);
                    contador++;
                    bw.newLine();
                }else{
                    bw.write(contador+"|"+array1[i]+"|"+array2[i]);
                    contador++;
                    bw.newLine();
                }
            }
            bw.close();
        }catch(Exception e){
            System.out.println("Error: "+e);

        }
    }
}
