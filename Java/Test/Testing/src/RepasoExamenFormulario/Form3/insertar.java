package RepasoExamenFormulario.Form3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class insertar extends JFrame {
    private JPanel panel1;
    private JTextField titulo;
    private JComboBox plataforma;
    private JTextField precio;
    private JButton guardar;
    private JButton salirButton;
    private JPanel panel2;

    public static void main(String[] args) {
        insertar g = new insertar();
    }

    public insertar() {
        setContentPane(panel1);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Insertar:");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setVisible(true);

        guardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VideojuegoDAO vdao = new VideojuegoDAO();
                vdao.crearTabla();
                Videojuego videojuego = new Videojuego();
                videojuego.setTitulo(titulo.getText());
                videojuego.setPlataforma(plataforma.getSelectedItem().toString());
                videojuego.setPrecio(Double.parseDouble(precio.getText()));
                vdao.insertarJuego(videojuego);
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
