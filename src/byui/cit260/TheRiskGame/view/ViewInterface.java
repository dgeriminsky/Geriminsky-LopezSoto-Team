/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TheRiskGame.view;

/**
 *
 * @author LZ
 */
public interface ViewInterface {
    
    public void display() throws Exception;
    public String getInput();
    public boolean doAction(String value) throws Exception;
    
}
