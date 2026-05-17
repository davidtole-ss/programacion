package RepasoExamenFormulario.Form1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class convertidorMonedas extends JFrame {
    private JPanel panel1;
    private JButton Obtener;
    private JButton salirButton;
    private JComboBox tipoMoneda;
    private JTextField cantidad;
    private JLabel conversion;

    public static void main(String[] args) {
        convertidorMonedas cm= new convertidorMonedas();
    }

    public convertidorMonedas() {
        setContentPane(panel1);
        setTitle("Convertidor");
        setSize(500,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Conversor Monedas");
        tipoMoneda.addItem("Yen");
        tipoMoneda.addItem("Dolar");
        setVisible(true);

        Obtener.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tipoMonedas = (String) tipoMoneda.getSelectedItem();
                Double cantidadMonedas = parseDouble(cantidad.getText());
                if(tipoMonedas.equals("Dolar")){
                    cantidadMonedas=cantidadMonedas*1.17;
                    conversion.setText("Dolares: "+cantidadMonedas);
                }else if(tipoMonedas.equals("Euro")){
                    cantidadMonedas=cantidadMonedas*184.67;
                    conversion.setText("Yen: "+cantidadMonedas);
                }
            }
        });
        salirButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               dispose();
            }
        });
    }
}
