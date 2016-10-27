package privateeye;


import byui.cit260.privateEye.model.Player;
import byui.cit260.privateEye.model.Character;
import byui.cit260.privateEye.model.Game;
import byui.cit260.privateEye.model.Inventory;
import byui.cit260.privateEye.model.Items;
import byui.cit260.privateEye.model.Location;
import byui.cit260.privateEye.model.Swamp;
import byui.cit260.privateEye.model.Scene;

import java.util.Scanner;



/**
 *
 * @author Justin
 */
public class PrivateEye {

    
    private static Game currentGame = null;
    private static Player player = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        PrivateEye.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        PrivateEye.player = player;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        
    }
    
}
