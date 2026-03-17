package EjemploClaseFile.Serializable;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona("Juan", 30);
        try {
            FileOutputStream fos = new FileOutputStream("C:\\archivosTxt\\persona.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(persona);
            System.out.println("Objeto serializado.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try
        {
            FileInputStream fis = new FileInputStream("C:\\archivosTxt\\persona.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Persona personaDeserializada = (Persona) ois.readObject();
            System.out.println("Objeto deserializado: " + personaDeserializada);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
