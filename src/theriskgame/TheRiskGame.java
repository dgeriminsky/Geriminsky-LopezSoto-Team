/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theriskgame;

import byui.cit260.TheRiskGame.model.Game;
import byui.cit260.TheRiskGame.model.Player;
import byui.cit260.TheRiskGame.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


/**
 *
 * @author David
 */
public class TheRiskGame {
    
    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        TheRiskGame.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        TheRiskGame.player = player;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        TheRiskGame.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        TheRiskGame.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        TheRiskGame.logFile = logFile;
    }

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
       
        // create StartProgramViewOrig and display the start program view
        StartProgramView startProgramView = new StartProgramView();
        try { 
            
            //open character stream files for end user input and output
            TheRiskGame.inFile = new BufferedReader (new InputStreamReader(System.in)); 
            TheRiskGame.outFile = new PrintWriter(System.out, true);
            
            //open log file
            String filePath = "log.txt";
            TheRiskGame.logFile = new PrintWriter(filePath);
        
            startProgramView.displayStartProgramView();
            return;
        } catch (Throwable te){
            System.out.println(te.getMessage());
            te.printStackTrace();
            startProgramView.displayStartProgramView();          
        }
        
        finally {
            try {
                if (TheRiskGame.inFile != null)
                    TheRiskGame.inFile.close();
                if (TheRiskGame.outFile != null)
                    TheRiskGame.outFile.close();
                if (TheRiskGame.logFile != null)
                    TheRiskGame.logFile.close();
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
        }
  
    }
    
    
    
    
}
