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
 * @author LZ
 */
public class BattleControlTest {
    
    public BattleControlTest() {
    }

    /**
     * Test of setAttackArmy method, of class BattleControl.
     * /
    @Test
    public void testSetAttackArmy() {
        System.out.println("setAttackArmy");
        int attackArmyUnits = 0;
        BattleControl instance = new BattleControl();
        instance.setAttackArmy(attackArmyUnits);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDefenseArmy method, of class BattleControl.
     * /
    @Test
    public void testSetDefenseArmy() {
        System.out.println("setDefenseArmy");
        int defendArmyUnits = 0;
        BattleControl instance = new BattleControl();
        instance.setDefenseArmy(defendArmyUnits);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rollAttackDice method, of class BattleControl.
     * /
    @Test
    public void testRollAttackDice() {
        System.out.println("rollAttackDice");
        BattleControl instance = new BattleControl();
        int expResult = 0;
        int result = instance.rollAttackDice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rollDefenseDice method, of class BattleControl.
     * /
    @Test
    public void testRollDefenseDice() {
        System.out.println("rollDefenseDice");
        BattleControl instance = new BattleControl();
        int expResult = 0;
        int result = instance.rollDefenseDice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of defineBattleResult method, of class BattleControl.
     */
    @Test
    public void testDefineBattleResult() {
        
        System.out.println("defineBattleResult");
        
        /*************************
         * Test case #1
         ************************/
        System.out.println("\tTest case #1");
        
        // input values for test case 1
        int attackDice1 = 5;
        int attackDice2 = 5;
        int attackDice3 = 6;
        int defenseDice1 = 6;
        int defenseDice2 = 5;
        
        int expResult = 12; // expected output returned value
        
        // create instance of BattleControl class
        BattleControl instance = new BattleControl();
        
        // call function to run test
        int result = instance.defineBattleResult(attackDice1, attackDice2, attackDice3, defenseDice1, defenseDice2);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
        //fail("The test case is a prototype.");
        
        /*************************
         * Test case #2
         ************************/
        System.out.println("\tTest case #2");
        
        // input values for test case 2
        attackDice1 = 3;
        attackDice2 = 1;
        attackDice3 = 5;
        defenseDice1 = 1;
        defenseDice2 = 0;
        
        expResult = 30; // expected output returned value   
        
        // call function to run test
        result = instance.defineBattleResult(attackDice1, attackDice2, attackDice3, defenseDice1, defenseDice2);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result);
        
        /*************************
         * Test case #3
         ************************/
        System.out.println("\tTest case #3");
        
        // input values for test case 3
        attackDice1 = 3;
        attackDice2 = 2;
        attackDice3 = 0;
        defenseDice1 = 2;
        defenseDice2 = 3;
        
        expResult = 2; // expected output returned value   
        
