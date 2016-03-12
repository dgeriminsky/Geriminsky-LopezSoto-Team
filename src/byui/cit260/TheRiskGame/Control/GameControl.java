/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TheRiskGame.Control;
import byui.cit260.TheRiskGame.model.CardsDeck;
import byui.cit260.TheRiskGame.model.Game;
import byui.cit260.TheRiskGame.model.Map;
import byui.cit260.TheRiskGame.model.Player;
import byui.cit260.TheRiskGame.view.StartProgramView;
import theriskgame.TheRiskGame;

/**
 *
 * @author David
 */
public class GameControl {

    public static void createNewGame(Player player) {
        
        Game game = new Game(); // create new game
        TheRiskGame.setCurrentGame(game); //save in the risk game
        
        //create Map
        
        Map map = new Map(); // create new map
        game.setMap(map); // save the map
        
        // create the player
                    
       Player[] playerList = GameControl.createPlayerList();  // create the player
       game.setPlayer(playerList);  // save player
        
       // create card deck
       CardsDeck cardsDeck = new CardsDeck();
       game.setCardsDeck(cardsDeck);  // save card deck to game
        
    }

    private static Player[] createPlayerList() {
        
      Player[] player = new Player[2];
        
       Player player1 = new Player();
       player1.setName("Mahonri");
       player[0] = player1;
       System.out.println("\n*** Player1 - " + player1.getName() + " created ***");
       
       Player player2 = new Player();
       player2.setName("Lehi");
       player[1] = player2;
       System.out.println("\n*** Player2 - " + player2.getName() + " created ***");
       
       return player;
    }
    
    public void startNewGame(){
    }
    
    public void initializeMap(){
    }
    
    public void saveGame(String gameId){
    }
    
    public void retrieveGame (String gameId){
    }
    
    public static Player createPlayer(String playersName){
        
        if (playersName == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(playersName); // save the player
        
        TheRiskGame.setPlayer(player); // save player
        
        return player;
    }
    
    public void showTutorial(){
    }
    
    public void setBattleOrder(){
    }
    
    public void showWelcomeScreen(){
    }
    
    public void exitGame(){
    }
    
    public void eliminatePlayer(String namePlayer){
    }
    
    public void endGame(){
    }
    
            
            
            
}
