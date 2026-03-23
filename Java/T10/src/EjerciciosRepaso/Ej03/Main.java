package EjerciciosRepaso.Ej03;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("C:\\archivosTxt\\vehiculo.json");
        Vehiculo[] arrayVehiculos = objectMapper.readValue(file, Vehiculo[].class);
        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>(Arrays.asList(arrayVehiculos));
        int seis = 0;
        int siete = 0;
        int ocho = 0;
        int nueve = 0;
        int veinte = 0;
        int veintiuno = 0;
        int[] arrayAnio = new int[listaVehiculos.size()];
        for (int x = 0; x < listaVehiculos.size(); x++) {
            arrayAnio[x] = listaVehiculos.get(x).getAnio();
        }
        for (int v : arrayAnio) {
            if (v == 2016) {
                seis++;
            } else if (v == 2017) {
                siete++;
            } else if (v == 2018) {
                ocho++;
            } else if (v == 2019) {
                nueve++;
            } else if (v == 2020) {
                veinte++;
            } else if (v == 2021) {
                veintiuno++;
            }
        }
        System.out.println("2016: " + seis + " modelos.");
        System.out.println("2017: " + siete + " modelos.");
        System.out.println("2018: " + ocho + " modelos.");
        System.out.println("2019: " + nueve + " modelos.");
        System.out.println("2020: " + veinte + " modelos.");
        System.out.println("2021: " + veintiuno + " modelos.");

        Double mediaPrecio=mediaPrecio(arrayVehiculos);
        System.out.printf("Media precio:  %.2f", mediaPrecio);
    }

    public static Double mediaPrecio(Vehiculo[] arrayVehiculos) {
        double suma = 0;
        for (int x = 0; x < arrayVehiculos.length; x++) {
            suma += arrayVehiculos[x].getPrecio();
        }
        return suma / arrayVehiculos.length;
    }
}
