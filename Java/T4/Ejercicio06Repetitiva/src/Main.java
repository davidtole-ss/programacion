import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        boolean continuar = true;
        int notas;
        double sumaNotas=0;
        double numeroNotas=0;
        double media=0;
        while (continuar) {
            System.out.println("Que deseas realizar?");
            System.out.println("1.Ingresar notas.");
            System.out.println("2.Media notas.");
            System.out.println("3.¿Media aprobada?");
            System.out.println("4.Salir programa.");
            int opcion = datos.nextInt();
            switch(opcion) {
                case 1:
                    System.out.println("Cuantas notas quieres ingresar.");
                    numeroNotas=datos.nextInt();
                    for (int i = 1; i <= numeroNotas; i++) {
                        System.out.println("Ingresa las notas.");
                        notas=datos.nextInt();
                        sumaNotas=sumaNotas+notas;
                    }
                    break;
                case 2:
                    media=sumaNotas/numeroNotas;
                    System.out.println("La media de tus notas es: "+media);
                    break;
                case 3:
                    if(media>=5){
                        System.out.println("Media aprobada.");
                    }else{
                        System.out.println("Media suspensa");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    continuar = false;
                    break;
                    default:
                        System.out.println("Opcion no valida.");
            }
        }
    }
}
