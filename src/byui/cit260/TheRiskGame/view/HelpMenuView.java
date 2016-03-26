/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TheRiskGame.view;

import java.util.Scanner;

/**
 *
 * @author LZ
 */
public class HelpMenuView extends View {
    
    public HelpMenuView() {
        super ("\n"
            + "\n--------------------------------------"
            + "\n| Help Menu                          |"
            + "\n--------------------------------------"
            + "\nG - What is the goal of the game?"
            + "\nR - How to get reinforcements"
            + "\nT - How to use cards"
            + "\nB - How to battle"
            + "\nC - How to conquer territories"
            + "\nE - Exit help menu"
            + "\n--------------------------------------");
    }
    /*void displayHelpMenu() {
        
        char selection = ' ';
        do {
            
            System.out.println(HELP); // display the help menu
            
            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first character of string
            
            this.doAction(selection); // do action based on selection
            
        } while (selection != 'E'); // selection is not "Exit"
    }
    
    private String getInput() {
        
        Scanner keyboard = new Scanner(System..in); // get infile for keyboard
        
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not vaid
        
        while (!valid) { // lop while an invaid value is enter
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
    public boolean doAction(String value) {
        
        switch (value) {
            case "G": // display the goal of the game
                this.gameGoal();
                break;
            case "R": // display the reinforcement tutorial
                this.reinforcementTutorial();
                break;
            case "T": // display how to turn cards tutorial
                this.cardsTutorial();
                break;
            case "B": // display the battle tutorial
                this.battleTutorial();
                break;
            case "C": // display the conquer territories tutorial
                this.conqueringTutorial();
                break;
            case "E": // Exit the help menu
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;   
    }

    private void gameGoal() {
        System.out.println("\n**************************************************"
                + "\n*                                                *"
                + "\n* OBJECT OF THE GAME                             *"
                + "\n*                                                *"
                + "\n* To conquer the world by occupying every        *"
                + "\n* territory on the board, thus eliminating all   *"
                + "\n* your opponents.                                *"
                + "\n*                                                *"
                + "\n**************************************************"
                );
    }

    private void reinforcementTutorial() {
        System.out.println("\nGETTING AND PLACING NEW ARMIES\n" +
"At the beginning of each turn, calculate how many new armies you’ll add\n" +
"to your territories based on . . .\n" +
"1. The number of territories you occupy;\n" +
"2. The value of the continents you control;\n" +
"3. The value of the matched sets of RISK cards you trade in;\n" +
"4. The specific territory pictured on a traded-in card.\n" +
"Territories. At the beginning of every turn (including your first), count the\n" +
"number of territories you currently occupy, then divide the total by three\n" +
"(ignore any fraction). The answer is the number of armies you receive. Place\n" +
"the new armies on any territory you already occupy.\n" +
"Example: 11 territories = 3 armies\n" +
"14 territories = 4 armies\n" +
"17 territories = 5 armies\n" +
"You will always receive at least 3 armies on a turn, even if you occupy fewer\n" +
"than 9 territories.\n" +
"Continents. In addition, at the beginning of your turn you will receive\n" +
"armies for each continent you control. (To control a continent, you must\n" +
"occupy all its territories at the start of your turn.) To find the exact number\n" +
"of armies you’ll receive for each continent, look at the chart in the lower\n" +
"left-hand corner of the game board.");
    }

    private void cardsTutorial() {
        System.out.println("\nRISK CARDS\n" +
"Earning Cards. At the end of any turn in which you have captured at\n" +
"least one territory, you will earn one (and only one) RISK card. You are\n" +
"trying to collect sets of 3 cards in any of the following combinations:"
                + "\n3 cards of same design (Infantry, Cavalry, or Artillery)"
                + "\n1 each of 3 designs"
                + "\nany 2 plus a “wild” card");
    }

    private void battleTutorial() {
        System.out.println("\n ATTACKING"
                + "\nFirst announce both the territory you’re attacking and the one\n" +
"you’re attacking from. Then roll the dice against the opponent who\n" +
"occupies the opposing territory.\n" +
"Before rolling, both you and your opponent must announce the number\n" +
"of dice you intend to roll, and you both must roll at the same time.\n" +
"You, the attacker, will roll 1,2 or 3 red dice: You must have at least one\n" +
"more army in your territory than the number of dice you roll. Hint: The\n" +
"more dice you roll, the greater your odds of winning. Yet the more dice\n" +
"you roll, the more armies you may lose, or be required to move into a\n" +
"captured territory.\n" +
"The defender will roll either 1 or 2 white dice: To roll 2 dice, he or she\n" +
"must have at least 2 armies on the territory under attack. Hint: The more\n" +
"dice the defender rolls, the greater his or her odds of winning-but the\n" +
"more armies he or she may lose.\n" +
"To Decide a Battle. Compare the highest die each of you rolled. If yours\n" +
"(the attacker’s) is higher, the defender loses one army from the territory\n" +
"under attack. But if the defender’s die is higher than yours, you lose one\n" +
"army from the territory you attacked from; put it back in your clear plastic\n" +
"box. If each of you rolled more than one die, now compare the two\n" +
"next-highest dice and repeat the process.");
    }

    private void conqueringTutorial() {
        System.out.println("Capturing territories"
                + "\nAs soon as you defeat the last opposing army on\n" +
"a territory, you capture that territory and must occupy it immediately. To\n" +
"do so, move in at least as many armies as the number of dice you rolled in\n" +
"your last battle. Remember: In most cases, moving as many armies as you\n" +
"can to the front is advantageous, because armies left behind can’t help\n" +
"you when you are attacking. Also remember you must always leave at least\n" +
"one army behind on the territory you attacked from. During the game,\n" +
"every territory must always be occupied by at least one army.");
    }
    
}
