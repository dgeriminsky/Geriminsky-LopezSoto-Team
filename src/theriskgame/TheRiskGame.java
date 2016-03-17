/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theriskgame;

import byui.cit260.TheRiskGame.model.Game;
import byui.cit260.TheRiskGame.model.Player;
import byui.cit260.TheRiskGame.view.StartProgramView;

/**
 *
 * @author David
 */
public class TheRiskGame {
    
    private static Game currentGame = null;
    private static Player player = null;

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
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
       
        // create StartProgramViewOrig and display the start program view
        StartProgramView startProgramView = new StartProgramView();
    try { 
        startProgramView.displayStartProgramView();
        } catch (Throwable te){
          System.out.println(te.getMessage());
          te.printStackTrace();
          startProgramView.displayStartProgramView();
          
        }
  
    }
    
    
    
    
}
