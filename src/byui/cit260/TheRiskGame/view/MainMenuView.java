/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TheRiskGame.view;

import byui.cit260.TheRiskGame.Control.GameControl;
import byui.cit260.TheRiskGame.model.Game;
import byui.cit260.TheRiskGame.model.Map;
import byui.cit260.TheRiskGame.model.Territory;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import theriskgame.TheRiskGame;

/**
 *
 * @author LZ
 */
public class MainMenuView extends View {

    //private final String MENU = "\n"
    public MainMenuView() {
        super("\n"
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

    private void startNewGame() throws Exception {

        // create a new game
        GameControl.createNewGame(TheRiskGame.getPlayer());

        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void startExistingGame() throws Exception {
        // Prompt and get the name of the file to save the game in
        this.console.println("\nEnter the file path for the file where the game"
                + " was saved.");

        String filePath = this.getInput();

        try {
            //start a saved game
            GameControl.retrieveGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }

        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();

    }

    private void displayHelpMenu() throws Exception {

        // display the game menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();

    }

    private void saveGame() throws Exception {
        // display the Save Screen
        SaveGameView save = new SaveGameView();
        save.saveToFile();
    }

    private void calcScore() {

        GameControl highScore = new GameControl();
        highScore.highScore();

    }


}


