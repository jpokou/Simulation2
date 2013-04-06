/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sim2;

import java.util.ArrayList;
import java.util.Random;

public class RondeElimination extends Ronde {

	/**
	 * 
	 * @param listeGroupe
	 */
	public RondeElimination(ArrayList<Groupe> listeGroupe) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param listeRune
	 */
	public int calculerPoints(ArrayList<Rune> listeRune) {
		throw new UnsupportedOperationException();
	}

    @Override
    public void JouerPartie() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void jouerRonde() {
        for (Groupe g : getListGroupe()) {
            for (Druide d : g.getListeDruide()) {
                if (d.getActif()) {
                    for (Rune r : d.getListeRune()) {
                        r.lancer();
                    }
                }
            }
        }
    }

    @Override
    public void jouerTour() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    private int randomNbRunes() {
        return (new Random().nextInt(10-0) + 0);
    }

}