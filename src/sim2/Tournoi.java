/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sim2;

import java.util.ArrayList;
import java.util.List;

public class Tournoi {

	private List<Groupe> listeGroupe;
	private Druide druideGagnant;
	public Tournoi() {
		
	}

	public List<Groupe> getListeGroupe() {
            return listeGroupe;
	}

	/**
	 * 
	 * @param ListeGroupe
	 */
	public void setListeGroupe(List<Groupe> listeGroupe) {
		this.listeGroupe = listeGroupe;
	}

	public Druide getDruideGagnant() {
		return this.druideGagnant;
	}

	/**
	 * 
	 * @param druideGagnant
	 */
	public void setDruideGagnant(Druide druideGagnant) {
		this.druideGagnant = druideGagnant;
	}

	public void demarrerTournoi() {
            throw new UnsupportedOperationException();
	}
/*
	public void simulerTournoi() {
		throw new UnsupportedOperationException();
	}

*/
        /*
	public void enregistrerTournoi() {
		throw new UnsupportedOperationException();
	}
*/
	/**
	 * 
	 * @param nomFichier
	 */
	public void chargerTournoi(String nomFichier) {
		throw new UnsupportedOperationException();
	}

}