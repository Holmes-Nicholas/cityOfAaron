// The GameMenuView class - part of the view layer
// Object of this class manages the main menu
// Author:  Jared Goff
// Date last modified: Nov 16 2018
//-------------------------------------------------------------

package view;

import Control.GameControl;
import java.util.Scanner;
import cityofaaron.CityOfAaron;
import model.CropData;
import model.Game;
import model.Map;

/**
 *
 * @author Jared Goff
 */
    //Added extends MenuView so it will inherit from MenuView.
public class GameMenuView extends MenuView

{
    private static Game game = CityOfAaron.getGame();
    private static Map map = game.getMap();
    //The Game MenuView constructor
    //purpose: Intialize the game menu
    //Parameters: none
    //returns: none   

  public GameMenuView()
  {
     super("\n" + //'super' calls the base class construction Jared
          "**********************************\n" +
          "* CITY OF AARON: MAIN GAME MENU  *\n" +
          "**********************************\n" +
          " 1 - viewMap\n" +
          " 2 - viewList\n" +
          " 3 - moveToNewLocation\n" +
          " 4 - manageCrops\n" +
          " 5 - Quit\n",
        
     5);
  }

    // The doAction method
    // Purpose: performs the selected action
    // Parameters: none
    // Returns: none
    // =================================== 
    //@Override overides the method in the ViewInterface class.
    @Override public void doAction(int option)
    {
      switch(option)
      {
        // if the option is 1, viewMap( )
        case 1: // view map
          viewMap();
          break;

        // if the option is 2, viewList( )
        case 2: // viewList
          viewList();
          break;
  
        // if the option is 3, moveToNewLocation( )
        case 3: // moveToNewLocation
          moveToNewLocation();
          break;
   
        // if the option is 4, manageCrops( )
        case 4: // manageCrops
          manageCrops();
          break;

        // if the option is 5, display a goodbye message
        case 5:
          System.out.println("Thanks for looking at the Game Menu ... goodbye.");
          
      } 
    }


    // The viewMap method
    // Purpose: viewMap
    // Parameters: none
    // Returns: none
    // ===================================     
      private void viewMap()
      {
         // System.out.println("\nView the map");
          // Call the createMap() method in the GameControl class
         // MapView mv = new MapView();
         // mv.displayMenu(); 
         // System.out.println("\nview the map " + player1.getName());
     System.out.format("\nView the map." + game.getMap());
      }
    
    // The viewList method
    // Purpose: viewList
    // Parameters: none
    // Returns: none
    // ===================================     
    private void viewList()
    {
      System.out.println("\nView the list.");
     ListMenuView lmv = new ListMenuView();
     lmv.displayMenu(); //changed from displayMenuView to displayMenu 11.16.18 NH
    }
    
    // The moveToNewLocation method
    // Purpose: displays the moveToNewLocation menu
    // Parameters: none
    // Returns: none
    // ===================================     
    public void moveToNewLocation()
    {
      System.out.println("\nMove to new location.");
    }
    
    // The manageCrops method
    // Purpose: run the plantCrops View
    // Parameters: none
    // Returns: none
    // ===================================     
    public void manageCrops()
    {
      CropView.runCropView();
    }    
}
