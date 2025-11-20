package ClaseCoche;

public class Coche {
    private String marca;
    private String modelo;
    private int velocidadMaxima;
    private String etiquetaEcologica;

    public Coche() {

    }

    public Coche(String pmarca, String pmodelo, int pvelocidadMaxima, String petiquetaEcologica) {
        this.marca = pmarca;
        this.modelo = pmodelo;
        this.velocidadMaxima = pvelocidadMaxima;
        this.etiquetaEcologica = petiquetaEcologica;
    }

    public Coche(String pmodelo, int pvelocidadMaxima, String petiquetaEcologica) {

        this.modelo = pmodelo;
        this.velocidadMaxima = pvelocidadMaxima;
        this.etiquetaEcologica = petiquetaEcologica;
    }
    //get y set

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String pmarca) {
        this.marca = pmarca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String pmodelo) {
        this.modelo = pmodelo;
    }

    public int getVelocidadMaxima() {
        return this.velocidadMaxima;
    }

    public void setVelocidadMaxima(int pvelocidadMaxima) {
        this.velocidadMaxima = pvelocidadMaxima;
    }

    public String getEtiquetaEcologica() {
        return this.etiquetaEcologica;
    }

    public void setEtiquetaEcologica(String petiquetaEcologica) {
        this.etiquetaEcologica = petiquetaEcologica;
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Etiqueta ecologica: " + this.etiquetaEcologica);

    }

    public boolean comprobarZBE(String etiquetaEcologica) {
        boolean resultado = true;
        if (this.etiquetaEcologica.equals("0") || this.etiquetaEcologica.equals("Eco")) {
            resultado = true;

        } else {
            resultado = false;
        }
        return resultado;

    }

    public int sobrepasoVelocidadMaxima(int velocidadMaxima) {
        int velocidadRecomendada = 120;
        int resultado = 0;
        if (velocidadMaxima < velocidadRecomendada) {
            resultado = velocidadRecomendada - velocidadMaxima;
        } else {
            resultado = velocidadMaxima - velocidadRecomendada;
        }

        return resultado;
    }

    public void sobrePasoVelocidadMaximaP() {
        int velocidadRecomendada = 120;
        int resultado = 0;
        if (this.velocidadMaxima == velocidadRecomendada) {
            System.out.println("El coche circula a la velocidad recomendada.");
        } else {
            if (this.velocidadMaxima < velocidadRecomendada) {
                resultado = velocidadRecomendada - velocidadMaxima;
                System.out.println("El coche circula a " + resultado + "km/h por debajo de la velocidad maxima.");
            } else {
                resultado = velocidadMaxima - velocidadRecomendada;
                System.out.println("El coche circula a " + resultado + "km/h por encima de la velocidad maxima.");
            }

        }

    }

    public void ejemploSinStatic(){
        System.out.println("Resultado sin STATIC");
    }

    public static void ejemploConStatic(){
        System.out.println("Resultado con STATIC");
    }

}
