/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadorllistats;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 *
 * @author Dani
 */

@XmlType(propOrder={"nomComplet", "curs"})

public class Alumne {
    
    private String codi, nomComplet, curs;
    private List<Assignatura> llistAssign;

    public String getCodi() {
        return codi;
    }

    @XmlTransient
    public void setCodi(String codi) {
        this.codi = codi;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    @XmlElement
    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    public String getCurs() {
        return curs;
    }

    @XmlElement(name="grup")
    public void setCurs(String curs) {
        this.curs = curs;
    }

    
    public List<Assignatura> getLlistAssign() {
        return llistAssign;
    }
@XmlTransient
    public void setLlistAssign(List<Assignatura> llistAssign) {
        this.llistAssign = llistAssign;
    }

    @Override
    public String toString() {
        return "Alumne{" + "Codi: " + codi + " Nom Complet: " + nomComplet + " Curs: " + curs + " Assignatures: " + llistAssign + "}\n";
    }

}
