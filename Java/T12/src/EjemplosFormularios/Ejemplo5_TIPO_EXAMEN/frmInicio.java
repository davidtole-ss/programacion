package EjemplosFormularios.Ejemplo5_TIPO_EXAMEN;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmInicio extends JFrame{
    private JPanel panel1;
    private JButton btAccion;
    private JButton btSalir;
    private JCheckBox cbAceptarCondiciones;
    private JRadioButton rbt1;
    private JPanel panelInferior;
    private JPanel panelCentral;
    private JRadioButton rbt2;
    private JRadioButton rbt3;
    private JComboBox cbCapitales;
    private JPanel panelSuperior;
    private JButton btVentana;

    public static void main(String[] args) {
        frmInicio fr = new frmInicio();
    }

    public frmInicio() {
        setContentPane(panel1);
        setTitle("Mi primer GUI");
        setSize(500,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rbt1);
        bg.add(rbt2);
        bg.add(rbt3);

        rbt1.setActionCommand("Opcion 1");
        rbt2.setActionCommand("Opcion 2");
        rbt3.setActionCommand("Opcion 3");

        String[] capitales = {"Madrid", "Paris", "Londres", "Berlin", "Dublin", "Moscu", "Pekin", "Lisboa"};
        for (String x : capitales) {
            cbCapitales.addItem(x);
        }

        setVisible(true);

        btSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        btAccion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(null, "Estado: " + cbAceptarCondiciones.isSelected(), "Estado del check box", JOptionPane.INFORMATION_MESSAGE);
                //JOptionPane.showMessageDialog(null, bg.getSelection().getActionCommand(), "Estado de los radio buttom", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Valor e indice: " + cbCapitales.getSelectedItem().toString() + " " +  cbCapitales.getSelectedIndex(), "Estado del combo box", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        btVentana.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmVentana2 frmV2 = new frmVentana2();
//                frmV2.setVisible(true);
            }
        });
    }
}
