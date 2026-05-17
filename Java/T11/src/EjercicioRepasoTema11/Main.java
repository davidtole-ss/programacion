package EjercicioRepasoTema11;

import EjercicioRepasoTema11.model.Factura;
import EjercicioRepasoTema11.repository.FacturaDAO;

public class Main {
    public static void main(String[] args) {
        FacturaDAO facturaDAO = new FacturaDAO();
        for(Factura factura:facturaDAO.listar()){
            System.out.println(factura);
        }
        System.out.println();
        facturaDAO.modificar(1,new Factura(null,14));
        for(Factura factura:facturaDAO.listar()){
            System.out.println(factura);
        }
        System.out.println();
        facturaDAO.eliminar(new Factura(3,null));
        for(Factura factura:facturaDAO.listar()){
            System.out.println(factura);
        }
        System.out.println();
        for(Factura factura:facturaDAO.listar()){
            if(factura.getId()<3){
                System.out.println(factura);
            }
        }
    }
}
