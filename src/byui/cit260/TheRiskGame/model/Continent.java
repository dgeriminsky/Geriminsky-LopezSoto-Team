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
public enum Continent implements Serializable {
    
    NorthAmerica(5),
    SouthAmerica(2),
    Africa(3),
    Asia(7),
    Europe(5),
    Australia(2);

    //class instance variables
    // private String name;
    //private final int numberOfTerritories;
    private final int numberOfReinforcements;

    Continent(int numberOfReinforcements) {
        //this.numberOfTerritories = numberOfTerritories;
        this.numberOfReinforcements = numberOfReinforcements;
    }

  /*  public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfTerritories() {
        return numberOfTerritories;
    }

    public void setNumberOfTerritories(int numberOfTerritories) {
        this.numberOfTerritories = numberOfTerritories;
    }
*/
    public int getNumberOfReinforcements() {
        return numberOfReinforcements;
    }

//    public void setNumberOfReinforcements(int numberOfReinforcements) {
//        this.numberOfReinforcements = numberOfReinforcements;
//    }
/*
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.name);
        hash = 17 * hash + this.numberOfTerritories;
        hash = 17 * hash + this.numberOfReinforcements;
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
        final Continent other = (Continent) obj;
        if (this.numberOfTerritories != other.numberOfTerritories) {
            return false;
        }
        if (this.numberOfReinforcements != other.numberOfReinforcements) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Continent{" + "name=" + name + ", numberOfTerritories=" + numberOfTerritories + ", numberOfReinforcements=" + numberOfReinforcements + '}';
    }
*/
   
    
}
