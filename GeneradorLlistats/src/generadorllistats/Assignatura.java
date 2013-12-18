/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadorllistats;

import javax.xml.bind.annotation.XmlValue;

/**
 *
 * @author Dani
 */
public class Assignatura {

    private String nom;

    public String getNom() {
        return nom;
    }

    @XmlValue
    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return nom;
    }

}
