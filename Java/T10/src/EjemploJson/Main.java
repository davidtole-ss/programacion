package EjemploJson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            Usuario usuario = new Usuario("Carlos López", 28, "carlos@example.com");
            objectMapper.writeValue(new File("C:\\archivosTxt\\usuario.json"), usuario);
            System.out.println("Archivo JSON creado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try {
            Usuario usuario = objectMapper.readValue(new File("c:\\archivosTxt\\usuario.json"), Usuario.class);
            System.out.println("Datos del usuario:");
            System.out.println(usuario);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}