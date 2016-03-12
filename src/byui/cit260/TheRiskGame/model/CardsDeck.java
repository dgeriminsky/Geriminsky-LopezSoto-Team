/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TheRiskGame.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author LZ
 */
public class CardsDeck implements Serializable {
    
    //class instance variables
    private int numberOfCards;

    public CardsDeck() {
        
        this.numberOfCards = 44;
        System.out.println("\n*** Card Deck created with " + numberOfCards + " cards ***");
    }
    
    public int getNumberOfCards() {
        return numberOfCards;
    }

    public void setNumberOfCards(int numberOfCards) {
        this.numberOfCards = numberOfCards;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.numberOfCards;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CardsDeck other = (CardsDeck) obj;
        if (this.numberOfCards != other.numberOfCards) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CardsDeck{" + "numberOfCards=" + numberOfCards + '}';
    }
    
    
  
}
