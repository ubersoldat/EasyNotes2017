package Run;

import Interfaces.PaginaPrincipal;
import Operaciones.Operaciones;

/**
 *
 * @author Felipe
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PaginaPrincipal p = new PaginaPrincipal();
        //Operaciones op = new Operaciones();
        //op.datosPaginaPrincipal();
        //System.out.println(op.datosPaginaPrincipal());
        
        p.setVisible(true);
        
    }    
}
