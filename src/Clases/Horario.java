
package Clases;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Felipe
 */
public class Horario extends javax.swing.JPanel{
    private FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo de imagen","jpg", "png");
    String ruta;
    int x, y;

    public Horario(JPanel jPanel1) {
        ruta="";
        this.x = jPanel1.getWidth();
        this.y = jPanel1.getHeight();
        this.setSize(x, y);
    }

    @Override
    public void paint(Graphics g) {
        
        ImageIcon Img = new ImageIcon(getClass().getResource("/Images/imagen1.png"));
        JFileChooser seleccionar = new JFileChooser();
        //seleccionar.setFileFilter(filtro);
        //int option = seleccionar.showOpenDialog(this);
        //if(option==JFileChooser.APPROVE_OPTION){
            //Ruta = seleccionar.getSelectedFile().getPath();
            //ImageIcon Img = new ImageIcon(getClass().getResource(Ruta));
            //System.out.println(Ruta);
            g.drawImage(Img.getImage(), 0, 0, x, y, null);
       // }else{
            
        //}
    }
    
    
}
