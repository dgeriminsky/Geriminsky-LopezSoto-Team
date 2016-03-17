/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TheRiskGame.exceptions;

/**
 *
 * @author David
 */
public class TurnControlException extends Exception {

    public TurnControlException() {
    }

    public TurnControlException(String string) {
        super(string);
    }

    public TurnControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public TurnControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public TurnControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
    
    
}
