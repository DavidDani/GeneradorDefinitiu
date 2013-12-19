/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package generadorllistats;

/**
 *
 * @author Dani
 */
import java.util.List;

public class llistaAlumnes
{

    private List<Alumne> llistaAlumnes = null;
 
    public List<Alumne> getAlumnes() {
        return llistaAlumnes;
    }
    
    public void setAlumnes(List<Alumne> alumnes) {
        this.llistaAlumnes = alumnes;
    }

    @Override
    public String toString() {
        return "llistaAlumnes{" + llistaAlumnes + '}';
    }
    
}
