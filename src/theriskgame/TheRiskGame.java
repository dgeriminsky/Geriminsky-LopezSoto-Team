/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theriskgame;

import byui.cit260.TheRiskGame.model.Player;


/**
 *
 * @author David
 */
public class TheRiskGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Player playerOne = new Player();
        
        playerOne.setName("Lehi Lopez");
        playerOne.setDescription("One Tough Dude");
                
        String playerInfo = playerOne.toString();    
        System.out.println(playerInfo);
        
                
    }
    
    
    
    
}
