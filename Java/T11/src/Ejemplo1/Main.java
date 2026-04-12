package Ejemplo1;

public class Main {
    public static void main(String[] args) {
        // tu código...
        PersonaDAO dao = new PersonaDAO();
        dao.crearTabla();
        dao.insertar(new Persona(0, "Juan Pérez", 30));
        dao.insertar(new Persona(0, "Ana López", 25));
        System.out.println("Lista de personas:");
        for (Persona p : dao.obtenerTodas()) {
            System.out.println(p.getId() + ": " + p.getNombre() + " - " + p.getEdad());
        }
        dao.actualizar(1, "Juan Pérez Actualizado", 31);
        dao.eliminar(2);
    }
}
