/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sim2;

import java.util.ArrayList;

public class ControleurTournoi {

	private Tournoi tournoi;
	private UIConsole ui;

	/**
	 * 
	 * @param tournoi
	 * @param ui
	 */
	public ControleurTournoi(Tournoi tournoi, UIConsole ui) {
		this.tournoi = tournoi;
                this.ui = ui;
	}

        
        public ControleurTournoi() {
        }
        
	/**
	 * 
	 * @param listeGroupe
	 */
	public void setListeGroupe(ArrayList<Groupe> listeGroupe) {
		throw new UnsupportedOperationException();
	}

	public void demarrerTournoi() {
		throw new UnsupportedOperationException();
	}

	public void enregistrerTournoi() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nomFichier
	 */
	public void chargerTournoi(String nomFichier) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Groupe> getListGroupe() {
		throw new UnsupportedOperationException();
	}

        public void setTournoi(Tournoi tournoi) {
            this.tournoi = tournoi;
        }
        
        public void setUI(UIConsole ui) {
            this.ui = ui;
        }
        
}