package EjemplosFormularios.frm1;

import javax.swing.*;

public class formulario extends JFrame {
    private JPanel panel1;
    private JLabel nombre;
    private JTextField texto1;
    private JButton btnAceptar;
    private JLabel apellido;
    private JPanel panel2;
    private JButton salirButton;

    public static void main(String[] args) {
        formulario frm = new formulario();
    }

    public formulario() {
        setContentPane(panel1);
        setTitle("Formulario de bienvenida");
        setSize(500,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        nombre.setText("Nombre: ");
        apellido.setText("Apellido: ");
        setVisible(true);
    }


}
