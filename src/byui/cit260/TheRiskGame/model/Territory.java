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
 * @author DGeriminsky LLopez
 */
public class Territory implements Serializable {
    
     //class instance variables
    private String name;
    //private int row;
    //private char column;
    private String owner;
    private int garrisonSize;

    public Territory() {
    }
        
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
/*
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public char getColumn() {
        return column;
    }

    public void setColumn(char column) {
        this.column = column;
    }
 */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getGarrisonSize() {
        return garrisonSize;
    }

    public void setGarrisonSize(int garrisonSize) {
        this.garrisonSize = garrisonSize;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.name);
    //    hash = 89 * hash + this.row;
    //    hash = 89 * hash + this.column;
        hash = 89 * hash + Objects.hashCode(this.owner);
        hash = 89 * hash + this.garrisonSize;
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
        final Territory other = (Territory) obj;
     /* 
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
         */
        if (this.garrisonSize != other.garrisonSize) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.owner, other.owner)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return name + "," + owner + "," + garrisonSize;
    }
    

}
