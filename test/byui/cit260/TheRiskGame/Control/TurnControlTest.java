/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TheRiskGame.Control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author David
 */
public class TurnControlTest {
    
    public TurnControlTest() {
    }

    /**
     * Test of getReinforcementUnits method, of class TurnControl.
     */
    @Test
    public void testGetReinforcementUnits() {
        System.out.println("getReinforcementUnits");
       
        /**
     * Test Case #1
     */
        //inputs
        int territoriesOwned =12;
        int unitsFromContinents = 7;
        TurnControl instance = new TurnControl();
        
        // expected results
        int expResult = 11;
        
        //test for compliance
        int result = instance.getReinforcementUnits(territoriesOwned, unitsFromContinents);
        assertEquals(expResult, result);

     /**
     * Test Case #2
     */
        //inputs
        territoriesOwned =1;
        unitsFromContinents = 200;
        
        
        // expected results
        expResult = -999;
        
        //test for compliance
        result = instance.getReinforcementUnits(territoriesOwned, unitsFromContinents);
        assertEquals(expResult, result);
        
        /**
     * Test Case #3
     */
        //inputs
        territoriesOwned =0;
        unitsFromContinents = 0;
        
        // expected results
        expResult = -999;
        
        //test for compliance
        result = instance.getReinforcementUnits(territoriesOwned, unitsFromContinents);
        assertEquals(expResult, result);
        
        /**
     * Test Case #4
     */
        //inputs
        territoriesOwned =-4;
        unitsFromContinents = 0;
        
        
        // expected results
        expResult = -999;
        
        //test for compliance
        result = instance.getReinforcementUnits(territoriesOwned, unitsFromContinents);
        assertEquals(expResult, result);
        
        
        /**
     * Test Case #5
     */
        //inputs
        territoriesOwned =41;
        unitsFromContinents = 22;
        
        
        // expected results
        expResult = 35;
        
        //test for compliance
        result = instance.getReinforcementUnits(territoriesOwned, unitsFromContinents);
        assertEquals(expResult, result);
        
        /**
     * Test Case #6
     */
        //inputs
        territoriesOwned =1;
        unitsFromContinents = 0;
        
        
        // expected results
        expResult = 3;
        
        //test for compliance
        result = instance.getReinforcementUnits(territoriesOwned, unitsFromContinents);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getCardReinforcementUnits method, of class TurnControl.
     */
    
    @Test
    public void testGetCardReinforcementUnits() {
        
        System.out.println("getCardReinforcementUnits");
        
        /*************************
        * Test case #1
        ************************/
        System.out.println("\tTest case #1");
        
        int cardExchangeTurn = 5;
        int expResult = 15;
        TurnControl instance = new TurnControl();
        
        int result = instance.getCardReinforcementUnits(cardExchangeTurn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        /*************************
         * Test case #2
         ************************/
        System.out.println("\tTest case #2");
        
        cardExchangeTurn = 0;
        expResult = -999;
     
        result = instance.getCardReinforcementUnits(cardExchangeTurn);
        assertEquals(expResult, result);
        
        /*************************
        * Test case #3
        ************************/
        System.out.println("\tTest case #3");
        
        cardExchangeTurn = -1;
        expResult = -999;
     
        result = instance.getCardReinforcementUnits(cardExchangeTurn);
        assertEquals(expResult, result);
        
        /*************************
        * Test case #4
        ************************/
        System.out.println("\tTest case #4");
        
        cardExchangeTurn = 1;
        expResult = 4;
     
        result = instance.getCardReinforcementUnits(cardExchangeTurn);
        assertEquals(expResult, result);
        
        /*************************
        * Test case #5
        ************************/
        System.out.println("\tTest case #5");
        
        cardExchangeTurn = 10;
        expResult = 40;
     
        result = instance.getCardReinforcementUnits(cardExchangeTurn);
        assertEquals(expResult, result);
        
    }
    
}
