/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package generadorllistats;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Dani
 */
public class GeneradorLlistats {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            try
            {
                List<Alumne> llistaAlumnes = new ArrayList<Alumne>();//llista on desarem tots els objectes Alumne
                BufferedReader reader =new BufferedReader(new FileReader("matriculats.csv"));//Llegim el fitxer
                String line = "";
                reader.readLine();//Saltem la línia de títols
                while ((line = reader.readLine())!= null){//menter llegeixis linies...
                    String[] dades = line.trim().split(",|\"");//desem els camps de la linia llegida separats per comes o cometes dobles
                    List<Assignatura> llistaAssignatures = new ArrayList<Assignatura>();//Creem una llista de assignatures
                        for(int x=15;x<dades.length;x++){//mentre hi hagi assignatures a la línia d'aquest Alumne
                            llistaAssignatures.add(new Assignatura(dades[x]));//afegeix cada assignatura a la llista de assignatures d'aquest alumne
                        }
                   llistaAlumnes.add(new Alumne(dades[1], dades[4] + "," + dades[5], dades[10], llistaAssignatures));//creem l'alumne i l'afegim a la llista d'alumnes
                 }
                    System.out.println(llistaAlumnes);
            } 
            catch (FileNotFoundException e) {
		e.printStackTrace();
            }
            catch(IOException e){
                e.printStackTrace();
            
        }
    }
}
