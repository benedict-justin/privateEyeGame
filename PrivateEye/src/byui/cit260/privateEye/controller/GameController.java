/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.privateEye.controller;

import byui.cit260.privateEye.model.Player;
import privateeye.PrivateEye;

/**
 *
 * @author MIGRacing
 */
public class GameController {
    
        public static Player createPlayer(String name) {
        
        if (name == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        PrivateEye.setPlayer(player);
        
return player;
    
    }
}
