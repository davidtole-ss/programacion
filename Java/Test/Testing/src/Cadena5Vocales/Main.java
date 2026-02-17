package Cadena5Vocales;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        String palabra = "";
        boolean seguir = true;
        int a;
        int e;
        int i;
        int o;
        int u;
        int vocalRepetida=0;
        int tamanioPalabra=0;
        String vocalMasRepetida="a";
        String vocalUno="";
        boolean seguir2=true;
        while (seguir) {
            System.out.println("Ingrese una palabra: ");
            palabra = datos.nextLine();
            a=0;e=0;i=0;o=0;u=0;
            for (int x = 0; x < palabra.length(); x++) {
                switch (palabra.toLowerCase().charAt(x)) {
                    case 'a':
                        a++;
                        break;
                    case 'e':
                        e++;
                        break;
                    case 'i':
                        i++;
                        break;
                    case 'o':
                        o++;
                        break;
                    case 'u':
                        u++;
                        break;
                }
            }
            if(a>0&&e>0&&i>0&&o>0&&u>0){
                while (seguir2&&palabra.length()>tamanioPalabra) {
                    if(palabra.toLowerCase().charAt(tamanioPalabra)=='a') {
                        vocalUno="a";
                        seguir2=false;
                    }else if(palabra.toLowerCase().charAt(tamanioPalabra)=='e') {
                        vocalUno="e";
                        seguir2=false;
                    }else if(palabra.toLowerCase().charAt(tamanioPalabra)=='i') {
                        vocalUno="i";
                        seguir2=false;
                    }else if(palabra.toLowerCase().charAt(tamanioPalabra)=='o') {
                        vocalUno="o";
                        seguir2=false;
                    }else if(palabra.toLowerCase().charAt(tamanioPalabra)=='u') {
                        vocalUno="u";
                        seguir2=false;
                    }
                    tamanioPalabra++;
                }
                vocalRepetida=a;
                if(vocalRepetida<e){
                    vocalMasRepetida="e";
                    vocalRepetida=e;
                }
                if(vocalRepetida<i){
                    vocalMasRepetida="i";
                    vocalRepetida=i;
                }
                if(vocalRepetida<o){
                    vocalMasRepetida="o";
                    vocalRepetida=o;
                }
                if(vocalRepetida<u){
                    vocalMasRepetida="u";
                    vocalRepetida=u;
                }
                seguir = false;
            }
        }

        System.out.println("La vocal mas veces introducida es la "+vocalMasRepetida+" repetida "+vocalRepetida+" veces.");
        System.out.println("La primera vocal introducida : "+vocalUno);
    }
}
