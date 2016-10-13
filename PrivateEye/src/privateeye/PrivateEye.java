package privateeye;


import byui.cit260.privateEye.model.Player;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Justin
 */
public class PrivateEye {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //clears screen and moves cursor to top left
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        //intro banner
        System.out.println("This is...");
        for(int i=1; i<12; i++){
              System.out.println("\n");
              
              //pauses consoles for .25 sec.       
              try {
                  Thread.sleep(250);
              } 
              catch(InterruptedException ex) {
                  Thread.currentThread().interrupt();
              }
        }
        System.out.println("Private Eye\n");
        
        Player playerOne = new Player();
        
        playerOne.setName("Fred Flinstone");
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
    }
    
}
