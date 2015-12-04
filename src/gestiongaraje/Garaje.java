package gestiongaraje;

import javax.swing.JOptionPane;

/**
 *
 * @author plago-bergonpazos
 */
public class Garaje {

    private int numeroCoches = (int) (Math.random()*6);
    private int matricula;
    private float nh;
    
    public Garaje() {
    }

    public Garaje(int numeroCoches, int matricula, int nh) {
        
        this.numeroCoches = numeroCoches;
        this.matricula = matricula;
        this.nh = nh;
    }

    public void aparcar() {
        
        if (numeroCoches == 5) {
            JOptionPane.showMessageDialog(null, "¡¡¡GARAJE LLENO!!!");
        }

        if (numeroCoches > 5) {
            JOptionPane.showMessageDialog(null, "El subnormal de Adri no encontraba sitio y aparco en doble fila, asi que no hay sitio");
        }
        if (numeroCoches < 5) {
            JOptionPane.showMessageDialog(null, "Tuviste suerte, hay sitio");
        }
    }

    public float calcularPrecio() {
        float nh = Float.parseFloat(JOptionPane.showInputDialog("¿Cuantas horas vas a estar?"));

        if (nh == 3) {
            JOptionPane.showMessageDialog(null, "Tienes que pagar 1,5 l'Euros premoh");
        }
        if (nh > 3) {
            JOptionPane.showMessageDialog(null, "Tienes que pagar 1,5 l'Euros" + (nh - 3 * 0.20) + "premoh");
            }
        if (nh < 3) {
            JOptionPane.showMessageDialog(null, "Solo puedes estar un mnimo de 3 horas paleto");
        }
        return nh;
    }
    
    public String matricula(){
        return JOptionPane.showInputDialog("¿Cual es tu matrcula?");
    }
    
    
       
    
    

}
