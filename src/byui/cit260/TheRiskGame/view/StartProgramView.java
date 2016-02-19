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
public class StartProgramView {
    
    private String promptMessage;
    
    public void StartProgramView() {
        this.promptMessage = "\nPlease enter your name: ";
        //display the banner when view is created
        this.displayBanner();
    }

    public void displayBanner() {

        System.out.println(
                  "\n**************************************************"
                + "\n*                                                *"
                + "\n* In the classic 'World Domination Risk' game of *"
                + "\n* military strategy, you are battling to conquer *"
                + "\n* the world. To win, you must lounch daring      *"
                + "\n* attacks, defend yourself on all fronts, and    *"
                + "\n* sweep across vast continents with boldness and *"
                + "\n* cunning. But remember, the dangers, as well as *"
                + "\n* the rewards, are high. Just when the world is  *"
                + "\n* within your grasp, your opponent might strike  *"
                + "\n* and take it all again!                         *"
                + "\n*                                                *"
                + "\n**************************************************"
                );
    }

    /**
     * display the start program view
     */
    public void displayStartProgramView() {
        System.out.println("/n*** displayStartProgramView function called ***");
    }
    
}
