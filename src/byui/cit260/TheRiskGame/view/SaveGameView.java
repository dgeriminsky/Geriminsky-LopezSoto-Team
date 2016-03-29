/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TheRiskGame.view;

import byui.cit260.TheRiskGame.Control.GameControl;
import theriskgame.TheRiskGame;

/**
 *
 * @author David Geriminsky
 */
public class SaveGameView extends View {

    public SaveGameView() {
        super("\n"
                + "Enter a Save Game Name:");
    }

    @Override
    public boolean doAction(String value) {

        if (value.length() < 2) {
            ErrorView.display(this.getClass().getName(),
                    "\nInvalid entry: The name must be greater than one character in length");
            return false;
        } else if (value.length() > 10) {
            ErrorView.display(this.getClass().getName(),
                    "\nInvalid entry: The name must be 10 or less characters in length");
            return false;
        } else {
            this.saveToFile();
            return true;
        }

    }

    public void saveToFile() {
        this.console.println("\n*** SaveToFile function called ***");
        this.console.println("\n\nEnter the file path for file where the game"
                + " is to be saved.");
        String filePath = this.getInput();
        
        try{
            //save the game to the specified file
            GameControl.saveGame(TheRiskGame.getCurrentGame(), filePath);
        }catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }        
    
//This will ultimately call game control and have that function 
    }

}
