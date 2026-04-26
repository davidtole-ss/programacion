package EjemplosFormularios.frm2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class FormularioSwing extends JFrame {

    private JTextField txtNombre;
    private JTextField txtApellidos;
    private JTextField txtEdad;
    private JTextField txtEmail;
    private JButton btnGuardar;
    private JButton btnLimpiar;

    public FormularioSwing() {
        setTitle("Formulario de Usuario");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centra la ventana
        setLayout(new BorderLayout());

        // Panel principal con los campos
        JPanel panelCampos = new JPanel();
        panelCampos.setLayout(new GridLayout(4, 2, 10, 10));
        panelCampos.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        panelCampos.add(new JLabel("Nombre:"));
        txtNombre = new JTextField();
        panelCampos.add(txtNombre);

        panelCampos.add(new JLabel("Apellidos:"));
        txtApellidos = new JTextField();
        panelCampos.add(txtApellidos);

        panelCampos.add(new JLabel("Edad:"));
        txtEdad = new JTextField();
        panelCampos.add(txtEdad);

        panelCampos.add(new JLabel("Email:"));
        txtEmail = new JTextField();
        panelCampos.add(txtEmail);

        // Panel de botones
        JPanel panelBotones = new JPanel();
        btnGuardar = new JButton("Guardar");
        btnLimpiar = new JButton("Limpiar");

        panelBotones.add(btnGuardar);
        panelBotones.add(btnLimpiar);

        add(panelCampos, BorderLayout.CENTER);
        add(panelBotones, BorderLayout.SOUTH);

        // Acción botón Guardar
        btnGuardar.addActionListener((ActionEvent e) -> guardarDatos());

        // Acción botón Limpiar
        btnLimpiar.addActionListener((ActionEvent e) -> limpiarCampos());
    }

    private void guardarDatos() {
        String nombre = txtNombre.getText();
        String apellidos = txtApellidos.getText();
        String edad = txtEdad.getText();
        String email = txtEmail.getText();

        JOptionPane.showMessageDialog(
                this,
                "Datos guardados:\n" +
                        "Nombre: " + nombre + "\n" +
                        "Apellidos: " + apellidos + "\n" +
                        "Edad: " + edad + "\n" +
                        "Email: " + email
        );
    }

    private void limpiarCampos() {
        txtNombre.setText("");
        txtApellidos.setText("");
        txtEdad.setText("");
        txtEmail.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FormularioSwing formulario = new FormularioSwing();
            formulario.setVisible(true);
        });
    }
}
