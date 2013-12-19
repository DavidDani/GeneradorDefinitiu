/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadorllistats;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author Dani
 */
public class GeneradorLlistats {

    /**
     * @param args the command line arguments
     */
    static llistaAlumnes llistaAlumnes = new llistaAlumnes();
    static SortedMap<Assignatura, Integer> llistaCurtaAssignatures = new TreeMap<>();

    public static void main(String[] args) {

        try {
            llistaAlumnes.setAlumnes(new ArrayList<Alumne>());//llista on desarem tots els objectes Alumne
            BufferedReader reader = new BufferedReader(new FileReader("matriculats.csv"));//Llegim el fitxer
            String line = "";
            line = reader.readLine();//Saltem la línia de títols
            System.out.println(line);
            while ((line = reader.readLine()) != null) {//mentre llegeixis linies del fitxer...
                String[] dades = line.trim().split(",|\"");//desem els camps de la linia llegida separats per comes o cometes dobles
                List<Assignatura> llistaAssignatures = new ArrayList<>();//Creem una llista de assignatures
                for (int x = 15; x < dades.length; x++) {//mentre hi hagi assignatures a la línia d'aquest Alumne
                    Assignatura as = new Assignatura();//creem assignatura
                    as.setNom(dades[x]);//li donem el nom de l'assignatura
                    llistaAssignatures.add(as);//afegeix el nom de cada assignatura a la llista d'assignatures

                }
              //////Saber quines assignatures hi ha en total sense repetir-les
                for (Assignatura aux : llistaAssignatures) {//per cada persona de l'array...
                    if (llistaCurtaAssignatures.containsKey(aux)) {//si ia existeix a l'array
                        llistaCurtaAssignatures.put(aux, llistaCurtaAssignatures.get(aux) + 1);//sumem +1 al valor de la persona valor(el valor es l'integer del hashmap
                    } else {//si no existia
                        llistaCurtaAssignatures.put(aux, 1);//afegim la persona al hashmap amb el valor 1
                    }
                }
              /////
                
                Alumne a = new Alumne();//creem l'alumne
                a.setCodi(dades[1]);//afegim el codi
                a.setNomComplet(dades[4] + "," + dades[5]);//afegim nom complet
                a.setCurs(dades[10]);//afegim curs
                a.setLlistAssign(llistaAssignatures);//afegim llista assignatures
                llistaAlumnes.getAlumnes().add(a);//afegim l'alumne amb les seves dades a la llista d'alumnes
            }
            //System.out.println(llistaAlumnes);

          /////Creació de l'Xml
            
          /////
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
