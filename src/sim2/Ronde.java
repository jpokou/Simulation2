/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sim2;

import java.util.ArrayList;
import java.util.List;

public abstract class Ronde {

	private List<Groupe> listGroupe;

	public List<Groupe> getListGroupe() {
		return this.listGroupe;
	}

	/**
	 * 
	 * @param listGroupe
	 */
	public void setListGroupe(List<Groupe> listGroupe) {
		this.listGroupe = listGroupe;
	}
        
	/**
	 * 
	 * @param listeRune
	 */
	public void lancerRunes(List<Rune> listeRune) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param listeRune
	 */
	public abstract int calculerPoints(List<Rune> listeRune);
        
        public abstract void jouerRonde(List<Groupe> listeGroupe);

	public abstract void JouerPartie();

	public abstract void jouerTour();

}