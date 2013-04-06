/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sim2;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tino
 */
public class RondeEliminationTest {

    /**
     * Test of calculerPoints method, of class RondeElimination.
     */
    @Test
    public void testCalculerPointsUneRuneTroisPtsSurface() {
        Ronde ronde = new RondeElimination(null);
        List<Rune> listeRunes = new ArrayList<Rune>();
        Rune rune = new Rune("rune3pts", 3, 't');
        rune.surface = true;
        listeRunes.add(rune);
        int resultat = ronde.calculerPoints(listeRunes);
        assertEquals(3, resultat);
    }
    
    @Test
    public void testCalculerPointsUneRuneTroisPtsTombe() {
        Ronde ronde = new RondeElimination(null);
        List<Rune> listeRunes = new ArrayList<Rune>();
        Rune rune = new Rune("rune3pts", 3, 't');
        rune.surface = false;
        listeRunes.add(rune);
        int resultat = ronde.calculerPoints(listeRunes);
        assertEquals(-3, resultat);
    }
    
    @Test
    public void testCalculerPointsDeuxRuneSurface() {
        Ronde ronde = new RondeElimination(null);
        List<Rune> listeRunes = new ArrayList<Rune>();
        Rune rune1 = new Rune("rune3pts", 3, 't');
        rune1.surface = true;
        Rune rune2 = new Rune("rune1pts", 1, 'u');
        rune2.surface = true;
        listeRunes.add(rune1);
        listeRunes.add(rune2);
        int resultat = ronde.calculerPoints(listeRunes);
        assertEquals(4, resultat);
    }
    
    @Test
    public void testCalculerPointsDeuxRuneTombe() {
        Ronde ronde = new RondeElimination(null);
        List<Rune> listeRunes = new ArrayList<Rune>();
        Rune rune1 = new Rune("rune3pts", 3, 't');
        rune1.surface = false;
        Rune rune2 = new Rune("rune1pts", 1, 'u');
        rune2.surface = false;
        listeRunes.add(rune1);
        listeRunes.add(rune2);
        int resultat = ronde.calculerPoints(listeRunes);
        assertEquals(-4, resultat);
    }
    
    @Test
    public void testCalculerPointsDeuxRuneSurfaceTombe() {
        Ronde ronde = new RondeElimination(null);
        List<Rune> listeRunes = new ArrayList<Rune>();
        Rune rune1 = new Rune("rune3pts", 3, 't');
        rune1.surface = true;
        Rune rune2 = new Rune("rune1pts", 1, 'u');
        rune2.surface = false;
        listeRunes.add(rune1);
        listeRunes.add(rune2);
        int resultat = ronde.calculerPoints(listeRunes);
        assertEquals(2, resultat);
    }
    
    @Test
    public void testCalculerPointsTroisRuneSurfaceTombe() {
        Ronde ronde = new RondeElimination(null);
        List<Rune> listeRunes = new ArrayList<Rune>();
        Rune rune1 = new Rune("rune3pts", 3, 't');
        rune1.surface = true;
        Rune rune2 = new Rune("rune1pts", 1, 'u');
        rune2.surface = false;
        Rune rune3 = new Rune("rune4pts", 4, 'q');
        rune3.surface = false;
        listeRunes.add(rune1);
        listeRunes.add(rune2);
        listeRunes.add(rune3);
        
        int resultat = ronde.calculerPoints(listeRunes);
        assertEquals(-2, resultat);
    }

}
