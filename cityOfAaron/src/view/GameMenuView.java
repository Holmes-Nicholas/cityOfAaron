// The GameMenuView class - part of the view layer
// Object of this class manages the main menu
// Author:  Jared Goff
// Date last modified: Dec 6 2018
//-------------------------------------------------------------

package view;

import Control.GameControl;
import java.util.Scanner;
import cityofaaron.CityOfAaron;
import model.CropData;
import model.Game;
import model.Location;
import model.Map;

/**
 *
 * @author Jared Goff
 */
    //Added extends MenuView so it will inherit from MenuView.
public class GameMenuView extends MenuView

{
    // private static Game game = CityOfAaron.getGame();
    // private static Map map = game.getMap();
    
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
     System.out.println("\n       ***   VILLAGE MAP   ***   ");
     
     Game game = CityOfAaron.getGame();
     Map map = game.getMap();
     
     //Set grid
     int r = 0;
     int c = 0;
     int line = 0;
     System.out.println("");
     System.out.println("       1     2     3     4     5   ");
     while (r < 5)
     {
         line = r + 1;
         System.out.printf(" " + line + " ");
         while (c < 5)
         {
             System.out.printf(" | ");
             Location locations = map.getLocation(r, c);
             System.out.printf(locations.getSymbol());
             c++;
         }
         System.out.println(" | ");
         c = 0;
         r++;
     }
     System.out.println("\nKey: ");
     System.out.println("~~~ : River West");
     System.out.println("$$$ : Market");
     System.out.println("|^| : Temple");
     System.out.println("HHH : Housing");
     System.out.println("(~) : Lake");
     System.out.println("FFF : Farmland");
     System.out.println("xxx : Lamanite Border");
     System.out.println(">>> : Undeveloped");
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
