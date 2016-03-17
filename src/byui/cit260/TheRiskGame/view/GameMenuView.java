/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TheRiskGame.view;
import java.util.Scanner;
import byui.cit260.TheRiskGame.Control.TurnControl;
import byui.cit260.TheRiskGame.Control.GameControl;
import byui.cit260.TheRiskGame.exceptions.TurnControlException;
import byui.cit260.TheRiskGame.model.Territory;
import byui.cit260.TheRiskGame.model.Map;
import byui.cit260.TheRiskGame.model.Game;
import theriskgame.TheRiskGame;

/**
 *
 * @author David
 */
public class GameMenuView extends View {
    
   public GameMenuView() {
        super ("\n"
            + "\n--------------------------------------"
            + "\n| Game Menu                         |"
            + "\n| Choose an action                    |"
            + "\n--------------------------------------"
            + "\nA - Attack a Territory!"
            + "\nM - Move units and end turn"
            + "\nV - View Map"
            + "\nR - Place Reinforcements"
            + "\nT - End Turn and Draw Card"
            + "\nH - Display Help Menu"          
            + "\nS - Save game"
            + "\nX - Exception test for reinforcements"
            + "\nY - Exception test for cards reinforcements"
            + "\nZ - String to Double with exception"
            + "\nE - Exit"
            + "\n--------------------------------------");
    }

    /*public void displayGameMenu() {

        
        char selection = ' ';
        do {
            
            System.out.println(MENU); // display the game menu
            
            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first character of string
            
            this.doAction(selection); // do action based on selection
            
        } while (selection != 'E'); // selection is not "Exit"
                
    }

    private String getInput() {
        
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not vaid
        
        while (!valid) { // loop while an invaid value is enter
            System.out.println("\n Please type your selection: ");
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            
            break; // end the loop
        }
        
        return value; // return the value entered
    }*/

