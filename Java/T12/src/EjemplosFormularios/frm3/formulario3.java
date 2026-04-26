package EjemplosFormularios.frm3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class formulario3 extends JFrame {


    private JPanel panel1;
    private JButton aceptarButton;
    private JButton salirButton;
    private JPanel PanelCentral;
    private JPanel PanelInferior;
    private JPanel PanelSuperior;
    private JTextField textField1;
    private JTextField textField2;

    public static void main(String args[]) {
        formulario3 frm = new formulario3();
    }
    public formulario3()
    {
        setContentPane(panel1);
        setTitle("Formulario de bienvenida");
        setSize(500,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        aceptarButton.setText("Aceptar");
        salirButton.setText("Salir");
        setVisible(true);

        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aceptarButton.setText("Cambio");
            }
        });
    }
}
