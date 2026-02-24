package generico.EjemplosGenéricos;

public class MainPersonaPlus {
    public static void main(String[] args) {
        PersonaPlus<Integer, String, String> p1 = new PersonaPlus<>("Pedro", "Emilio", 34);
        p1.mostrar();
        PersonaPlus p2 = new PersonaPlus(true, 12, "Pepe");
        p2.mostrar();


    }
}
