/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package generadorllistats;

import javax.swing.JOptionPane;

/**
 *
 * @author Roig
 */
public class fitxerException extends Exception{
    
    public void Missatge(){
     JOptionPane.showMessageDialog(null,"EL FITXER QUE HAS SELECCIONAT NO"
             + " ES CORRECTE, SELECCIONA UN FITXER AMB EXTENSIÓ .CSV");
    }
}
