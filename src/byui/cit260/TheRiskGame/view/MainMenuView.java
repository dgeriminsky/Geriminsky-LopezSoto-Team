    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TheRiskGame.view;

import byui.cit260.TheRiskGame.Control.GameControl;
import java.util.Scanner;
import theriskgame.TheRiskGame;

/**
 *
 * @author LZ
 */
public class MainMenuView {
    
    private final String MENU = "\n"
            + "\n--------------------------------------"
            + "\n| Main Menu                          |"
            + "\n--------------------------------------"
            + "\nN - Start new game"
            + "\nG - Get and start a saved game"
            + "\nH - Get help on how to play the game"
            + "\nS - Save game"
            + "\nE - Exit"
            + "\n--------------------------------------";

    public void displayMainMenu() {
        //System.out.println("/n*** displayMainMenu() function called ***");
        
        char selection = ' ';
        do {
            
            System.out.println(MENU); // display the main menu
            
            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first character of string
            
            this.doAction(selection); // do action based on selection
            
        } while (selection != 'E'); // selection is not "Exit"
                
    }

    private String getInput() {
        
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not vaid
        
        while (!valid) { // lop while an invaid value is enter
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
    }

    private void doAction(char choice) {
        
        switch (choice) {
            case 'N': // create and start a new game
                this.startNewGame();
                break;
            case 'G': // get and start an existing game
                this.startExistingGame();
                break;
            case 'H': // display the help menu
                this.displayHelpMenu();
                break;
            case 'S': // save the current game
                this.saveGame();
                break;
            case 'E': // Exit the program
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
                
    }

    private void startNewGame() {
        
        // create a new game
        GameControl.createNewGame(TheRiskGame.getPlayer());
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenu();
    }

    private void startExistingGame() {
        System.out.println("\n*** startExistingGame function called ***");
    }

    private void displayHelpMenu() {
                       
        // display the game menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenu();
    }

    private void saveGame() {
        System.out.println("\n*** saveGame function called ***");
    }
    
}
