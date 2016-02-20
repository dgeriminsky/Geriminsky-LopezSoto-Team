/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TheRiskGame.view;

import java.util.Scanner;

/**
 *
 * @author LZ
 */
public class HelpMenuView {
    
    private final String HELP = "\n"
            + "\n--------------------------------------"
            + "\n| Help Menu                          |"
            + "\n--------------------------------------"
            + "\nG - What is the goal of the game?"
            + "\nR - How to get reinforcements"
            + "\nT - How to use cards"
            + "\nB - How to battle"
            + "\nC - How to conquer territories"
            + "\nE - Exit help menu"
            + "\n--------------------------------------";

    void displayHelpMenu() {
        
        char selection = ' ';
        do {
            
            System.out.println(HELP); // display the help menu
            
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
            case 'G': // display the goal of the game
                this.gameGoal();
                break;
            case 'R': // display the reinforcement tutorial
                this.reinforcementTutorial();
                break;
            case 'T': // display how to turn cards tutorial
                this.cardsTutorial();
                break;
            case 'B': // display the battle tutorial
                this.battleTutorial();
                break;
            case 'C': // display the conquer territories tutorial
                this.conqueringTutorial();
                break;
            case 'E': // Exit the help menu
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
                
    }

    private void gameGoal() {
        System.out.println("/n*** gameGoal function called ***");
    }

    private void reinforcementTutorial() {
        System.out.println("/n*** reinforcementTutorial function called ***");
    }

    private void cardsTutorial() {
        System.out.println("/n*** cardsTutorial function called ***");
    }

    private void battleTutorial() {
        System.out.println("/n*** battleTutorial function called ***");
    }

    private void conqueringTutorial() {
        System.out.println("/n*** conqueringTutorial function called ***");
    }
    
}
