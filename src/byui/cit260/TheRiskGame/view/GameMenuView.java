/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TheRiskGame.view;
import java.util.Scanner;
import byui.cit260.TheRiskGame.Control.TurnControl;


/**
 *
 * @author David
 */
public class GameMenuView extends View {
    
   public GameMenuView() {
        super ("\n"
            + "\n--------------------------------------"
            + "\n| Battle Menu                         |"
            + "\n| Choose an action                    |"
            + "\n--------------------------------------"
            + "\nA - Attack a Territory!"
            + "\nM - Move units and end turn"
            + "\nV - View Map"
            + "\nR - Place Reinforcements"
            + "\nT - End Turn and Draw Card"
            + "\nH - Display Help Menu"          
            + "\nS - Save game"
            + "\nE - Exit"
            + "\n--------------------------------------");
    }

    /*public void displayGameMenu() {

        
        char selection = ' ';
        do {
            
            System.out.println(MENU); // display the game menu
            
            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first character of string
            
            this.doAction(selection); // do action based on selection
            
        } while (selection != 'E'); // selection is not "Exit"
                
    }

    private String getInput() {
        
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not vaid
        
        while (!valid) { // loop while an invaid value is enter
            System.out.println("\n Please type your selection: ");
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            
            break; // end the loop
        }
        
        return value; // return the value entered
    }*/

    @Override
    public boolean doAction(String value) {
        
        switch (value) {
            case "A": // Attack a Territory
                this.attackTerritory();
                break;
            case "M": // get and start an existing game
                this.moveUnits();
                break;
            case "V": // display the help menu
                this.viewMap();
                break;
            case "R": // Reinforce Territory
                this.reinforceTerritory();
                break;
            case "H": // help Menu
                this.displayHelpMenu();
                break;
            case "T": // End Turn and Draw a Card
                this.endTurn();
                break;
            case "S": // save the current game
                this.saveGame();
                break;
            case "E": // Exit the program
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void displayHelpMenu() {
                      
        // display the help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void saveGame() {
        System.out.println("\n*** saveGame function called ***");
    }

    private void attackTerritory() {
        System.out.println("\n*** attackTerritory function called ***");
    }

    private void moveUnits() {
        System.out.println("\n*** moveUnits function called ***");
    }

    private void viewMap() {
        System.out.println("\n*** viewMap function called ***");
    }

    private void reinforceTerritory() {
        
        
 //       TurnControl reinforcement = TurnControl.getReinforcementUnits(territory, continent);
  //      reinforcement.getReinforcementUnits(int territories, double continents);
        
 //       System.out.println("\n*** Total Number of Reinforcment Units are " + reinforcement +);
    }

    private void endTurn() {
        System.out.println("\n*** endTurn function called ***");
    }
    
    
    
}
