/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TheRiskGame.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import theriskgame.TheRiskGame;

/**
 *
 * @author LZ
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    
    public final BufferedReader keyboard = TheRiskGame.getInFile();
    protected final PrintWriter console = TheRiskGame.getOutFile();
    
    public View() {        
    }
    
    public View(String message) {
        this.displayMessage = message;
    }
    
    @Override
    public void display() throws Exception{
        
        boolean done = false;
        
        do {
            // prompt for and get players name
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) { // user wants to quit
                return; // exit the view
            }
            
            // do the request action and display the next view
            done = this.doAction(value);          
            
        } while (!done); // exit the view when done == true
    } 
    
    @Override
    public String getInput() {
                
        //Scanner keyboard = new Scanner(System..in); 
        boolean valid = false; 
        String value = null; 
        try {
            // while a valid name has not been retrieved
            while (!valid) { 

                // prompt for the player's name
                System.out.println("\n" + this.displayMessage);

                value = this.keyboard.readLine(); // get next line typed on keyboard
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
            
}
