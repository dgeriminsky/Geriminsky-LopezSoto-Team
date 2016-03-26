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
public class MainMenuView extends View {
    
    //private final String MENU = "\n"
    public MainMenuView() {
        super ("\n"  
            + "\n--------------------------------------"
            + "\n| Main Menu                          |"
            + "\n--------------------------------------"
            + "\nN - Start new game"
            + "\nG - Get and start a saved game"
            + "\nH - Get help on how to play the game"
            + "\nS - Save game"
            + "\nF - Find High Score"
            + "\nE - Exit"
            + "\n--------------------------------------");
    }
            
            
    /*public void displayMainMenu() {
        //System..out.println("/n*** displayMainMenu() function called ***");
        
        char selection = ' ';
        do {
            
            System..out.println(MENU); // display the main menu
            
            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first character of string
            
            this.doAction(selection); // do action based on selection
            
        } while (selection != 'E'); // selection is not "Exit"
                
    }

    private String getInput() {
        
        Scanner keyboard = new Scanner(System..in); // get infile for keyboard
        
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not vaid
        
        while (!valid) { // lop while an invaid value is enter
            System..out.println("\n Please type your selection: ");
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() < 1) { // value is blank
                System..out.println("\nInvalid value: value can not be blank");
                continue;
            }
            
            break; // end the loop
        }
        
        return value; // return the value entered
    }*/
    
    @Override
    public boolean doAction(String value) throws Exception {
        
        switch (value) {
            case "N": // create and start a new game
                this.startNewGame();
                break;
            case "G": // get and start an existing game
                this.startExistingGame();
                break;
            case "H": // display the help menu
                this.displayHelpMenu();
                break;
            case "S": // save the current game
                this.saveGame();
                break;
            case "F": // Calculate Average High Score
                this.calcScore();
                break;
            case "E": // Exit the program
                return true;
            default:
                ErrorView.display(this.getClass().getName(), 
                        "\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }
   
    private void startNewGame() throws Exception{
        
        // create a new game
        GameControl.createNewGame(TheRiskGame.getPlayer());
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void startExistingGame() {
        this.console.println("\n*** startExistingGame function called ***");
    }

    private void displayHelpMenu() throws Exception {
                       
        // display the game menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
                
    }

    private void saveGame() throws Exception{
       // display the Save Screen
        SaveGameView save = new SaveGameView();
        save.display();
    }

    private void calcScore() {
        
        GameControl highScore = new GameControl();
        highScore.highScore();


   
    }
    
}
