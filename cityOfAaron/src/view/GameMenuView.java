// The GameMenuView class - part of the view layer
// Object of this class manages the main menu
// Author:  Jared Goff
// Date last modified: Nov 7 2018
//-------------------------------------------------------------

package view;

import Control.GameControl;
import java.util.Scanner;
import cityofaaron.CityOfAaron;

public class GameMenuView
{
  Scanner keyboard = new Scanner(System.in);
  
  private String theMenu;
  private int max;
  
  //The GameMenuView Method
  //Purpose: Open GameMethodView
  //Parameters: none
  //Parameters: none
  
  
   public void displayMenuView()
    {
        int menuOption;
        do
        {
            // Display the menu
            System.out.println(theMenu);
            
            // Prompt the user and get the user’s input
            menuOption=getMenuOption();
            
            // Perform the desired action
             doAction(menuOption);
        } while (menuOption != max);

    }
    //The Game MenuView constructor
    //purpose: Intialize the game menu
    //Parameters: none
    //returns: none   

  public GameMenuView()
  {
     theMenu = "\n" +
          "**********************************\n" +
          "* CITY OF AARON: MAIN GAME MENU  *\n" +
          "**********************************\n" +
          " 1 - viewMap\n" +
          " 2 - viewList\n" +
          " 3 - moveToNewLocation\n" +
          " 4 - manageCrops\n" +
          " 5 - Quit\n";
        
     max = 5;
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
       final int MAX = 5;
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
          System.out.println("nView the map");
  
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
