/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TheRiskGame.model;

import java.io.Serializable;

/**
 *
 * @author David
 */
public class Game implements Serializable{

    //Class Instance Variables
    private double totalTime;
    private double noPlayer;
    private Player[] player;
    private static Map map;
    private CardsDeck cardsDeck;
        
        
    public Game() {
        
    }
    
    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public double getNoPlayer() {
        return noPlayer;
    }

    public void setNoPlayer(double noPlayer) {
        this.noPlayer = noPlayer;
    }
    
    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        Game.map = map;
    }
        
    public Player[] getPlayer() {
        return player;
    }

    public void setPlayer(Player[] player) {
        this.player = player;
    }
    
    public CardsDeck getCardsDeck() {
        return cardsDeck;
    }

    public void setCardsDeck(CardsDeck cardsDeck) {
        this.cardsDeck = cardsDeck;
    }

    
    
    
    
   

    
}
