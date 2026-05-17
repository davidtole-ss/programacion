package RepasoExamenFormulario.Form2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CambiaColor extends JFrame {
    private JPanel panel1;
    private JButton cambiar;
    private JButton Salir;
    private JRadioButton rojo;
    private JRadioButton azul;
    private JRadioButton verde;
    private JPanel panel2;
    private JCheckBox checkBox1;

    public static void main(String[] args) {
        CambiaColor frame = new CambiaColor();
    }

    public CambiaColor(){
        setContentPane(panel1);
        setTitle("Convertidor");
        setSize(500,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(rojo);
        grupo.add(azul);
        grupo.add(verde);

        Salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        cambiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(rojo.isSelected()){
                    panel2.setBackground(new Color(255,0,0));
                }else if(azul.isSelected()){
                    panel2.setBackground(new Color(0,0,255));
                }else if(verde.isSelected()){
                    panel2.setBackground(new Color(0,255, 0));
                }
            }
        });
    }

}
