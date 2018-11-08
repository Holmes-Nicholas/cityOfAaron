// The HelpMenuView class - part of the view layer
// Object of this class manages the help menu
// Author: David Nielson
// Date last modified: Nov 7 2018
//-------------------------------------------------------------
package view;

import Control.GameControl;
import java.util.Scanner;
import cityofaaron.CityOfAaron;

public class HelpMenuView 
{
    Scanner keyboard = new Scanner(System.in);
  
  private String theMenu;
  private int max;
    
  
  // The displayMenuView method
  // Purpose: displays the menu, gets the user's input, and does the 
  //               selected action
  // Parameters: none
  // Returns: none
  // =========================================================    
  public void displayMenuView()
  {
    int menuOption;
    do
    {
        // Display the menu
        System.out.println(theMenu);

        // Prompt the user and get the user’s input
        menuOption = getMenuOption();

        // Perform the desired action
        doAction(menuOption);

    } while (menuOption != max);
  }
  // The HelpMenuView constructor
  // Purpose: Initialize the help menu data
  // Parameters: none
  // Returns: none
  // ===================================
  public HelpMenuView()
  {
     theMenu = "\n" +
          "**********************************\n" +
          "* CITY OF AARON: HELP MENU  *\n" +
          "**********************************\n" +
          " 1 - What are the goals of the game?\n" +
          " 2 - Where is the city of Aaron?\n" +
          " 3 - How do I view the map?\n" +
          " 4 - How do I move to another location\n" +
          " 5 - How do I display a list of animals, provisions and tools in the city storehouse?\n" +
          " 6 - Back to the Main Menu\n";
        
     max = 6;
  }
  // The getMenuOption method  
    // Purpose: gets the user's input
    // Parameters: none
    // Returns: integer - the option selected
    // ===================================       
    public int getMenuOption()
    {
       // declare a variable to hold user’s input
       int userInput = 0;
       final int MAX = 6;
       Scanner keyboard = new Scanner(System.in);

       // begin loop
       do
       {
            // get user input from the keyboard
            userInput = keyboard.nextInt();
            // if it is not a valid value, output an error message
            if(userInput < 1 || userInput > MAX)
                System.out.println("Error: you must select 1, 2, 3, 4, or 5");
            // loop back to the top of the loop if input was not valid
        // end loop
        } while (userInput < 1 || userInput > MAX);
       
       return userInput;
    }
    // The doAction method
    // Purpose: performs the selected action
    // Parameters: none
    // Returns: none
    // ===================================       
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