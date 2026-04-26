package EjerciciosCRUD.Ej01;


import EjerciciosCRUD.Ej01.model.Libro;
import EjerciciosCRUD.Ej01.repository.LibroDAO;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibroDAO ldao = new LibroDAO();
        ldao.crearTabla();
        boolean seguir=true;
        Scanner sc = new Scanner(System.in);
        while(seguir){
            System.out.println("--- Gestión de Biblioteca ---");
            System.out.println("1. Agregar libro");
            System.out.println("2. Mostrar libros");
            System.out.println("3. Actualizar información del libro");
            System.out.println("4. Eliminar libro");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            int opcion = Integer.parseInt(sc.nextLine());
            switch (opcion){
                case 1:
                    System.out.println("Ingresa el autor del libro:");
                    String autor = sc.nextLine();
                    System.out.println("Ingresa el titulo del libro:");
                    String titulo = sc.nextLine();
                    System.out.println("Ingresa el anio del libro:");
                    String anio = sc.nextLine();
                    ldao.insertar(new Libro(1,autor,titulo,anio));
                    break;
                case 2:
                    List<Libro> libros=ldao.obtenerTodas();
                    System.out.println("Lista de libros:");
                    for(Libro l:libros){
                        System.out.println(l);
                    }
                    break;
                case 3:
                    System.out.println("Ingresa el nombre del nuevo autor:");
                    autor=sc.nextLine();
                    System.out.println("Ingresa el nuevo titulo:");
                    titulo=sc.nextLine();
                    System.out.println("Ingresa el anio a buscar:");
                    anio=sc.nextLine();
                    ldao.actualizar(autor,titulo,anio);
                    break;
                case 4:
                    System.out.println("Ingresa el id del libro del que se quiere eliminar: ");
                    int id_libro = Integer.parseInt(sc.nextLine());
                    ldao.eliminar(id_libro);
                    break;
                case 5:
                    seguir=false;
            }
        }
    }
}
