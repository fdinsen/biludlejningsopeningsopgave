/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biludlejningsopgave;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author <Frederik Keis Dinsen>
 */
public class DieselBilTest {
    
    public DieselBilTest() {
    }
   /**
     * Test of beregnGrønEjerafgift method, of class DieselBil.
     */
    @Test
    public void testBeregnGrønEjerafgift() {
        System.out.println("beregnGr\u00f8nEjerafgift");
        DieselBil instance = new DieselBil("DG42913", 2018, 5, "Seat", "Leon", 22, true);
        double expResult = 460;
        double result = instance.beregnGrønEjerafgift();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    @Test
    public void testBeregnGrønEjerafgiftKmPrLUnderZero() {
        System.out.println("beregnGr\u00f8nEjerafgift");
        DieselBil instance = new DieselBil("DG42913", 2018, 5, "Seat", "Leon", -15, true);
        double expResult = -1;
        double result = instance.beregnGrønEjerafgift();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    @Test
    public void testBeregnGrønEjerafgiftKmPrLExactly20() {
        System.out.println("beregnGr\u00f8nEjerafgift");
        DieselBil instance = new DieselBil("DG42913", 2018, 5, "Seat", "Leon", 20, true);
        double expResult = 460;
        double result = instance.beregnGrønEjerafgift();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
     @Test
    public void testBeregnGrønEjerafgiftKmPrLExactly15() {
        System.out.println("beregnGr\u00f8nEjerafgift");
        DieselBil instance = new DieselBil("DG42913", 2018, 5, "Seat", "Leon", 15, true);
        double expResult = 2440;
        double result = instance.beregnGrønEjerafgift();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
