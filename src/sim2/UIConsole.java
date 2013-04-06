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
            System.out.println("Groupe : " + groupe.getNom() + " (" + tournoi.getRondeActive().toString() + ")");
            afficherPoints(groupe);
            afficherDruides(groupe);
            afficherSurface(groupe);
            afficherTombee(groupe);
            afficherTotalValeur(groupe);
            afficherTotalPoints(groupe);

            
        }
        
        public void afficherPoints(Groupe groupe) {
            System.out.print("Points : ");
            for (int i = 0; i < groupe.getListeDruide().size(); ++i) {
                System.out.print("\t\t" + groupe.getListeDruide().get(i).getPoint());
            }
        }
        
        public void afficherDruides(Groupe groupe) {
            System.out.print("\nDruides : ");
            
            for (int i = 0; i < groupe.getListeDruide().size(); ++i) {
                System.out.print("\t\t" + groupe.getListeDruide().get(i).getNom());
            }
        }
        
        public void afficherSurface(Groupe groupe) {
            ArrayList<Druide> listeDruide = groupe.getListeDruide();
            
            System.out.print("\nSurface : ");
            for (int i = 0; i < listeDruide.size(); ++i) {
                
                System.out.print("\t\t");
                
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
            
            System.out.print("\nValeur S : ");
            for (int i = 0; i < listeDruide.size(); ++i) {
                
                System.out.print("\t\t");
                
                for (int j = 0; j < listeDruide.get(i).getListeRune().size(); ++j) {
                    Rune rune = listeDruide.get(i).getListeRune().get(j);
                    
                    if (rune.surface) {
                        System.out.print(rune.getPoint());
                    }
                    
                }
                
            }
        }
        
        public void afficherTombee(Groupe groupe) {
            ArrayList<Druide> listeDruide = groupe.getListeDruide();
            
            System.out.print("\nTombee : ");
            for (int i = 0; i < listeDruide.size(); ++i) {
                
                System.out.print("\t\t");
                
                for (int j = 0; j < listeDruide.get(i).getListeRune().size(); ++j) {
                    Rune rune = listeDruide.get(i).getListeRune().get(j);
                    
                    if (!rune.surface) {
                        System.out.print(("" + rune.alias).toUpperCase());
                    }
                    
                }
                
            }

            System.out.print("\nValeur T : ");
            for (int i = 0; i < listeDruide.size(); ++i) {
                
                System.out.print("\t\t");
                
                for (int j = 0; j < listeDruide.get(i).getListeRune().size(); ++j) {
                    Rune rune = listeDruide.get(i).getListeRune().get(j);
                    
                    if (!rune.surface) {
                        System.out.print(rune.getPoint());
                    }
                    
                }
                
            } 
        }
        
	public void menuPrincipal() {
            tournoi = creerTournoi();
            Ronde ronde = new RondeElimination(null);
            ronde.setListGroupe(tournoi.getListeGroupe());
            tournoi.setRondeActive(ronde);
            tournoi.demarrerTournoi();
            
            while(true) {
                System.out.println("\n");
                System.out.println("Tournoi De Runes");
                System.out.println("(L)  Lancer les runes");
                System.out.println("(Q)  Quitter ");
                System.out.println("(LX) Lancer les runes pour un groupe X");
                System.out.println("---------------------------");
                System.out.println("Choix : ");
                String choix = Clavier.lireString();


                if (choix.compareTo("l") == 0 || choix.compareTo("L") == 0 ||  choix.length() == 0) {

                    for (int i = 0; i < tournoi.getListeGroupe().size(); ++i) {
                        afficherGroupe(tournoi.getListeGroupe().get(i));
                        System.out.println("\n");
                    }

                } else if(choix.length() == 2 && (choix.charAt(0) == 'L' || choix.charAt(0) == 'l')) {
                    int index = -1;

                    try{
                        index = Integer.parseInt("" + choix.charAt(1)) - 1;
                    } catch (NumberFormatException e) {
                        System.out.println("Groupe invalide");
                    }

                    if (index != -1) {
                        ArrayList<Groupe> listeGroupe = new ArrayList<Groupe>();
                        listeGroupe.add(tournoi.getListeGroupe().get(index));
                        tournoi.lancerDesGroupes(listeGroupe);
                        afficherGroupe(tournoi.getListeGroupe().get(index));
                    }

                } else {
                    System.out.println("Panoramix vous dit merci et à la prochaine.");
                    System.exit(0);
                } 
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
            Groupe groupe3 = creerGroupe("Nameless", "Boris", "Tony", "Jonathan", "Eric");
            Groupe groupe4 = creerGroupe("Gaulois", "Asterix", "Obelix", "Panoramix", "Abraracoursix");
            
            ArrayList<Groupe> listeGroupe = new ArrayList<Groupe>();
            listeGroupe.add(groupe1);
            listeGroupe.add(groupe2);
            listeGroupe.add(groupe3);
            listeGroupe.add(groupe4);
            
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
                rune = new Rune("Ansuz", 2, 'a');
                listeRune.add(rune);
            }            
            
            for (int i = 0; i < NB_RUNE_FEHU; ++i) {
                rune = new Rune("Fehu", 3, 'f');
                listeRune.add(rune);
            }
            
            return listeRune;
        }
        
        public Druide creerDruide(String nom) {
            
            return new Druide(nom, creerRunes(), true, 20);
            
        }
        
        private void afficherTotalValeur(Groupe groupe) {
            ArrayList<Druide> listeDruide = groupe.getListeDruide();
            System.out.print("\nValeur : ");
        
            for (int i = 0; i < listeDruide.size(); ++i) {
            int valeurSurface = 0;
            int valeurTombee = 0;
            System.out.print("\t\t");
            for(int j = 0; j < listeDruide.get(i).getListeRune().size(); ++j) {          
                if(listeDruide.get(i).getListeRune().get(j).surface){
                    valeurSurface = valeurSurface + listeDruide.get(i).getListeRune().get(j).point;
                }else if(!(listeDruide.get(i).getListeRune().get(j).surface)){
                    valeurTombee = valeurTombee - listeDruide.get(i).getListeRune().get(j).point;
                }
            }
            System.out.print(valeurSurface);
            if(valeurTombee > 0 ){
                System.out.print(" + ");
            }
            
            System.out.print(valeurTombee);
            System.out.print(" = ");
            if(valeurTombee >= 0 ){
                System.out.print(valeurSurface - valeurTombee);
            }else{
                System.out.print(valeurSurface + valeurTombee);
            }
            
            }
            System.out.print("\t\t");
    }

    private void afficherTotalPoints(Groupe groupe) {
        ArrayList<Druide> listeDruide = groupe.getListeDruide();
        System.out.print("\nPoints : ");
        for (int i = 0; i < listeDruide.size(); ++i) {
            int valeurSurface = 0;
            int valeurTombee = 0;
            int valeur = 0;
            System.out.print("\t\t");
            for(int j = 0; j < listeDruide.get(i).getListeRune().size(); ++j) {          
                if(listeDruide.get(i).getListeRune().get(j).surface){
                    valeurSurface = valeurSurface + listeDruide.get(i).getListeRune().get(j).point;
                }else if(!(listeDruide.get(i).getListeRune().get(j).surface)){
                    valeurTombee = valeurTombee - listeDruide.get(i).getListeRune().get(j).point;
                }
            }
            if(valeurTombee >= 0 ){
                valeur = valeurSurface - valeurTombee;
            }else{
                valeur = valeurSurface + valeurTombee;
            }
            System.out.print( listeDruide.get(i).getPoint() + valeur );
            }
            System.out.print("\t\t");

    }
}