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
public class Assignatura implements Comparable<Assignatura>{

    private String nom;

    public String getNom() {
        return nom;
    }

    
    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return nom+"\n";
    }
    
    @Override
	public int compareTo(Assignatura a) {
		//int valor = cognoms.compareTo(p.getCognoms());
		//return valor == 0? nom.compareTo(p.getNom()) : valor;
		
		int valor = nom.compareTo(a.getNom());
		if (valor == 0){
			return nom.compareTo(a.getNom());
		}else {
			return valor;
		}
	}

}
