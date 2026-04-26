package EjemplosFormularios.frm4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class formulario4 extends JFrame {
    private JPanel panel1;
    private JButton botonSumar;
    private JTextArea textArea1;
    private JButton sumar;
    private JButton restar;

    public static void main(String[] args) {
        formulario4 frm = new formulario4();
    }
    public formulario4() {
        setContentPane(panel1);
        setTitle("Formulario de bienvenida");
        setSize(500,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        sumar.setText("+");
        restar.setText("-");
        setVisible(true);

        sumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num=textArea1.getText();
                Integer sumar=Integer.parseInt(num);
                sumar=sumar+1;
                textArea1.setText(sumar.toString());
            }
        });
        restar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num=textArea1.getText();
                Integer sumar=Integer.parseInt(num);
                sumar=sumar-1;
                textArea1.setText(sumar.toString());
            }
        });



    }
}
