

package gestiongaraje;

import javax.swing.JOptionPane;

/**
 *
 * @author plago-bergonpazos
 */
public class GestionGaraje {

    
    public static void main(String[] args) {
        Garaje obx = new Garaje();
        
        
        
        obx.aparcar();
        float nh = obx.calcularPrecio();
       String matricula = obx.matricula();
        
         JOptionPane.showMessageDialog(null,"\n" +nh+ "FACTURA\n"+"MATRICULA :"+ matricula +"\n"+"TIEMPO :"+"PRECIO :"+(1,5+(nh - 3 * 0.20)) );
    
        
        
    }
    
}
