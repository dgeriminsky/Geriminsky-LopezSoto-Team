/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TheRiskGame.View;
import byui.cit260.TheRiskGame.Control.TurnControl
import java.util.Scanner;

/**
 *
 * @author David
 */
public class ReinforcementView {
    
    private int getInput() {
        int territory;
        
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        
        int value = 0; // value to be returned
        boolean valid = false; // initialize to not vaid
        
        while (!valid) { // lop while an invaid value is enter
            System.out.println("\n How many Territories do you own?: ");
            
           value = keyboard.nextInt(); // get next line typed on keyboard
           value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            
            break; // end the loop
        }
        value = territory;
        return territory; // return the value entered
        
        
        
    }
    public void displayReinforcementView() {
       
        int reinforcements;
        reinforcements = TurnControl.getReinforcementUnits(int getInput(), 0);
        System.out.println(reinforcements);
    }
        
 
        


}
