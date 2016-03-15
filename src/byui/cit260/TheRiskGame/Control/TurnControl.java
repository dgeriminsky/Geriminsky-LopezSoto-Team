/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TheRiskGame.Control;

import byui.cit260.TheRiskGame.model.Territory;

/**
 *
 * @authors David Geriminsky and Lehi Lopez
 */
public class TurnControl {

    public TurnControl() {
    }
    
    
    
    //initialize class variables
    
    
    
    public int getTotalUnitsPerPlayer(String playerName, Territory[] territoryList) {
        
        int totalUnitsPerPlayer = 0;
        for (Territory territory: territoryList) {            
            if ( territory.getOwner().equals(playerName)) {
                totalUnitsPerPlayer += territory.getGarrisonSize();
            }
        }
        return totalUnitsPerPlayer;
    }
    
    public int getReinforcementUnits(int territoriesOwned, int unitsFromContinents){
        int unitT;
        
        if (territoriesOwned <=0){
        return -999;
        }
        
        if (territoriesOwned < 4 && unitsFromContinents > 0){
        return -999;
        }
    
        if (unitsFromContinents >22){
        return -999;
        }
        
        
    // find amount of units player receives based on territories owned
    unitT = territoriesOwned / 3;
        
        if (unitT<3){
        return 3;
        }
        
        //combine units received from territories 
        //and those from owning continents
        int reinforcements = unitT + unitsFromContinents;
                
        return reinforcements;
                
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
/*    
    public void placeReinforcementUnits(){
    }
    
    public void startBattle(){
    }
    
    public void conquerTerritory(){
    }
    
    public void endTurn(){
    }
    
    
}
*/