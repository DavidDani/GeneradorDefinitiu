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
public class Alumne {
    private String codi, nomComplet, curs, assignatures;

    public Alumne(String codi, String nomComplet, String curs, String assignatures) {
        this.codi = codi;
        this.nomComplet = nomComplet;
        this.curs = curs;
        this.assignatures = assignatures;
    }

    public String getCodi() {
        return codi;
    }

    public void setCodi(String codi) {
        this.codi = codi;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    public String getCurs() {
        return curs;
    }

    public void setCurs(String curs) {
        this.curs = curs;
    }

    public String getAssignatures() {
        return assignatures;
    }

    public void setAssignatures(String assignatures) {
        this.assignatures = assignatures;
    }

    @Override
    public String toString() {
        return "Alumne{" + "codi=" + codi + ", nomComplet=" + nomComplet + ", curs=" + curs + ", assignatures=" + assignatures + '}';
    }
    
}
