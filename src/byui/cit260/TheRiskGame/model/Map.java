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
    String[] territory;
    territory = new String[42];
    
    territory[0] = "Alaska";
    territory[1] = "Northwest Territory";
    territory[2] = "Alberta";
    territory[3] = "Ontario";
    territory[4] = "Greenland";
    territory[5] = "Quebec";
    territory[6] = "W. United States";
    territory[7] = "E. United States";
    territory[8] = "Central America";
    territory[9] = "Venezuela";
    territory[10] = "Peru";
    territory[11] = "Brazil";
    territory[12] = "Argentina";
    territory[13] = "N. Africa";
    territory[14] = "Egypt";
    territory[15] = "Congo";
    territory[16] = "E. Africa";
    territory[17] = "Madagascar";
    territory[18] = "S. Africa";
    territory[19] = "Iceland";
    territory[20] = "Scandinavia";
    territory[21] = "Great Britain";
    territory[22] = "W. Europe";
    territory[23] = "N. Europe";
    territory[24] = "S. Europe";
    territory[25] = "Ukraine";
    territory[26] = "Middle East";
    territory[27] = "Afghanistan";
    territory[28] = "Ural";
    territory[29] = "India";
    territory[30] = "Siam";
    territory[31] = "China";
    territory[32] = "Siberia";
    territory[33] = "Yakutsk";
    territory[34] = "Irkutsk";
    territory[35] = "Mongolia";
    territory[36] = "Japan";
    territory[37] = "Kamachatka";
    territory[38] = "Indonesia";
    territory[39] = "New Guinea";
    territory[40] = "E. Australia";
    territory[41] = "W. Australia";
    
    this.territoryList = new Territory[42];
    
        
        
        for (int i = 0; i < 42; i++){
    
            Territory territory1 = new Territory();
            territory1.setName(territory[i]);
            territory1.setGarrisonSize(5);
            if (i % 2 == 0){
                territory1.setOwner("Mahonri");
            }
            else {
                territory1.setOwner("Lehi");
            }
        
            territoryList[i] = territory1;
        }
          //System.out.println("\n*** Map created ***");
          //System.out.println("\n " + territory[39]);
          //System.out.println("\n " + territoryList[10].getName());
                  
          
        
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
