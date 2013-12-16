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
                Alumne[] alumnes = new Alumne[144];
                BufferedReader reader =new BufferedReader(new FileReader("matriculats.csv"));
                String line = "";
                for (int x = 0; reader.readLine()!=null;x++){
                    line = reader.readLine();
                    String[] dades = line.trim().split("\"");
                    
                       alumnes[x] = (new Alumne(dades[1], dades[3], dades[7], dades[11]));
                 }
                    System.out.println(alumnes[1]);
                
            } 
            catch (FileNotFoundException e) {
		e.printStackTrace();
            }
            catch(IOException e){
                e.printStackTrace();
            
        }


    }    
    
}
