/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sim2;

import java.util.ArrayList;

public abstract class Ronde {

	private ArrayList<Groupe> listGroupe;

	public ArrayList<Groupe> getListGroupe() {
		return this.listGroupe;
	}

	/**
	 * 
	 * @param listGroupe
	 */
	public void setListGroupe(ArrayList<Groupe> listGroupe) {
		this.listGroupe = listGroupe;
	}
        
	/**
	 * 
	 * @param listeRune
	 */
	public void lancerRunes(ArrayList<Rune> listeRune) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param listeRune
	 */
	public int calculerPoints(ArrayList<Rune> listeRune) {
		throw new UnsupportedOperationException();
	}
        
        public abstract void jouerRonde();

	public abstract void JouerPartie();

	public abstract void jouerTour();

}