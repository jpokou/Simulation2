/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sim2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RondeElimination extends Ronde {

	/**
	 * 
	 * @param listeGroupe
	 */
	public RondeElimination(ArrayList<Groupe> listeGroupe) {
		this.setListGroupe(listeGroupe);
	}

	/**
	 * 
	 * @param listeRune
	 */
	public int calculerPoints(List<Rune> listeRune) {
            int valeur = 0;
            int resultat = 0;
            for(int i = 0; i < listeRune.size(); ++i ){
                valeur = listeRune.get(i).getPoint();
                if( listeRune.get(i).getSurface() ){    
                    valeur = valeur * 1;

                }else{
                    valeur = valeur * -1;

                }
                resultat = resultat + valeur;
            }
            if( resultat <= -20){
                resultat = -20;
            }else if(resultat >= 60){
                resultat = 20;
            }
            return resultat;
            }

    @Override
    public void JouerPartie() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void jouerRonde(List<Groupe> listeGroupe) {
        for (Groupe g : listeGroupe) {
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
