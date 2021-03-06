/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TheRiskGame.Control;
import byui.cit260.TheRiskGame.exceptions.GameControlException;
import byui.cit260.TheRiskGame.model.CardsDeck;
import byui.cit260.TheRiskGame.model.Game;
import byui.cit260.TheRiskGame.model.Map;
import byui.cit260.TheRiskGame.model.Player;
import byui.cit260.TheRiskGame.view.GameMenuView;
import byui.cit260.TheRiskGame.view.StartProgramView;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import theriskgame.TheRiskGame;
import java.util.*;

/**
 *
 * @author David
 */
public class GameControl {

    /**
     *
     * @param player
     */
    public static void createNewGame(Player player) {
        
        Game game = new Game(); // create new game
        //TheRiskGame.setCurrentGame(game); //save in the risk game
        
        //create Map
        
        Map map = new Map(); // create new map
        game.setMap(map); // save the map
        
        
        // create the player
                    
       Player[] playerList = GameControl.createPlayerList();  // create the player
       game.setPlayer(playerList);  // save player
        
       // create card deck
       CardsDeck cardsDeck = new CardsDeck();
       game.setCardsDeck(cardsDeck);  // save card deck to game
       
       TheRiskGame.setCurrentGame(game);
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
    
    public static void saveGame(Game game , String filePath)
    throws Exception{
        
        try( FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(game); // Write the game object out to file
        }catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }
    
    public static void retrieveGame (String filePath)
    throws GameControlException {
        Game game = null;
        
        try( FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream input = new ObjectInputStream(fips);
            
            game = (Game) input.readObject(); // read the game object from file
            
        } catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
        
        //close the output file
        TheRiskGame.setCurrentGame(game);  //save in The Risk Game
        
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
    
    public void highScore(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your HighScore");
        
        GameMenuView view = new GameMenuView();
        
        int playerScore = 0;
        
        try {
            playerScore = input.nextInt();
        } catch (Exception e) {
            System.out.println("Error reading input: " + e.getMessage());
        }        
        
        int[] scores = {16,200,2589,23,664,1};
        int highest = 0;
        
        for(int i =0; i<scores.length; i++) {
            if(scores[i] > highest) {
                highest = scores[i];
            }
            
        }
        System.out.println("This Code Generated as an example of how to process an array and find the largest value");
        System.out.println("The High Score So far is: " +highest);
        
    }
    
            
            
            
}
