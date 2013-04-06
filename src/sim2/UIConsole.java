/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sim2;

import java.util.ArrayList;

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

        public void simulerTour() {
            Tournoi tournoi = creerTournoi();
            
            for (int i = 0; i < tournoi.getListeGroupe().size(); ++i) {
                afficherGroupe(tournoi.getListeGroupe().get(i));
                System.out.println("\n");
            }
            
        }
        
        public void afficherGroupe(Groupe groupe) {
            System.out.println("Groupe : " + groupe.getNom());
            
            System.out.print("Points : ");
            for (int i = 0; i < groupe.getListeDruide().size(); ++i) {
                System.out.print("\t" + groupe.getListeDruide().get(i).getPoint());
            }
            
            System.out.print("\nDruides : ");
            for (int i = 0; i < groupe.getListeDruide().size(); ++i) {
                System.out.print("\t" + groupe.getListeDruide().get(i).getNom());
            }
        }
        
	public void menuPrincipal() {
		System.out.println("MENU");
                creerTournoi();
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
        
        public Tournoi creerTournoi() {
            Tournoi tournoi = new Tournoi();
            Groupe groupe1 = creerGroupe("Dagazz", "Uruz", "Thurisaz", "Raido", "Kaunaan");
            Groupe groupe2 = creerGroupe("Eihwaz", "Gebo", "Wunjo", "Hagalaaz", "Nudiz");
            
            ArrayList<Groupe> listeGroupe = new ArrayList<Groupe>();
            listeGroupe.add(groupe1);
            listeGroupe.add(groupe2);
            
            tournoi.setListeGroupe(listeGroupe);
            
            return tournoi;
        }
        
        public Groupe creerGroupe(String nomGroupe, String nomDruide1, String nomDruide2, String nomDruide3, String nomDruide4) {
            Groupe groupe;
            
            Druide druide1 = creerDruide(nomDruide1);
            Druide druide2 = creerDruide(nomDruide2);
            Druide druide3 = creerDruide(nomDruide3);
            Druide druide4 = creerDruide(nomDruide4);
            
            ArrayList<Druide> listeDruide = new ArrayList<Druide>();
            listeDruide.add(druide1);
            listeDruide.add(druide2);
            listeDruide.add(druide3);
            listeDruide.add(druide4);
            
            return new Groupe(nomGroupe, listeDruide);
        }
        
        
        public Druide creerDruide(String nom) {
            
            return new Druide(nom, null, true, 20);
            
        }
}
