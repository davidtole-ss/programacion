package Ejercicio11;

public class Automovil {
    private String marca;
    private String modelo;
    private double motor;
    private int numeroPuertas;
    private int cantidadAsientos;
    private int velocidadMaxima;
    private int velocidadActual;

    public Automovil() {

    }

    public Automovil(String marca, String modelo, double motor, int numeroPuertas, int cantidadAsientos, int velocidadMaxima, int velocidadActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.velocidadActual = velocidadActual;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;

    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getMotor() {
        return this.motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public int getNumeroPuertas() {
        return this.numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;

    }

    public int getCantidadAsientos() {
        return this.cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public int getVelocidadMaxima() {
        return this.velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getVelocidadActual() {
        return this.velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public void acelerar(int sumaVelocidad) {
        if (sumaVelocidad >= 0) {
            int contador = 0;
            int sobrePasoVelocidad = this.velocidadActual + sumaVelocidad;
            while (contador < sumaVelocidad && (this.velocidadActual < this.velocidadMaxima)) {
                contador++;
                this.velocidadActual += 1;

            }
            if (sobrePasoVelocidad > velocidadMaxima) {
                System.out.println("Se ha acelerado hasta la velocidad máxima, aunque intenes acelerrar mas no puedes.");
            }
        }


    }

    public void desacelerar(int restaVelocidad) {
        int contador = restaVelocidad;
        while (contador > 0 && (this.velocidadActual > 0)) {
            contador--;
            this.velocidadActual -= 1;
        }
        if ((this.velocidadActual - restaVelocidad) < 0) {
            System.out.println("No se puede frenar mas, el coche esta parado.");
        }

    }

    public void frenar() {
        this.velocidadActual = 0;
    }

    public void tiempoDeLlegada(double distanciaARecorrer) {
        double tiempoEstimado = distanciaARecorrer / this.velocidadActual;
        System.out.println("Tardas " + tiempoEstimado + " h en recorrer " + distanciaARecorrer + " km a una velocidad constante de " + this.velocidadActual + " km/h.");

    }

    public void mostrarInfo() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Motor: " + this.motor);
        System.out.println("Número de puertas: " + this.numeroPuertas);
        System.out.println("Cantidad de asientos: " + this.cantidadAsientos);
        System.out.println("Velocidad máxima: " + this.velocidadMaxima);
        System.out.println("Velocidad actual: " + this.velocidadActual);
    }
}
