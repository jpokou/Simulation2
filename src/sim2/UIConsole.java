/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sim2;

import java.util.ArrayList;

public class UIConsole {

        public final static int NB_RUNE_LAUKAZ = 3;
        public final static int NB_RUNE_ANSUZ = 4;
        public final static int NB_RUNE_FEHU = 3;
        
        
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
        
        public void afficherGroupe(Groupe groupe) {
            ArrayList<Druide> listeDruide = groupe.getListeDruide();
            System.out.println("Groupe : " + groupe.getNom());
            
            System.out.print("Points : ");
            for (int i = 0; i < listeDruide.size(); ++i) {
                System.out.print("\t" + groupe.getListeDruide().get(i).getPoint());
            }
            
            System.out.print("\nDruides : ");
            for (int i = 0; i < listeDruide.size(); ++i) {
                System.out.print("\t" + groupe.getListeDruide().get(i).getNom());
            }
            
            System.out.print("\nSurface : ");
            for (int i = 0; i < listeDruide.size(); ++i) {
                
                System.out.print("\t");
                
                for (int j = 0; j < listeDruide.get(i).getListeRune().size(); ++j) {
                    Rune rune = listeDruide.get(i).getListeRune().get(j);
                    
                    if (rune.surface) {
                        if (rune.clair) {
                            System.out.print(rune.alias);
                        } else {
                            System.out.print(("" +  rune.alias).toUpperCase());
                        }
                    }
                    
                }
                
            } 
            
            System.out.print("\nTombee : ");
            for (int i = 0; i < listeDruide.size(); ++i) {
                
                System.out.print("\t");
                
                for (int j = 0; j < listeDruide.get(i).getListeRune().size(); ++j) {
                    Rune rune = listeDruide.get(i).getListeRune().get(j);
                    
                    if (!rune.surface) {
                        System.out.print(("" + rune.alias).toUpperCase());
                    }
                    
                }
                
            }

        }
        
	public void menuPrincipal() {
            Tournoi tournoi = creerTournoi();
            tournoi.demarrerTournoi();
            
            System.out.println("Tournoi De Runes");
            System.out.println("(L)ancer les runes");
            System.out.println("(Q)uitter ");
            System.out.println("---------------------------");
            System.out.println("Choix : ");
            char choix = Clavier.lireChar();
            
            if (choix == 'l' || choix == 'L' || choix == '\n') {
                
                for (int i = 0; i < tournoi.getListeGroupe().size(); ++i) {
                    afficherGroupe(tournoi.getListeGroupe().get(i));
                    System.out.println("\n");
                }
                            
            } else {
                System.out.println("Panoramix vous dit merci et a la prochaine");
                System.exit(0);
            }
                
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
        
        public ArrayList<Rune> creerRunes() {
            ArrayList<Rune> listeRune = new ArrayList<Rune>();
            Rune rune;
            
            for (int i = 0; i < NB_RUNE_LAUKAZ; ++i) {
                rune = new Rune("Laukaz", 1, 'l');
                listeRune.add(rune);
            }
            
            for (int i = 0; i < NB_RUNE_ANSUZ; ++i) {
                rune = new Rune("Ansuz", 1, 'a');
                listeRune.add(rune);
            }            
            
            for (int i = 0; i < NB_RUNE_FEHU; ++i) {
                rune = new Rune("Fehu", 1, 'f');
                listeRune.add(rune);
            }
            
            return listeRune;
        }
        
        public Druide creerDruide(String nom) {
            
            return new Druide(nom, creerRunes(), true, 20);
            
        }
}
