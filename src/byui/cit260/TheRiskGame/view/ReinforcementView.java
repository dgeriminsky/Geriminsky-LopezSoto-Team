/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TheRiskGame.View;

/**
 *
 * @author David Geriminsky
 */
public class ReinforcementView extends byui.cit260.TheRiskGame.view.View{
   
   
        public ReinforcementView() {
        super ("\n"  
            + "How many Territories do you own?:");
    }
    
    @Override
    public boolean doAction(String value) {
        
        if (value.length() < 2) {
            System.out.println("\nInvalid entry: The name must be greater than one character in length");
            return false;
        }
        
        else if (value.length() > 10) {
            System.out.println("\nInvalid entry: The name must be 41 or less characters in length");
            return false;
        }
        else  {
        System.out.println("\nCongratulations!  Reinforcements Awarded.");
        this.reinforce();
        return true;
        }
      
        }

    private void reinforce() {
          System.out.println("\n*** Reinforcements function called in Control Layer ***");
    }
        
 }
