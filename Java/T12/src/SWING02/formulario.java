package SWING02;



import javax.swing.*;

public class formulario extends JFrame {
    private JPanel Panel1;
    private JLabel lblText;

    public static void main(String[] args) {
        formulario frame = new formulario();
    }
    public formulario() {
        setContentPane(Panel1);
        setTitle("Formulario de bienvenida");
        setSize(450,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Centra la ventana en la pantalla
        setLocationRelativeTo(null);
        lblText.setText("Hola mundo");
        setVisible(true);
    }
}
