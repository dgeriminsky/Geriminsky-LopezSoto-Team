/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TheRiskGame.Control;
import byui.cit260.TheRiskGame.exceptions.BattleControlException;

/**
 *
 * @author David
 */
public class BattleControl {
    
    public void setAttackArmy(int attackArmyUnits){
    }
    
    public void setDefenseArmy(int defendArmyUnits){
    }
    
    //public int rollAttackDice(){
    //}
    
    //public int rollDefenseDice(){
    //}
    
    public int defineBattleResult(int attackDice1, int attackDice2
            , int attackDice3, int defenseDice1, int defenseDice2)
            throws BattleControlException{
        
        // Validation of inputs
        if ( attackDice1 > 6 || attackDice2 > 6 || attackDice3 > 6 ||
                defenseDice1 > 6 || defenseDice2 > 6 ) {
            throw new BattleControlException("You have entered one or "
                    + "more dice values bigger than six. Please try again.");
        }
        
        if ( attackDice1 < 0 || attackDice2 < 0 || attackDice3 < 0 ||
                defenseDice1 < 0 || defenseDice2 < 0 ) {
            throw new BattleControlException("You have entered one or "
                    + "more negative dice values. Please try again.");
        }
        
        if ( ( attackDice1 == 0 && attackDice2 == 0 && attackDice3 == 0 ) ||
                ( defenseDice1 == 0 && defenseDice2 == 0 ) ) {
            throw new BattleControlException("You have entered all attack "
                    + "dice values, or all defense values as zero. Please try "
                    + "again.");
        }
        
        // Ordering attacking units
        int attackUnit1;
        int attackUnit2;
        
        if ( (attackDice1 >= attackDice2) && (attackDice1 >= attackDice3) ) {
            attackUnit1 = attackDice1;
            if ( attackDice2 >= attackDice3 ) {
                attackUnit2 = attackDice2;
            }
            else {
                attackUnit2 = attackDice3;
            }
        }
        else {
            if ((attackDice2 >= attackDice1) && (attackDice2 >= attackDice3)) {
                attackUnit1 = attackDice2;
                if (attackDice1 >= attackDice3) {
                    attackUnit2 = attackDice1;
                }
                else {
                    attackUnit2 = attackDice3;
                }
            }
            else {
                attackUnit1 = attackDice3;
                if (attackDice1 >= attackDice2) {
                    attackUnit2 = attackDice1;
                }
                else {
                    attackUnit2 = attackDice2;                    
                }
            }
        }
        
        // Ordering defending units
        int defenseUnit1;
        int defenseUnit2;
        
        if ( defenseDice1 >= defenseDice2 ) {
            defenseUnit1 = defenseDice1;
            defenseUnit2 = defenseDice2;
        }
        else {
            defenseUnit1 = defenseDice2;
            defenseUnit2 = defenseDice1;
        }
        
        // Defining battle results
        int attackUnits = 3;
        int defenseUnits = 2;
        
        if ( attackUnit1 > defenseUnit1 ) {
            defenseUnits--;
        }
        else {
            attackUnits--;
        }
        if ( attackUnit2 > defenseUnit2 ) {
            defenseUnits--;
        }
        else {
            attackUnits--;
        }
        if ( attackDice3 == 0 ) {
            attackUnits--;
        }
        if ( ( attackUnit2 == 0 ) && ( defenseUnit2 == 0 ) ) {
            defenseUnits--;
        }
       
       //returning attackUnits and defenseUnits joined using tenths and units
       return attackUnits * 10 + defenseUnits;
       
    }
    
    public void quitBattle(){
    }
    
}

