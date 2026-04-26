package AWT;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setSize(400, 200);
        frame.setTitle("Hola mundo!");
// Crear el Label
        Label label = new Label("Hola mundo!", Label.CENTER);
// Añadir el Label al Frame
        frame.add(label);

        frame.setVisible(true);

    }
}
