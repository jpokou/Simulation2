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
    
    public DruideTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNom method, of class Druide.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String nom = "";
        Druide instance = null;
        instance.setNom(nom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListeDruide method, of class Druide.
     */
    @Test
    public void testGetListeDruide() {
        System.out.println("getListeDruide");
        Druide instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.getListeDruide();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListeDruide method, of class Druide.
     */
    @Test
    public void testSetListeDruide() {
        System.out.println("setListeDruide");
        ArrayList<Rune> listeDruide = null;
        Druide instance = null;
        instance.setListeDruide(listeDruide);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getActif method, of class Druide.
     */
    @Test
    public void testGetActif() {
        System.out.println("getActif");
        Druide instance = null;
        boolean expResult = false;
        boolean result = instance.getActif();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setActif method, of class Druide.
     */
    @Test
    public void testSetActif() {
        System.out.println("setActif");
        boolean actif = false;
        Druide instance = null;
        instance.setActif(actif);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPoint method, of class Druide.
     */
    @Test
    public void testGetPoint() {
        System.out.println("getPoint");
        Druide instance = null;
        int expResult = 0;
        int result = instance.getPoint();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPoint method, of class Druide.
     */
    @Test
    public void testSetPoint() {
        System.out.println("setPoint");
        int point = 0;
        Druide instance = null;
        instance.setPoint(point);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
