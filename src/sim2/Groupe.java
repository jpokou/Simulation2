/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sim2;

import java.util.ArrayList;
import java.util.List;

public class Groupe {

	private ArrayList<Druide> ListeDruide;
	private String nom;

	public ArrayList<Druide> getListeDruide() {
		return ListeDruide;
	}

	/**
	 * 
	 * @param ListeDruide
	 */
	public void setListeDruide(ArrayList<Druide> ListeDruide) {
		this.ListeDruide = ListeDruide;
	}

	public String getNom() {
		return this.nom;
	}

	/**
	 * 
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * 
	 * @param nom
	 * @param listeDruide
	 */
	public Groupe(String nom, ArrayList<Druide> listeDruide) {
            this.nom = nom;
            this.ListeDruide = listeDruide;
	}

	public List<Druide> getDruidesActifs() {
            List<Druide> lesDruides = new ArrayList<Druide>(); 
            for(int i = 0; i < this.ListeDruide.size(); ++i ){        
                if( this.ListeDruide.get(i).getActif() == true ){
                    lesDruides.add(this.ListeDruide.get(i));
                } 
            }
            return lesDruides;
	}

}