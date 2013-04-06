/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tino
 */
public class TournoiTest {
    
    /**
     * Test of demarrerTournoi method, of class Tournoi.
     */
    @Test
    public void testGetDruideGagnantNonNull() {
        Tournoi tournoi = new Tournoi();
        Druide gagnant = new Druide("d1", new ArrayList<Rune>(), true, 500);
        tournoi.setDruideGagnant(gagnant);
        assertNotNull(tournoi.getDruideGagnant());
    }
    
    @Test
    public void testGetDruideGagnantNull() {
        Tournoi tournoi = new Tournoi();
        assertNull(tournoi.getDruideGagnant());
    }
}
