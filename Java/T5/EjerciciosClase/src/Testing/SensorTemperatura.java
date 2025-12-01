package Testing;

public class SensorTemperatura {
    private int id;
    private double temperatura;

    public SensorTemperatura() {

    }

    public SensorTemperatura(int id, double temperatura) {
        this.id = id;
        this.temperatura = temperatura;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTemperatura() {
        return this.temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public void evaluarTemperatura() {
        if (this.temperatura < 0) {
            System.out.println("Temperatura bajo cero.");

        } else {
            if (this.temperatura == 0 || this.temperatura <= 30) {
                System.out.println("Temperatura normal.");
            } else {
                System.out.println("Temperatura alta.");
            }
        }

    }
}
