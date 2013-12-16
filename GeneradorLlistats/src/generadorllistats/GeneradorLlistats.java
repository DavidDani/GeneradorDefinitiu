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
import java.util.Scanner;
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
                BufferedReader reader =new BufferedReader(new FileReader("matriculats.csv"));
                String[] assignatures = new String[100];
                String line = "";
                while((line=reader.readLine())!=null){
                    
                    String [] employee =line.trim().split(",");
                    System.out.println(employee[4]);
                    
                }
                
            } 
            catch (FileNotFoundException e) {
		e.printStackTrace();
            }
            catch(IOException e){
                e.printStackTrace();
            
        }


    }    
    
}
