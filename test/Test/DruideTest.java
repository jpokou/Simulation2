/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author ge591274
 */
public class DruideTest {
    
    /**
     * Test of getNom method, of class Druide.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        ArrayList<Rune> listeRune = null;
        Druide instance = new Druide("Nom", listeRune, true, 50);    
        String expResult = "Nom";
        String result = instance.getNom();
        assertEquals(expResult, result);
    }

}