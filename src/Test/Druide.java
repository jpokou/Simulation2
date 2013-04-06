/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.ArrayList;

public class Druide {

	private String nom;
	private ArrayList<Rune> listeDruide;
	private boolean actif;
	private int point;
        
        /**
	 * 
	 * @param nom
	 * @param listeRune
	 * @param actif
	 * @param point
	 */
	public Druide(String nom, ArrayList<Rune> listeRune, boolean actif, int point) {
		this.nom = nom;
                this.listeDruide = listeRune;
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

	public ArrayList<Rune> getListeDruide() {
		return this.listeDruide;
	}

	/**
	 * 
	 * @param listeDruide
	 */
	public void setListeDruide(ArrayList<Rune> listeDruide) {
		this.listeDruide = listeDruide;
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