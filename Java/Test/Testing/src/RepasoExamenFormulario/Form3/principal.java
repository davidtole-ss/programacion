package RepasoExamenFormulario.Form3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class principal extends javax.swing.JFrame {
    private JPanel panel1;
    private JButton insertarButton;
    private JButton mostrarButton;
    private JButton salirButton;

    public static void main(String[] args) {
        principal frm = new principal();

    }
    public principal() {
        setContentPane(panel1);
        setTitle("Principio");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        insertarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                insertar insertar = new insertar();
                insertar.setVisible(true);
            }
        });
        mostrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                mostrar mostrar = new mostrar();

                mostrar.setVisible(true);
            }
        });
    }
}