    @Override
    public boolean doAction(String value) throws Exception{
        
        switch (value) {
            case "A": // Attack a Territory
                this.attackTerritory();
                break;
            case "M": // get and start an existing game
                this.moveUnits();
                break;
            case "V": // display the help menu
                this.viewMap();
                break;
            case "R": // Reinforce Territory
                this.reinforceTerritory();
                break;
            case "H": // help Menu
                this.displayHelpMenu();
                break;
            case "T": // End Turn and Draw a Card
                this.endTurn();
                break;
            case "S": // save the current game
                this.saveGame();
                break;
            case "X": // Throw Exceptions View
                this.exceptionTest();
                break;
            case "Y": // Throw Exceptions View
                this.exceptionTest2();
                break;
            case "Z": // Throw Exceptions View
                this.exceptionTest3();
                break;
            case "E": // Exit the program
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void displayHelpMenu() throws Exception{
                      
        // display the help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void saveGame() throws Exception {
        // display the Save Screen
        SaveGameView save = new SaveGameView();
        save.display();
    }

    private void attackTerritory() {
        System.out.println("\n*** attackTerritory function called ***");
    }

    private void moveUnits() {
        System.out.println("\n*** moveUnits function called ***");
    }

    private void viewMap() {
        System.out.println("\n                                       ########                                      ####                                \n" +
"                                   ####        ##                                  ##    ######                          \n" +
"                           ###    # Greenland  #                                  #           ####### ########           \n" +
"    ######## ######       # O-----O##         O#             Scandanavia       # ###           #      #        ####       \n" +
"   #        #      #######  ###  /|  #        #\\ Iceland      ###             # ##          ##Yakutsk # Kamchatka#       \n" +
"  ##        #  Northern       # / |  #       #  \\####       ##   ##### ######### ## Siberia #      ####        ###       \n" +
"--O  Alaska #  Territory   ### /  |   ##   ##   #O   #     #     #  # ##      #    #         ##   #      ##  #O----------\n" +
" ##         ############# #   / ##|    #  #      ##O#    ##   ## #            #     #          ####    ##  # #           \n" +
"   # ######  #Alberta #  #   / #  O ##  ###        |\\  ##    # # #            #     #         #    #  #    # #           \n" +
"   ##      # #        #   ##/  #   # #          ###| \\#     # #  #Ukraine     #      #       #      #  #    #            \n" +
"            ##        #    O####      ##    GB  # #|  \\#   #   ##             #       #    ###Irkutsk#  #                \n" +
"             ##       # Ontario#Quebec #        # #O---O###    #              # Ural   #   #       ##  # O   ###          \n" +
"              #############    #    ###          # #\\  |     ## #             #        #  #      #  ### #\\  # ##         \n" +
"             #            ####  ### #         ##### #\\ | ####    #         #######      #  #######    # # \\ ###          \n" +
"             # W. USA     #   ##   ##        #   #   #\\|#N. Eu.  #        #       ##   # # #           ##  \\# #          \n" +
"             #            #        #          ### ###  O         #        #         ###  ### Mongolia  O----O  # Japan   \n" +
"             #         ###       ##             #O    #     ## ####        ##         #     #        # #   #  ##         \n" +
"              #      ##  E. USA #                 \\#########  #   ##      # #Afghan  #      ######## ### # ##           \n" +
"              #      #         #                  #O    #          ####   # #        #               #    ###            \n" +
"               #    #  ########                    #    #  S. EU.  #    #  #  #        #               #                  \n" +
"                #    ##      ###                ###    ###  #      #### ##### ### #### ##  China       #                 \n" +
"                ##   #                          #W. EU#   #  #    ## Middle East #      #              #                 \n" +
"                  #   # ##                      #     #   # # # ## #             #       #####         #                 \n" +
"Central America->  ##  ##                       #    #    ##   O#   ###           #  India   ######   #                 \n" +
"                     #  #                        #########  #  |      #      ##   ##         #      ###                  \n" +
"                      #  #########                 #         ##O#######      # ###  ##      # ##   #                     \n" +
"                       ##        ###              #         #          #      ###     #    #   #    #Siam                \n" +
"                        #Venezuela ####           #         # Egypt    ##        #    #   #     #    #                   \n" +
"                       ####     ###   ######     #           ####    ### #       #    #   #      # # #                   \n" +
"                      #    ### #            ##   #               ####  #  O     #      #  #      ## #O                   \n" +
"                      # Peru  #   Brazil     O---O  N. Africa     #     #/ #####        # #          |   #####           \n" +
"                       #       #             #   #                #     O#               #          #O---O    ## N. Guinea \n" +
"                        ##      ##          #     ##            ####      ####               ###   #  #  |\\#    ##       \n" +
"                          ##      #        #        #######    #    ##       #               #  ###   #  | \\##    #      \n" +
"                            ##     #       #               ####       ##    #       Indonesia #   #   ###|  \\ #####      \n" +
"                            # ####  #   ###                 #  Congo  #    O  <-E. Africa      ##  ### # |   \\           \n" +
"                            #     ###  #                     #       #    #|                     ###  #O |  ##O# ##      \n" +
"                            #       #  #                      ###    #   # |                        ##  \\|###  #####     \n" +
"               Argentina->  #        ##                       #  ###  #  # |                            #O  #       #    \n" +
"                            #      ###                        #     ## ### |   #                      ##    # E. Aus #   \n" +
"                            #     ##                          #          # | ## #                    #      #         #  \n" +
"                            #    #                            #S. Africa#  |#   #                   #       ######     # \n" +
"                            #   #                             ##       O---O   #                    # W. Aus     #     # \n" +
"                            #   #                              #       #   #   #                     #           #     # \n" +
"                            #   #                              #       #   #  #                      #  ##########    #  \n" +
"                            #  #                                ##    #     ##  <-Madagascar         ###        ##   #   \n" +
"                             ## ##                                ####                                           ####    \n" +
"                               ##                                                                                        ");
        Game game = TheRiskGame.getCurrentGame();
        Map map = game.getMap();
        Territory[] territoryList = map.getTerritoryList();
        /*
        for (int i = 0; i < 42; i++) {
            System.out.println(territoryList[i].getName()
                +"\t " + territoryList[i].getOwner()
                +"\t " + territoryList[i].getGarrisonSize());
        }*/
        
        for (Territory territory: territoryList) {
            System.out.println(territory.getName()
                +"\t " + territory.getOwner()
                +"\t " + territory.getGarrisonSize());
        }
        TurnControl turnControl = new TurnControl();
        
        
        System.out.println("\n Total Number of Units per Pleyer:"
                + "\n David has a total of " 
                + turnControl.getTotalUnitsPerPlayer("David", territoryList) 
                + " army units");
        System.out.println("Lehi has a total of " 
                + turnControl.getTotalUnitsPerPlayer("Lehi", territoryList) 
                + " army units");
        System.out.println("Mahonri has a total of " 
                + turnControl.getTotalUnitsPerPlayer("Mahonri", territoryList) 
                + " army units");
    }

    private void reinforceTerritory() {
        
        //ReinforcementView reinforce = new ReinforcementView();
        //reinforce.display();    
 //       TurnControl reinforcement = TurnControl.getReinforcementUnits(territory, continent);
  //      reinforcement.getReinforcementUnits(int territories, double continents);
        
 //       System.out.println("\n*** Total Number of Reinforcment Units are " + reinforcement +);
    }

    private void endTurn() {
        System.out.println("\n*** endTurn function called ***");
    }

    private void exceptionTest() throws Exception{
        ThrowExceptionAssignmentView testing = new ThrowExceptionAssignmentView();
        testing.reinforce();
    }
        
    private void exceptionTest2() throws Exception{
        ThrowExceptionAssignmentView testing = new ThrowExceptionAssignmentView();
        testing.cardReinforce();
    }

    private void exceptionTest3() throws Exception{
        ThrowExceptionAssignmentView testing = new ThrowExceptionAssignmentView();
        testing.getDoubleNumber();
    }
}
