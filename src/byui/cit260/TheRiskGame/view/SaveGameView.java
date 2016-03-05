/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TheRiskGame.view;

/**
 *
 * @author David Geriminsky
 */
public class SaveGameView extends View {
    
     public SaveGameView() {
        super ("\n"  
            + "Enter a Save Game Name:");
    }
     
     @Override
    public boolean doAction(String value) {
        
        if (value.length() < 2) {
            System.out.println("\nInvalid entry: The name must be greater than one character in length");
            return false;
        }
        
        else if (value.length() > 10) {
            System.out.println("\nInvalid entry: The name must be 10 or less characters in length");
            return false;
        }
        else  {
        this.saveToFile();
        return true;
        }
      
        }

    private void saveToFile() {
        System.out.println("\n*** SaveToFile function called ***");
    }
        
    
    }
