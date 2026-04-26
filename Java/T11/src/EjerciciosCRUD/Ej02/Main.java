package EjerciciosCRUD.Ej02;

import EjerciciosCRUD.Ej02.config.ConexionSQLITE;
import EjerciciosCRUD.Ej02.model.Estudiante;
import EjerciciosCRUD.Ej02.repository.EstudianteDAO;


import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ConexionSQLITE conexion = new ConexionSQLITE();
        boolean existe=conexion.exist();
        if(existe){
            System.out.println("Conectando...");
            EstudianteDAO edao = new EstudianteDAO();
            edao.crearTabla();
            boolean seguir = true;
            Scanner sc = new Scanner(System.in);

            while (seguir) {
                System.out.println("--- Gestión de Estudiantes ---");
                System.out.println("1. Agregar estudiante");
                System.out.println("2. Mostrar estudiantes");
                System.out.println("3. Actualizar curso de estudiante");
                System.out.println("4. Eliminar estudiante");
                System.out.println("5. Salir");
                System.out.print("Seleccione una opción: ");
                int opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1:
                        System.out.println("Ingresa el nombre:");
                        String nombre = sc.nextLine();
                        System.out.println("Ingresa los apellidos:");
                        String apellidos = sc.nextLine();
                        System.out.println("Ingresa la edad:");
                        int edad = Integer.parseInt(sc.nextLine());
                        System.out.println("Ingresa el curso:");
                        String curso = sc.nextLine();
                        edao.insertar(new Estudiante(0, nombre, apellidos, edad, curso));
                        break;
                    case 2:
                        List<Estudiante> estudiantes = edao.obtenerTodas();
                        System.out.println("Lista de estudiantes:");
                        for (Estudiante e : estudiantes) {
                            System.out.println(e);
                        }
                        break;
                    case 3:
                        System.out.println("Ingresa el nombre del estudiante:");
                        nombre = sc.nextLine();
                        System.out.println("Ingresa el apellido del estudiante:");
                        String apellido = sc.nextLine();
                        System.out.println("Ingresa el nuevo curso:");
                        curso = sc.nextLine();
                        edao.actualizar(nombre, apellido, curso);
                        break;
                    case 4:
                        System.out.println("Ingresa el nombre:");
                        nombre = sc.nextLine();
                        System.out.println("Ingresa los apellidos:");
                        apellidos = sc.nextLine();
                        edao.eliminar(nombre, apellidos);
                        break;
                    case 5:
                        seguir = false;
                }
            }
            sc.close();
        }else{
            System.out.println("Error al conectar con la base de datos.");
        }

    }
}