        // call function to run test
        result = instance.defineBattleResult(attackDice1, attackDice2, attackDice3, defenseDice1, defenseDice2);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result);
        
        /*************************
         * Test case #4
         ************************/
        System.out.println("\tTest case #4");
        
        // input values for test case 4
        attackDice1 = 5;
        attackDice2 = 2;
        attackDice3 = 0;
        defenseDice1 = 5;
        defenseDice2 = 0;
        
        expResult = 11; // expected output returned value   
        
        // call function to run test
        result = instance.defineBattleResult(attackDice1, attackDice2, attackDice3, defenseDice1, defenseDice2);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result);
        
        /*************************
         * Test case #5
         ************************/
        System.out.println("\tTest case #5");
        
        // input values for test case 5
        attackDice1 = 5;
        attackDice2 = 0;
        attackDice3 = 0;
        defenseDice1 = 4;
        defenseDice2 = 5;
        
        expResult = 2; // expected output returned value   
        
        // call function to run test
        result = instance.defineBattleResult(attackDice1, attackDice2, attackDice3, defenseDice1, defenseDice2);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result);
        
        /*************************
         * Test case #6
         ************************/
        System.out.println("\tTest case #6");
        
        // input values for test case 6
        attackDice1 = 4;
        attackDice2 = 0;
        attackDice3 = 0;
        defenseDice1 = 1;
        defenseDice2 = 0;
        
        expResult = 10; // expected output returned value   
        
        // call function to run test
        result = instance.defineBattleResult(attackDice1, attackDice2, attackDice3, defenseDice1, defenseDice2);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result);
        
        /*************************
         * Test case #7
         ************************/
        System.out.println("\tTest case #7");
        
        // input values for test case 7
        attackDice1 = 0;
        attackDice2 = 0;
        attackDice3 = 0;
        defenseDice1 = 2;
        defenseDice2 = 0;
        
        expResult = -1; // expected output returned value   
        
        // call function to run test
        result = instance.defineBattleResult(attackDice1, attackDice2, attackDice3, defenseDice1, defenseDice2);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result);
        
        /*************************
         * Test case #8
         ************************/
        System.out.println("\tTest case #8");
        
        // input values for test case 8
        attackDice1 = 3;
        attackDice2 = 0;
        attackDice3 = 0;
        defenseDice1 = 0;
        defenseDice2 = 0;
        
        expResult = -1; // expected output returned value   
        
        // call function to run test
        result = instance.defineBattleResult(attackDice1, attackDice2, attackDice3, defenseDice1, defenseDice2);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result);
        
        /*************************
         * Test case #9
         ************************/
        System.out.println("\tTest case #9");
        
        // input values for test case 9
        attackDice1 = 5;
        attackDice2 = 8;
        attackDice3 = 4;
        defenseDice1 = 7;
        defenseDice2 = 3;
        
        expResult = -1; // expected output returned value   
        
        // call function to run test
        result = instance.defineBattleResult(attackDice1, attackDice2, attackDice3, defenseDice1, defenseDice2);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result);
        
        /*************************
         * Test case #10
         ************************/
        System.out.println("\tTest case #10");
        
        // input values for test case 10
        attackDice1 = 6;
        attackDice2 = -3;
        attackDice3 = 4;
        defenseDice1 = 2;
        defenseDice2 = 9;
        
        expResult = -1; // expected output returned value   
        
        // call function to run test
        result = instance.defineBattleResult(attackDice1, attackDice2, attackDice3, defenseDice1, defenseDice2);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result);
        
        /*************************
         * Test case #11
         ************************/
        System.out.println("\tTest case #11");
        
        // input values for test case 11
        attackDice1 = 4;
        attackDice2 = 2;
        attackDice3 = 7;
        defenseDice1 = -2;
        defenseDice2 = 3;
        
        expResult = -1; // expected output returned value   
        
        // call function to run test
        result = instance.defineBattleResult(attackDice1, attackDice2, attackDice3, defenseDice1, defenseDice2);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result);
        
        /*************************
         * Test case #12
         ************************/
        System.out.println("\tTest case #12");
        
        // input values for test case 12
        attackDice1 = 4;
        attackDice2 = -2;
        attackDice3 = 0;
        defenseDice1 = 5;
        defenseDice2 = -1;
        
        expResult = -1; // expected output returned value   
        
        // call function to run test
        result = instance.defineBattleResult(attackDice1, attackDice2, attackDice3, defenseDice1, defenseDice2);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result);
        
        /*************************
         * Test case #13
         ************************/
        System.out.println("\tTest case #13");
        
        // input values for test case 13
        attackDice1 = 6;
        attackDice2 = 6;
        attackDice3 = 6;
        defenseDice1 = 6;
        defenseDice2 = 6;
        
        expResult = 12; // expected output returned value   
        
        // call function to run test
        result = instance.defineBattleResult(attackDice1, attackDice2, attackDice3, defenseDice1, defenseDice2);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result);
        
        /*************************
         * Test case #14
         ************************/
        System.out.println("\tTest case #14");
        
        // input values for test case 13
        attackDice1 = 6;
        attackDice2 = 6;
        attackDice3 = 6;
        defenseDice1 = 1;
        defenseDice2 = 1;
        
        expResult = 30; // expected output returned value   
        
        // call function to run test
        result = instance.defineBattleResult(attackDice1, attackDice2, attackDice3, defenseDice1, defenseDice2);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result);
        
        /*************************
         * Test case #15
         ************************/
        System.out.println("\tTest case #15");
        
        // input values for test case 15
        attackDice1 = 1;
        attackDice2 = 1;
        attackDice3 = 1;
        defenseDice1 = 6;
        defenseDice2 = 6;
        
        expResult = 12; // expected output returned value   
        
        // call function to run test
        result = instance.defineBattleResult(attackDice1, attackDice2, attackDice3, defenseDice1, defenseDice2);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result);
        
        /*************************
         * Test case #16
         ************************/
        System.out.println("\tTest case #16");
        
        // input values for test case 16
        attackDice1 = 1;
        attackDice2 = 1;
        attackDice3 = 1;
        defenseDice1 = 1;
        defenseDice2 = 1;
        
        expResult = 12; // expected output returned value   
        
        // call function to run test
        result = instance.defineBattleResult(attackDice1, attackDice2, attackDice3, defenseDice1, defenseDice2);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result);
        
        /*************************
         * Test case #17
         ************************/
        System.out.println("\tTest case #17");
        
        // input values for test case 17
        attackDice1 = 6;
        attackDice2 = 0;
        attackDice3 = 0;
        defenseDice1 = 6;
        defenseDice2 = 0;
        
        expResult = 1; // expected output returned value   
        
        // call function to run test
        result = instance.defineBattleResult(attackDice1, attackDice2, attackDice3, defenseDice1, defenseDice2);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result);
        
        /*************************
         * Test case #18
         ************************/
        System.out.println("\tTest case #18");
        
        // input values for test case 18
        attackDice1 = 6;
        attackDice2 = 0;
        attackDice3 = 0;
        defenseDice1 = 1;
        defenseDice2 = 0;
        
        expResult = 10; // expected output returned value   
        
        // call function to run test
        result = instance.defineBattleResult(attackDice1, attackDice2, attackDice3, defenseDice1, defenseDice2);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result);
        
        /*************************
         * Test case #19
         ************************/
        System.out.println("\tTest case #19");
        
        // input values for test case 19
        attackDice1 = 1;
        attackDice2 = 0;
        attackDice3 = 0;
        defenseDice1 = 6;
        defenseDice2 = 0;
        
        expResult = 1; // expected output returned value   
        
        // call function to run test
        result = instance.defineBattleResult(attackDice1, attackDice2, attackDice3, defenseDice1, defenseDice2);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result);
        
        /*************************
         * Test case #20
         ************************/
        System.out.println("\tTest case #20");
        
        // input values for test case 20
        attackDice1 = 1;
        attackDice2 = 0;
        attackDice3 = 0;
        defenseDice1 = 1;
        defenseDice2 = 0;
        
        expResult = 1; // expected output returned value   
        
        // call function to run test
        result = instance.defineBattleResult(attackDice1, attackDice2, attackDice3, defenseDice1, defenseDice2);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result);
        
    }

    /**
     * Test of quitBattle method, of class BattleControl.
     * /
    @Test
    public void testQuitBattle() {
        System.out.println("quitBattle");
        BattleControl instance = new BattleControl();
        instance.quitBattle();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    } */
    
}
