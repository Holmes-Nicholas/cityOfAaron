// The HelpMenuView class - part of the view layer
// Object of this class manages the help menu
// Author: David Nielson
// Date last modified: Nov 17 2018
//-------------------------------------------------------------
package view;

import Control.GameControl;
import java.util.Scanner;
import cityofaaron.CityOfAaron;

public class HelpMenuView extends MenuView
{
   
  // The HelpMenuView constructor
  // Purpose: Initialize the help menu data
  // Parameters: none
  // Returns: none
  // ===================================
  public HelpMenuView()
  {
     super("\n" + //'super' calls the base class constructor
          "**********************************\n" +
          "* CITY OF AARON: HELP MENU  *\n" +
          "**********************************\n" +
          " 1 - What are the goals of the game?\n" +
          " 2 - Where is the city of Aaron?\n" +
          " 3 - How do I view the map?\n" +
          " 4 - How do I move to another location\n" +
          " 5 - How do I display a list of animals, provisions and tools in the city storehouse?\n" +
          " 6 - Back to the Main Menu\n",
        
      6);
  }
  
    // The doAction method
    // Purpose: performs the selected action
    // Parameters: none
    // Returns: none
    // ===================================       
    @Override
    public void doAction(int option)
    {
      switch(option)
      {
        // if the option is 1, call viewGoals( )
        case 1: // list goals of the game
          viewGoals();
          break;

        // if the option is 2, call viewMapHelp( )
        case 2: // get map help
          viewMapHelp();
          break;
  
        // if the option is 3, call viewMapHelp( )
        case 3: // get map menu
          viewMapHelp();
          break;
   
        // if the option is 4, call viewMoveHelp( )
        case 4: // get move help
          viewMoveHelp();
          break;
          
          // if the option is 5, call viewListHelp( )
        case 5: // get list help
          viewListHelp();
          
        // if the option is 6, return
        case 6://return
          return;
      }      
    
}
   // The viewGoals method
    // Purpose: shows goals
    // Parameters: none
    // Returns: none
    // ===================================     
    public void viewGoals()
    {    
        
    // Display the game goals.
    System.out.println("\nThese are the goals of the game");  
    }
    // The viewMapHelp method
    // Purpose: get map help
    // Parameters: none
    // Returns: none
    // ===================================     
    public void viewMapHelp()
    {
      System.out.println("\nMap services");
    }
    // The viewMoveHelp method
    // Purpose: get moving help
    // Parameters: none
    // Returns: none
    // ===================================
    public void viewMoveHelp()
    {
      System.out.println("\nMoving Locations");
    }
    // The viewListHelp method
    // Purpose: get item list help
    // Parameters: none
    // Returns: none
    // ===================================
    public void viewListHelp()
    {
      System.out.println("\nHere is your list of items");
    }
}  