/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TheRiskGame.view;
import java.util.*;
import byui.cit260.TheRiskGame.Control.TurnControl;
import byui.cit260.TheRiskGame.exceptions.TurnControlException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class ThrowExceptionAssignmentView {
    
   
    public void reinforce() throws Exception{
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
         } catch (TurnControlException | NumberFormatException me){
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
            catch (InputMismatchException nfe){
             System.out.println("\nYou must enter a valid number. "
                     + " Try again");
         } 
        }while (turnAround== false);      
    
    }
    
    public Double getDoubleNumber() {
        //Here we created a new function to convert a string into a double
        //We dont have anywhere else in our code where this would have made sense
        //So we created this function as a test bed.
        Double number = null;
        
       
        Scanner input = new Scanner(System.in);
        //create boolean for the do while loop
        boolean turnAround = false;
        do{
             //Take user input
        System.out.println("\nEnter a number: ");
        String tester = input.nextLine();
        
        //trim the user input
         String value = tester;
         value = value.trim().toUpperCase();
        
         //the is the beginning of our try/catch.
         //this will attempt this code and if there is an error it will return an exception.
         
         try{
         //parse and convert number from text to a double
         number = Double.parseDouble(value);
         System.out.print("We converted " + number + " from a string to a double.");
         turnAround = true;        
         } 
         //catch any errors and handle it though an exception
         catch (NumberFormatException nf){
             System.out.println("\nYou must enter a valid number. "
                     + " Try again");
         } 
         
        }
         while (turnAround == false);
               
        return number;
            }
}    
            
      


    
    
    
    

