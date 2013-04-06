/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sim2;

import java.util.ArrayList;
import java.util.List;

public class Tournoi {

	private ArrayList<Groupe> listeGroupe;
	private Druide druideGagnant;
        private Ronde rondeActive;
        
	public Tournoi() {
		
	}

	public List<Groupe> getListeGroupe() {
            return listeGroupe;
	}

	/**
	 * 
	 * @param ListeGroupe
	 */
	public void setListeGroupe(ArrayList<Groupe> listeGroupe) {
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
            //Ronde ronde = new RondeElimination(listeGroupe);  
            rondeActive.jouerRonde(listeGroupe);
	}
        
        public void lancerDesGroupes(ArrayList<Groupe> listeGroupe) {
            //Ronde ronde = new RondeElimination(listeGroupe);
            rondeActive.jouerRonde(listeGroupe);
        }
        
        public void setRondeActive(Ronde ronde) {
            rondeActive = ronde;
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