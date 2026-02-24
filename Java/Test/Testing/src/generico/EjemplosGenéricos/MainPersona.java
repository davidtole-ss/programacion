package generico.EjemplosGenéricos;

public class MainPersona {
    public static void main(String[] args) {
        // Instanciamos una clase Persona con la edad en Integer
        Persona<Integer> persona1 = new Persona<Integer>("Somos", "Hackers de la Programacion", 32);
        // Instanciamos una clase Persona con la edad en Double
        Persona<Double> persona2 = new Persona<Double>("Somos", "Hackers de la Programacion", 32.3);
        persona1.mostrarPersona();
        persona2.mostrarPersona();



    }
}
