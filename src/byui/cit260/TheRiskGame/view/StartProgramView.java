/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TheRiskGame.view;

import byui.cit260.TheRiskGame.Control.GameControl;
import byui.cit260.TheRiskGame.model.Player;
import java.util.Scanner;

/**
 *
 * @author LZ
 */
public class StartProgramView {
    
    private String promptMessage;
     
    public StartProgramView() {
        //System.out.println("\n*** StartProgramView() called ***");
        this.promptMessage = "\nPlease enter your name: ";
        //display the banner when view is created
        this.displayBanner();
    }

    public void displayBanner() {

        System.out.println(
                  "\n**************************************************"
                + "\n*                                                *"
                + "\n* In the classic 'World Domination Risk' game of *"
                + "\n* military strategy, you are battling to conquer *"
                + "\n* the world. To win, you must launch daring      *"
                + "\n* attacks, defend yourself on all fronts, and    *"
                + "\n* sweep across vast continents with boldness and *"
                + "\n* cunning. But remember, the dangers, as well as *"
                + "\n* the rewards, are high. Just when the world is  *"
                + "\n* within your grasp, your opponent might strike  *"
                + "\n* and take it all again!                         *"
                + "\n*                                                *"
                + "\n**************************************************"
                );
    }

    /**
     * display the start program view
     */
    public void displayStartProgramView() throws Exception {
        //System.out.println("/n*** displayStartProgramView function called ***");
        
        boolean done = false; // set flag to not done
        do {
            // prompt and get players name
            String playersName = this.getPlayerName();
            if (playersName.toUpperCase().equals("Q")) { // user wants to quit
                return; // exit the game
            }
            
            // do the request action and display the next view
            done = this.doAction(playersName);          
            
        } while (!done);
    }     

    private String getPlayerName() {
        //System.out.println("\n*** getPlayerName() called ***");
        //return "Joe";
        
        //Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not vaid
        GameMenuView view = new GameMenuView();
        
        try {
            while (!valid) { // lop while an invaid value is enter
                System.out.println("\n" + this.promptMessage);

                //value = keyboard.nextLine(); // get next line typed on keyboard
                value = view.keyboard.readLine();
                value = value.trim(); // trim off leading and trailing blanks

                if (value.length() < 1) { // value is blank
                    System.out.println("\nInvalid value: value can not be blank");
                    continue;
                }

                break; // end the loop
            }
        } catch (Exception e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
        return value; // return the value entered        
    }

    private boolean doAction(String playersName) throws Exception{
        
        if (playersName.length() < 2) {
            System.out.println("\nInvalid players name: "
                    + "The name must be greater than one character in length");
            return false;
        }
        
        // call createPlayer() control function
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null) { // if unsuccessful
            System.out.println("\nError creating the player.");
            return false;
        }
        
        // display next view
        this.displayNextView(player);
        
        return true; // success!
    }

    private void displayNextView(Player player) throws Exception{
        
        // display a custom welcome message
        System.out.println("\n============================================="
                          + "\n Welcome to the game " + player.getName()
                          + "\n We hope you have a lot of fun!"
                          + "\n=============================================");
        
        // Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
        
        // Display the main menu view
        mainMenuView.display();
    }
    
}
