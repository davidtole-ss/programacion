package EjemplosFormularios.Ejemplo6;



import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmAcelgas extends JFrame{
    private JPanel panel1;
    private JRadioButton rbtSumar;
    private JRadioButton rbtRestar;
    private JTextField tfNum1;
    private JTextField tfNum2;
    private JButton btGenerar;
    private JButton btSalir;
    private JPanel panelInferior;
    private JPanel panelCentral;
    private JPanel panelSuperior;
    private JLabel lbResultado;

    public static void main(String[] args) {
        frmAcelgas fr = new frmAcelgas();
    }

    public frmAcelgas() {
        setContentPane(panel1);
        setTitle("Mi primer GUI");
        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rbtSumar);
        bg.add(rbtRestar);
        rbtSumar.setActionCommand("sumar");
        rbtRestar.setActionCommand("restar");

        btGenerar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(tfNum1.getText());
                double num2 = Double.parseDouble(tfNum2.getText());

                switch(bg.getSelection().getActionCommand()) {
                    case "sumar":
                        lbResultado.setText(Double.toString(num1 + num2));
                        break;
                    case "restar":
                        lbResultado.setText(Double.toString(num1 - num2));
                        break;
                    default:
                        lbResultado.setText(null);
                        break;
                }
            }
        });
    }
}