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
 * @author David
 */
public class ThrowExceptionAssignmentView {
    
   
    public void reinforce() throws TurnControlException{
        int amount = 0;
        Scanner input = new Scanner(System.in);
        boolean turnAround = false;
        do{
        System.out.println("\nEnter the Amount of Territories you own: ");
        int territoriesOwned = input.nextInt();
        
        TurnControl reinforcement = new TurnControl();
         try{ 
        amount = reinforcement.getReinforcementUnits(territoriesOwned, 0);
        System.out.println("\nYou get " + amount + " reinforcements");
        turnAround = true;
         } catch (TurnControlException me){
            System.out.println(me.getMessage());
            } 
        }while (turnAround== false);        
    }

    public void cardReinforce() throws TurnControlException{
        int amount = 0;
        Scanner input = new Scanner(System.in);
        boolean turnAround = false;
        do{
            System.out.println("\nEnter the current Card Exchange turn: ");
            int cardExchangeTurn = input.nextInt();
        
            TurnControl cardReinforcement = new TurnControl();
            try{ 
                amount = cardReinforcement.getCardReinforcementUnits(cardExchangeTurn);
                System.out.println("\nYou get " + amount + " reinforcements");
                turnAround = true;
            }   catch (TurnControlException me){
                    System.out.println(me.getMessage());
                } 
        }while (turnAround== false);      
    
    }
}
