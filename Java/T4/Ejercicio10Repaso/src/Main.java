import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int numeroAlumnos = 30;
        int numeroNotas = 0;
        double sumaNotas = 0;
        int aprobado = 0;
        int suspensos = 0;
        double notaMax = 0;
        double notaMin = 0;
        double nota;
        boolean seguir = true;
        while (seguir && (numeroNotas <= numeroAlumnos)) {
            System.out.println("Introduce la nota");
            nota = datos.nextDouble();
            if (nota >= 0 && nota <= 10) {
                numeroNotas++;
                sumaNotas = sumaNotas + nota;
                if (notaMax < nota) {
                    notaMax = nota;
                }
                if (numeroNotas == 1) {
                    notaMin = nota;
                }
                if (nota < notaMin) {
                    notaMin = nota;
                }
                if (nota >= 5) {
                    aprobado++;
                } else {
                    suspensos++;
                }
            } else {
                System.out.println("La nota debe un numero comprendido entre 0 y el 10.");
                seguir = false;
            }
        }
        System.out.println("La nota minima es: " + notaMin);
        System.out.println("La nota maxima es: " + notaMax);
        System.out.println("La media de las notas es: " + sumaNotas / numeroNotas);
        System.out.println("Número de aprobados: " + aprobado);
        System.out.println("Número de suspensos: " + suspensos);
    }
}
