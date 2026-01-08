package Ejemplo1;

public class Perro extends Animal {
    private String raza;

    public Perro() {
        super();
    }
    public Perro(String nombre,int numPatas,String raza){
        super(nombre,numPatas);
        this.raza=raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void mostrarInfo(){
        System.out.println("Raza: "+raza);
    }

    @Override
    public void hacerSonido(){
        System.out.println("El perro "+this.getNombre()+" hace guau.");
    }

}
