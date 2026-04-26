package EjemplosFormularios.Ejemplo5_TIPO_EXAMEN;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmVentana2 extends JFrame{
    private JPanel panel1;
    private JButton btCerrar;
    private JLabel lbTextoCentral;
    private JPanel panelCentral;
    private JPanel panelInferior;

    public frmVentana2() {
        setContentPane(panel1);
        setTitle("Mi primer GUI");
        setSize(250,120);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        btCerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}
