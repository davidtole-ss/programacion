package EjerciciosTema10.EjerciciosLecturaEscritura.Ej02;

import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        String [] array={"Uno","Dos","Tres","Cuatro","Cinco"};
        escribeCadenas(array);
    }
    public static void escribeCadenas(String []array){
        try{
            FileWriter fr= new FileWriter("C:\\archivosTxt\\ej02PruebaArray.csv");
            for (String s : array) {
                fr.write(s + "|");
            }
            fr.close();
        }catch(Exception e){
            System.err.print(e.getMessage());
        }
    }
}
