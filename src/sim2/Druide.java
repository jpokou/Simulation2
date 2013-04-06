/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sim2;

import java.util.ArrayList;
import java.util.List;

public class Druide {

	private String nom;
	private List<Rune> listeRune;
	private boolean actif;
	private int point;
        
        /**
	 * 
	 * @param nom
	 * @param listeRune
	 * @param actif
	 * @param point
	 */
	public Druide(String nom, List<Rune> listeRune, boolean actif, int point) {
		this.nom = nom;
                this.listeRune = listeRune;
                this.actif = actif;
                this.point = point;
	}
        

	public  String getNom() {
		return this.nom;
	}

	/**
	 * 
	 * @param nom
	 */
	public void setNom(String  nom) {
		this.nom = nom;
	}

	public List<Rune> getListeRune() {
		return this.listeRune;
	}

	/**
	 * 
	 * @param listeRune
	 */
	public void setListeRune(ArrayList<Rune> listeRune) {
		this.listeRune = listeRune;
	}

	public boolean getActif() {
		return this.actif;
	}

	/**
	 * 
	 * @param actif
	 */
	public void setActif(boolean actif) {
		this.actif = actif;
	}

	public int getPoint() {
		return this.point;
	}

	/**
	 * 
	 * @param point
	 */
	public void setPoint(int point) {
		this.point = point;
	}
        

	

}