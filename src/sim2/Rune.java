/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sim2;

import java.util.Random;

/**
 *
 * @author kd991283
 */
public class Rune {
    
    public static Random random = new Random();
    
    public String nom;
    public boolean clair = true;
    public boolean surface = true;
    public int point;
    public char alias;
    
    public Rune(String nom, int points, char alias)
    {
        this.nom = nom;
        this.alias = alias;
        this.point = points;
    }
    
    public void lancer()
    {
        
        double random1 = random.nextDouble();
        double random2 = random.nextDouble();
        
        if (random1 <= .5)
        {
            clair = true;
        } else {
            clair = false;
        }
        
        if (random2 <= .5)
        {
            surface = true;
        } else {
            surface = false;
        }
        
    }
    
    public void set(String nom, int points, char alias)
    {
        this.nom = nom;
        this.alias = alias;
        this.point = points;
    }
    
    public void reset()
    {
        this.clair = true;
        this.surface = true;
    }
    
    public int getPoint()
    {
        return point;
    }
    
    public char getAlias()
    {
        return alias;
    }
    
    public String getNom()
    {
        return nom;
    }
    
    public boolean getClair()
    {
        return clair;
    }
    
    public boolean getSurface()
    {
        return surface;
    }
}
