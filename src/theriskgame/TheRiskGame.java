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
    public static void main(String[] args) {
        
        // create StartProgramViewOrig and display the start program view
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
        
        
        
        /*
        Player playerOne = new Player();
        
        playerOne.setName("Lehi Lopez");
        playerOne.setDescription("One Tough Dude");
                
        String playerInfo = playerOne.toString();    
        System.out.println(playerInfo);
        
        Game newGame = new Game();
        
        //Code function to set these numbers later
        newGame.setNoPlayer(2);
        newGame.setTotalTime(12);
        
        String gameInfo = newGame.toString();    
        System.out.println(gameInfo);
        
        Cards cardDeck = new Cards();
        
        //Write Code to set unit type when pulled from card deck
        //and count how many a player has
        cardDeck.setUnitType("Artillery");
        cardDeck.setCountOfCards(50);
        cardDeck.setMaxPerPlayer(5);
        
        String cardsInfo = cardDeck.toString();
        System.out.println(cardsInfo);
        
        Map newMap = new Map();
        
        newMap.setRowCount(12);
        newMap.setColumnCount(12);
        
        String mapInfo = newMap.toString();
        System.out.println(mapInfo);
        
        //Code to run and test CardsDeck class
        CardsDeck cardsDeck = new CardsDeck();
        
        cardsDeck.setNumberOfCards(60);
                        
        String cardsDeckInfo = cardsDeck.toString();    
        System.out.println(cardsDeckInfo);
        
        //Code to run and test Continent class
        Continent europe = new Continent();
        
        europe.setName("Europe");
        europe.setNumberOfReinforcements(8);
        europe.setNumberOfTerritories(12);
        
        String continentInfo = europe.toString();
        System.out.println(continentInfo);
        
        //Code to run and test Territory class
        Territory brazil = new Territory();
        
        brazil.setColumn('C');
        brazil.setGarrisonSize(7);
        brazil.setName("Brazil");
        brazil.setOwner("Lehi");
        brazil.setRow(14);
        
        String territoryInfo = brazil.toString();
        System.out.println(territoryInfo);
        */
    }
    
    
    
    
}
