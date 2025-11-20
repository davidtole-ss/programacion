package ClaseCoche;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        Coche coche1 = new Coche("A4", 250, "B");
        coche1.setMarca("Audi");
        coche1.mostrarInformacion();
        boolean resultadoZBE = coche1.comprobarZBE(coche1.getEtiquetaEcologica());
        System.out.println(resultadoZBE);
        coche1.sobrePasoVelocidadMaximaP();

        coche1.ejemploSinStatic();
        Coche.ejemploConStatic();
    /*
    int resultadoVelocidadMaxima;
    if(coche1.getVelocidadMaxima()<120){
        resultadoVelocidadMaxima=coche1.sobrepasoVelocidadMaxima(coche1.getVelocidadMaxima());
        System.out.println("El coche va a "+resultadoVelocidadMaxima+"km/h por debajo de la velocidad maxima.");
    }else{
        resultadoVelocidadMaxima=coche1.sobrepasoVelocidadMaxima(coche1.getVelocidadMaxima());
        System.out.println("El coche va a "+resultadoVelocidadMaxima+"km/h por encima de la velocidad maxima.");
    }*/


        /*
        Coche coche2 = new Coche("Dacia", "Sandero", 110, "Eco");
        coche2.mostrarInformacion();
        boolean resultadoZBE2 = coche2.comprobarZBE(coche2.getEtiquetaEcologica());
        System.out.println(resultadoZBE2);
        coche2.sobrePasoVelocidadMaximaP();

        Coche coche3 = new Coche();
        System.out.println("Introduce el modelo del coche");
        String modelo = datos.nextLine();
        coche3.setModelo(modelo);
        System.out.println("Introduce la marca del coche");
        String marca = datos.nextLine();
        coche3.setMarca(marca);
        System.out.println("Introduce la velocidad maxima del coche");
        int velocidadMaxima = datos.nextInt();
        coche3.setVelocidadMaxima(velocidadMaxima);
        datos.nextLine();
        System.out.println("Introduce la etiqueta ecologica del coche");
        String etiquetaEcologica3 = datos.nextLine();
        coche3.setEtiquetaEcologica(etiquetaEcologica3);
        boolean etiquetaCoche3 = coche3.comprobarZBE(coche3.getEtiquetaEcologica());
        coche3.mostrarInformacion();
        */


    }
}
