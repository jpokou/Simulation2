/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sim2;

public class UIConsole {

	private ControleurTournoi controleur;
	private Tournoi tournoi;

	/**
	 * 
	 * @param controleur
	 */
	public UIConsole(Tournoi tournoi, ControleurTournoi controleur) {
		this.controleur = controleur;
	}
        
        public UIConsole(ControleurTournoi controleur) {
            
        }

	public void menuPrincipal() {
		System.out.println("MENU");
	}

	public void saisirNomGroupe() {
		throw new UnsupportedOperationException();
	}

	public void saisirNomDruide() {
		throw new UnsupportedOperationException();
	}

	public void afficherResultat() {
		throw new UnsupportedOperationException();
	}

}