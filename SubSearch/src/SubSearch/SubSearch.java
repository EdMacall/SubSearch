package SubSearch;

import java.util.Scanner;


public class SubSearch 
{
  private static boolean playing;
  
  public static void MainWTF(String[] args)
  {
	playing = true;
	Scanner in = new Scanner(System.in);
	
    while(playing)
    {
      System.out.println("Would you like to play a game?");
      System.out.println("[Y]es [N]o [Q]uit");
	  // find out who wants to go first
	    // player could choose first, second,  or quit
	
	  // get player to place his submarines and mine
	    // player has choose submarine or mine or quit
	    // and to set location and depth or quit
	  
	  // place computer's submarines and mine
	  
	  // get the player's move
	    // find out which ship the player wants to move
	    // find out where the player wants to move the ship to
	      // find out if the ship can move that far
	      // verify that no other ship is there
	      // find out if ship hit mine
	      // ask if player wants to roll depth charge and how deep
	        // check to see if ship has depth charges left
	        // report results of dropping depth charge
	      // decide if submarine can and wants to fire torpedo
	    
	  
	  // play the computer's move
	    // figure out which ship the computer wants to move
	    // figure out where to move the ship
	      // out of depth charges?  Go home
	      // find out if ship hit a mine
	      // drop a depth charge where?
	        // track results of depth charge
	      // find out if player can fire a torpedo
	        // ask the player if he would like to fire a torpedo
	          // track results if player fired torpedo
	  
    }
    String string = in.nextLine();
  }
}
