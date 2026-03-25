package EjerciciosRepaso.Ej01;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class Main3 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\archivosTxt\\ejercicioRepasoCodigosPostales.txt");
        BufferedReader br = new BufferedReader(fr);
        String linea = br.readLine();
        ArrayList<Poblacion> lista = new ArrayList<>();
        while (linea != null) {
            if(!linea.isEmpty()){
                String[] linea2 = linea.split("\\|");
                String nombre=linea2[0];
                String codigoPostal=linea2[1];
                int id=Integer.parseInt(linea2[2]);
                lista.add(new Poblacion(nombre,codigoPostal,id));
            }
            linea = br.readLine();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("C:\\archivosTxt\\ejercicioRepasoCodigosPostales2.json"),lista);
        System.out.println(lista);
        br.close();
    }
}
