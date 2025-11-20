package Ejercicio06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        boolean seguir = true;
        Alumno alumno = new Alumno();

        while (seguir) {
            System.out.println("Ingresa la opcion que deseas realizar:");
            System.out.println("1.Insertar nuevo alumno:");
            System.out.println("2.¿Quieres modificar los datos?");
            System.out.println("3.¿Quieres modificar algun dato en especifico?");
            System.out.println("4.Poner todos los atributos a null.");
            System.out.println("5.Media de las notas del alumno.");
            System.out.println("6.Mostrar datos de alumno.");
            System.out.println("7.Salir.");
            int opcion = datos.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("1.Nombre.");
                    String nombre = datos.next();
                    System.out.println("2.Nombre asignatura.");
                    String nombreAsignatura = datos.next();
                    System.out.println("3.Nota parcial 1.");
                    double nota1 = datos.nextDouble();
                    System.out.println("4.Nota parcial 2.");
                    double nota2 = datos.nextDouble();
                    System.out.println("5.Nota exposicion.");
                    double notaExposicion = datos.nextDouble();
                    System.out.println("6.Nota ejercicios.");
                    double notaEjercicio = datos.nextDouble();
                    System.out.println("7.Nota trabajos.");
                    double notaTrabajo = datos.nextDouble();
                    alumno.insertarRegistro(nombre, nombreAsignatura, nota1, nota2, notaExposicion, notaEjercicio, notaTrabajo);
                    break;
                case 2:
                    System.out.println("¿Que dato quieres modificar?");
                    System.out.println("1.Nombre.");
                    System.out.println("2.Nombre asignatura.");
                    System.out.println("3.Nota parcial 1.");
                    System.out.println("4.Nota parcial 2.");
                    System.out.println("5.Nota exposicion.");
                    System.out.println("6.Nota ejercicios.");
                    System.out.println("7.Nota trabajos.");
                    int modificar = datos.nextInt();
                    switch (modificar) {
                        case 1:
                            System.out.println("Ingresa el nombre del alumno:");
                            String nuevoNombre = datos.next();
                            alumno.setNombre(nuevoNombre);
                            break;
                        case 2:
                            System.out.println("Ingresa el nombre de la asignatura.");
                            String nuevaAsignatura = datos.next();
                            alumno.setNombreAsignatura(nuevaAsignatura);
                            break;
                        case 3:
                            System.out.println("Ingresa la nota parcial 1.");
                            double parcial1 = datos.nextDouble();
                            alumno.setNotaParcial1Examen(parcial1);
                            break;
                        case 4:
                            System.out.println("Ingresa la nota parcial 2.");
                            double parcial2 = datos.nextDouble();
                            alumno.setNotaParcial2Examen(parcial2);
                            break;
                        case 5:
                            System.out.println("Ingresa la nota de exposicion.");
                            double exposicion = datos.nextDouble();
                            alumno.setNotaExposicion(exposicion);
                            break;
                        case 6:
                            System.out.println("Ingresa la nota ejercicios.");
                            double ejercicios = datos.nextDouble();
                            alumno.setNotaEjercicios(ejercicios);
                            break;
                        case 7:
                            System.out.println("Ingresa la nota de los trabajos.");
                            double trabajos = datos.nextDouble();
                            alumno.setNotaTrabajos(trabajos);
                            break;
                    }
                    break;
                case 3:
                    System.out.println("1.Nombre.");
                    nombre = datos.next();
                    System.out.println("2.Nombre asignatura.");
                     nombreAsignatura = datos.next();
                    System.out.println("3.Nota parcial 1.");
                     nota1 = datos.nextDouble();
                    System.out.println("4.Nota parcial 2.");
                     nota2 = datos.nextDouble();
                    System.out.println("5.Nota exposicion.");
                     notaExposicion = datos.nextDouble();
                    System.out.println("6.Nota ejercicios.");
                     notaEjercicio = datos.nextDouble();
                    System.out.println("7.Nota trabajos.");
                     notaTrabajo = datos.nextDouble();
                    alumno.modificarRegistro(nombre,nombreAsignatura,nota1,nota2,notaExposicion,notaEjercicio,notaTrabajo);
                    break;
                case 4:
                    alumno.eliminarRegsitro();
                    break;
                case 5:
                    double resultadoMedia = alumno.calcularNotaPrimeraEvaluacion(alumno.getNotaParcial1Examen(), alumno.getNotaParcial2Examen(), alumno.getNotaExposicion(), alumno.getNotaEjercicios(), alumno.getNotaTrabajos());
                    System.out.println("La media es: " + resultadoMedia);
                    break;
                case 6:
                    alumno.mostrarInformacion();
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    seguir = false;
                    break;

            }

        }


    }
}
