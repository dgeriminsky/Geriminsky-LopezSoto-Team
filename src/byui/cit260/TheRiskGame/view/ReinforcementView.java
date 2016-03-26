/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TheRiskGame.view;

import byui.cit260.TheRiskGame.Control.TurnControl;
import byui.cit260.TheRiskGame.exceptions.TurnControlException;
import java.util.Scanner;

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
    public boolean doAction(String value) throws Exception 
    {
       
        if (value.length() < 2) {
            ErrorView.display(this.getClass().getName(), 
                    "\nInvalid entry: The name must be greater than one character in length");
            return false;
        }
        
        else if (value.length() > 10) {
            ErrorView.display(this.getClass().getName(), 
                    "\nInvalid entry: The name must be 41 or less characters in length");
            return false;
        }
        else  {
        this.console.println("\nCongratulations!  Reinforcements Awarded.");
      
            
        this.reinforce();
        return true;
        
        
        }
       
        }


    private void reinforce() throws TurnControlException {
                 
        int amount = 0;
        //Scanner input = new Scanner(System..in);
        this.console.println("Enter the Amount of Territories you own: ");
        //int territoriesOwned = input.nextInt();
        int territoriesOwned = 0;
        try {
        territoriesOwned = Integer.parseInt(this.keyboard.readLine());
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), 
                    "Error reading input: " + e.getMessage());
        }
        TurnControl reinforcement = new TurnControl();
         try{ 
        amount = reinforcement.getReinforcementUnits(territoriesOwned, 0);
        this.console.println("You get " + amount + " reinforcements");
         } catch (TurnControlException me){
            ErrorView.display(this.getClass().getName(), me.getMessage());
            }  
    }            
 }
