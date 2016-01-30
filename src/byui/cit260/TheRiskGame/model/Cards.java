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
 * @author David
 */
public class Cards implements Serializable {
    
    //Class instance Variables
    
    private String unitType;
    private double countOfCards;
    private double maxPerPlayer;

    public Cards() {
    }
       

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    public double getCountOfCards() {
        return countOfCards;
    }

    public void setCountOfCards(double countOfCards) {
        this.countOfCards = countOfCards;
    }

    public double getMaxPerPlayer() {
        return maxPerPlayer;
    }

    public void setMaxPerPlayer(double maxPerPlayer) {
        this.maxPerPlayer = maxPerPlayer;
    }

    @Override
    public String toString() {
        return "Cards{" + "unitType=" + unitType + ", countOfCards=" + countOfCards + ", maxPerPlayer=" + maxPerPlayer + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.unitType);
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.countOfCards) ^ (Double.doubleToLongBits(this.countOfCards) >>> 32));
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.maxPerPlayer) ^ (Double.doubleToLongBits(this.maxPerPlayer) >>> 32));
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
        final Cards other = (Cards) obj;
        if (Double.doubleToLongBits(this.countOfCards) != Double.doubleToLongBits(other.countOfCards)) {
            return false;
        }
        if (Double.doubleToLongBits(this.maxPerPlayer) != Double.doubleToLongBits(other.maxPerPlayer)) {
            return false;
        }
        if (!Objects.equals(this.unitType, other.unitType)) {
            return false;
        }
        return true;
    }
    
    
    
}
