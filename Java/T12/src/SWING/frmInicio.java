package SWING;

import javax.swing.*;

public class frmInicio extends JFrame {
    public frmInicio () {
        setSize(400, 200);
        setTitle("Hola mundo!");
// Permite cerrar el formulario
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Centra la ventana en la pantalla
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
