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
    public static void main(String[] args) {
        try {
            List<Alumne> llistaAlumnes = new ArrayList<>();//llista on desarem tots els objectes Alumne
            BufferedReader reader = new BufferedReader(new FileReader("matriculats.csv"));//Llegim el fitxer
            String line = "";
            reader.readLine();//Saltem la línia de títols
            while ((line = reader.readLine()) != null) {//mentre llegeixis linies del fitxer...
                String[] dades = line.trim().split(",|\"");//desem els camps de la linia llegida separats per comes o cometes dobles
                List<Assignatura> llistaAssignatures = new ArrayList<>();//Creem una llista de assignatures
                for (int x = 15; x < dades.length; x++) {//mentre hi hagi assignatures a la línia d'aquest Alumne
                    Assignatura as = new Assignatura();//creem assignatura
                    as.setNom(dades[x]);//li donem el nom de l'assignatura
                    llistaAssignatures.add(as);//afegeix el nom de cada assignatura a la llista d'assignatures
                }
                Alumne a = new Alumne();//creem l'alumne
                a.setCodi(dades[1]);//afegim el codi
                a.setNomComplet(dades[4] + "," + dades[5]);//afegim nom complet
                a.setCurs(dades[10]);//afegim curs
                a.setLlistAssign(llistaAssignatures);//afegim llista assignatures
                llistaAlumnes.add(a);//afegim l'alumne amb les seves dades a la llista d'alumnes
            }
            System.out.println(llistaAlumnes);
            /////
            FileOutputStream file = new FileOutputStream("FitxerAlumnes.xml", false);

            JAXBContext jaxbContext = JAXBContext.newInstance(Alumne.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(llistaAlumnes, file);// envia a fitxer
            jaxbMarshaller.marshal(llistaAlumnes, System.out);// envia a consola
            /////
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
