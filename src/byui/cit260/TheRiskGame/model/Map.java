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
public class Map implements Serializable{
    
    //Class Instance Variables
    //private double rowCount;
    //private double columnCount;


    private Territory[] territoryList;
    
    
    public Map() {
    //    this.columnCount =  20;
    //    this.rowCount = 20;
    String[] Territory;
    Territory = new String[42];
    
    Territory[0] = "Alaska";
    Territory[1] = "Northwest Territory";
    Territory[2] = "Alberta";
    Territory[3] = "Ontario";
    Territory[4] = "Greenland";
    Territory[5] = "Quebec";
    Territory[6] = "W. United States";
    Territory[7] = "E. United States";
    Territory[8] = "Central America";
    Territory[9] = "Venezuela";
    Territory[10] = "Peru";
    Territory[11] = "Brazil";
    Territory[12] = "Argentina";
    Territory[13] = "N. Africa";
    Territory[14] = "Egypt";
    Territory[15] = "Congo";
    Territory[16] = "E. Africa";
    Territory[17] = "Madagascar";
    Territory[18] = "S. Africa";
    Territory[19] = "Iceland";
    Territory[20] = "Scandinavia";
    Territory[21] = "Great Britain";
    Territory[22] = "W. Europe";
    Territory[23] = "N. Europe";
    Territory[24] = "S. Europe";
    Territory[25] = "Ukraine";
    Territory[26] = "Middle East";
    Territory[27] = "Afghanistan";
    Territory[28] = "Ural";
    Territory[29] = "India";
    Territory[30] = "Siam";
    Territory[31] = "China";
    Territory[32] = "Siberia";
    Territory[33] = "Yakutsk";
    Territory[34] = "Irkutsk";
    Territory[35] = "Mongolia";
    Territory[36] = "Japan";
    Territory[37] = "Kamachatka";
    Territory[38] = "Indonesia";
    Territory[39] = "New Guinea";
    Territory[40] = "E. Australia";
    Territory[41] = "W. Australia";
    
    this.territoryList = new Territory[42];
    
        for (int i = 0; i < 42; i++){
    
            Territory territory = new Territory();
            territory.setName(Territory[i]);
            territory.setGarrisonSize(5);
         if (i % 2 == 0){
                territory.setOwner("Mahonri");
            }
         else {
                territory.setOwner("Lehi");
            }
        
        }
          System.out.println("\n*** Map created ***");
          
          
          
          
        
    }
    
    //public double getRowCount() {
    //    return rowCount;
    //}

    //public void setRowCount(double rowCount) {
    //    this.rowCount = rowCount;
    //}

    //public double getColumnCount() {
    //    return columnCount;
    //}

    //public void setColumnCount(double columnCount) {
    //    this.columnCount = columnCount;
    //}
    
    public  Territory[] getTerritoryList() {
        return territoryList;
    }
    public  void setTerritoryList(Territory[] territoryList) {
        this.territoryList = territoryList;
    } 
    
    @Override
    public String toString() {
        return null;
    }

    @Override
    public int hashCode() {
        int hash = 7;
   //     hash = 11 * hash + (int) (Double.doubleToLongBits(this.rowCount) ^ (Double.doubleToLongBits(this.rowCount) >>> 32));
   //     hash = 11 * hash + (int) (Double.doubleToLongBits(this.columnCount) ^ (Double.doubleToLongBits(this.columnCount) >>> 32));
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
        final Map other = (Map) obj;
    return true;
    }
    
    
    
}
