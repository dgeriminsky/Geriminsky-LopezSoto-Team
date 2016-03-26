/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TheRiskGame.view;
import java.util.*;
import byui.cit260.TheRiskGame.Control.TurnControl;
import byui.cit260.TheRiskGame.Control.BattleControl;
import byui.cit260.TheRiskGame.exceptions.TurnControlException;
import byui.cit260.TheRiskGame.exceptions.BattleControlException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class ThrowExceptionAssignmentView {
    
   
    public void reinforce() throws Exception{
        
        GameMenuView view = new GameMenuView();
        int amount = 0;
        
        //Scanner input = new Scanner(System.in);
        boolean turnAround = false;
        int territoriesOwned = 0;
        
        do{
        System.out.println("\nEnter the Amount of Territories you own: ");
        try {
            territoriesOwned = Integer.parseInt(view.keyboard.readLine());
        } catch (Exception e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
        
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

    public void battleResult() throws TurnControlException{
        
        GameMenuView view = new GameMenuView();
        
        int result = 0;
        //Scanner input = new Scanner(System.in);
        boolean turnAround = false;
        do{
            System.out.println("\nEnter the first attack dice value: ");
            int attackDice1 = 0;
            try {
                attackDice1 = Integer.parseInt(view.keyboard.readLine());
            } catch (Exception e) {
                System.out.println("Error reading input: " + e.getMessage());
            }
                
            System.out.println("\nEnter the second attack dice value: ");
            int attackDice2 = 0;
            try {
                attackDice2 = Integer.parseInt(view.keyboard.readLine());
            } catch (Exception e) {
                System.out.println("Error reading input: " + e.getMessage());
            }
            
            System.out.println("\nEnter the third attack dice value: ");
            int attackDice3 = 0;
            try {
                attackDice3 = Integer.parseInt(view.keyboard.readLine());
            } catch (Exception e) {
                System.out.println("Error reading input: " + e.getMessage());
            }
            
            System.out.println("\nEnter the first defense dice value: ");
            int defenseDice1 = 0;
            try {
                defenseDice1 = Integer.parseInt(view.keyboard.readLine());
            } catch (Exception e) {
                System.out.println("Error reading input: " + e.getMessage());
            }
            System.out.println("\nEnter the second defense dice value: ");
            int defenseDice2 = 0;
            try {
                defenseDice2 = Integer.parseInt(view.keyboard.readLine());
            } catch (Exception e) {
                System.out.println("Error reading input: " + e.getMessage());
            }
            
            BattleControl battleResult = new BattleControl();
            try{ 
                result = battleResult.defineBattleResult(attackDice1,
                        attackDice2, attackDice3, defenseDice1, defenseDice2);
                System.out.println("\nBattle result is " + result/10 + " "
                        + "attack units and " + result%10 + " defense units");
                turnAround = true;
            }   catch (BattleControlException me){
                    System.out.println(me.getMessage());
                } 
            catch (InputMismatchException nfe){
             System.out.println("\nYou must enter valid dice values. "
                     + " Try again");
         } 
        }while (turnAround== false);      
    
    }
    
    public void cardReinforce() throws BattleControlException{
        
        GameMenuView view = new GameMenuView();
        
        int amount = 0;
        //Scanner input = new Scanner(System.in);
        boolean turnAround = false;
        do{
            System.out.println("\nEnter the current Card Exchange turn: ");
            int cardExchangeTurn = 0;
            try {
                cardExchangeTurn = Integer.parseInt(view.keyboard.readLine());
            } catch (Exception e) {
                System.out.println("Error reading input: " + e.getMessage());
            }
             
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
        GameMenuView view = new GameMenuView();
       
        //Scanner input = new Scanner(System.in);
        //create boolean for the do while loop
        boolean turnAround = false;
        do{
             //Take user input
        System.out.println("\nEnter a number: ");
        String tester = null;
        try {
        tester = view.keyboard.readLine();
        } catch (Exception e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
        
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
            
      


    
    
    
    

