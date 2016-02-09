/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TheRiskGame.Control;

/**
 *
 * @authors David Geriminsky and Lehi Lopez
 */
public class TurnControl {
    
    //initialize class variables
    
    public int getReinforcementUnits(){
    }
    
    public int getCardReinforcementUnits(int cardExchangeTurn){
    
    int cardReinforcementUnits;
        
        if (cardExchangeTurn <= 0){
        return -999;
        }
        else if (cardExchangeTurn == 1){
            cardReinforcementUnits = 4;
        }
        else if (cardExchangeTurn == 2){
            cardReinforcementUnits = 6;
        }
        
        else if (cardExchangeTurn == 3){
        return 8;
        }
        
        else {
            cardReinforcementUnits = cardExchangeTurn * 5 - 10;
        }
        
        return cardReinforcementUnits;        
    }
    
    
    }
    
    public void placeReinforcementUnits(){
    }
    
    public void startBattle(){
    }
    
    public void conquerTerritory(){
    }
    
    public void endTurn(){
    }
    
    
}
