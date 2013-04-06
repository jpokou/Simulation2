/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sim2;

import java.util.ArrayList;
import java.util.List;

public class RondeDemiFinale extends Ronde {

	/**
	 * 
	 * @param listeGroupe
	 */
	public void RondeElimination(ArrayList<Groupe> listeGroupe) {
		throw new UnsupportedOperationException();
	}


    @Override
    public void JouerPartie() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void jouerRonde(List<Groupe> listeGroupe) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void jouerTour() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int calculerPoints(List<Rune> listeRune) {
        int valeur = 0;
        int resultat = 0;
        for(int i = 0; i < listeRune.size(); ++i ){
            valeur = listeRune.get(i).getPoint();
            if( listeRune.get(i).getSurface() ){    
                valeur = valeur * 1;
                if(listeRune.get(i).clair){
                    valeur = valeur *2;
                }
            }else{
                valeur = valeur * - 1;
                if(listeRune.get(i).clair){
                    valeur = valeur *2;
                }
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
    public String toString() {
        return "ronde demi-finale";
    }

}