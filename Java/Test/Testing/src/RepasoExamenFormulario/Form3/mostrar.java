package RepasoExamenFormulario.Form3;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class mostrar extends JFrame {
    private JPanel panel1;
    private DefaultTableModel modelo;
    private JTable tabla;
    private JTable table1;

    public mostrar() {

        setContentPane(panel1);

        setTitle("Mostrar Tabla");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(400, 400);
        setResizable(false);
        setLocationRelativeTo(null);

        modelo = new DefaultTableModel();

        modelo.addColumn("ID");
        modelo.addColumn("Título");
        modelo.addColumn("Plataforma");
        modelo.addColumn("Precio");

        tabla.setModel(modelo);
        cargarDatos();

        setVisible(true);
    }

    public void cargarDatos() {

        VideojuegoDAO dao = new VideojuegoDAO();

        List<Videojuego> lista = dao.obtenerVideosjuego();

        for (Videojuego v : lista) {

            modelo.addRow(new Object[]{

                    v.getId(),
                    v.getTitulo(),
                    v.getPlataforma(),
                    v.getPrecio()

            });
        }
    }
}
