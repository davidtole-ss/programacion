package EjerciciosRepaso.Ej01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try{
            String [] array1={"Aranjuez","Valdemro","Chinchon","Villaconejos","Noblejas"};
            String [] array2={"28300","28480","28370","28360","28450"};
            FileWriter fw=new FileWriter("C:\\archivosTxt\\ejercicioRepasoCodigosPostales.txt");
            BufferedWriter bw=new BufferedWriter(fw);
            int contador=1;
            for(int i=0;i<array1.length;i++){
                for(int j=0;j<5;j++){
                    bw.write(array1[i]+"|"+array2[i]+"|"+contador);
                    contador++;
                    bw.newLine();
                }
                bw.newLine();
            }
            bw.close();
        }catch(Exception e){
            System.out.println("Error: "+e);

        }
    }
}
