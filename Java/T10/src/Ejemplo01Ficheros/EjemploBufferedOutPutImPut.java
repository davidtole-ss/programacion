package Ejemplo01Ficheros;

import java.io.*;

public class EjemploBufferedOutPutImPut {
    public static void main(String[] args) {
        try {
            long inicio = System.currentTimeMillis();
            FileOutputStream fos = new FileOutputStream("C:\\archivosTxt\\Ejemplo2.bin");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            for (int i = 0; i < 1000000; i++) {
                bos.write(i);
            }
            bos.close(); // <-- aquí se vacía el buffer
            long fin = System.currentTimeMillis();
            System.out.println("Con buffer: " + (fin - inicio) + " ms");
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
        try {
            FileInputStream fis = new FileInputStream("C:\\archivosTxt\\Ejemplo2.bin");
            BufferedInputStream bis = new BufferedInputStream(fis);
            int byteLeido;
            while ((byteLeido = bis.read()) != -1) {
            //System.out.print(byteLeido + " ");
                System.out.print((char) byteLeido);
            }
            bis.close();
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
}

