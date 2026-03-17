package Ejemplo01Ficheros;

import java.io.*;

public class FileOutPutImPut {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("C:\\archivosTxt\\nuevo_archivo.bin");
            byte [] datos = {65, 66, 67}; // Ejemplo: bytes que representan caracteres ASCII
            fos.write(datos);
            fos.close();
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }

        try {
            FileInputStream fis = new FileInputStream("C:\\archivosTxt\\nuevo_archivo.bin");
            int byteLeido = fis.read();
            while (byteLeido != -1) {
                System.out.print((char)byteLeido);
                byteLeido = fis.read();
            }
            fis.close();
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
}


