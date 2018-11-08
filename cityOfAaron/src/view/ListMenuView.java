// The ListMenuView class - part of the view layer
// Object of this class manages the List menu
// Author: Nicholas Holmes
// Date last modified: Nov 7 2018
//-------------------------------------------------------------

package view;

import model.*;
import Control.*;
import java.util.Scanner;
import cityofaaron.CityOfAaron;

/**
 *
 * @author Nicholas Holmes
 */
public class ListMenuView 
{
  Scanner keyboard = new Scanner(System.in);
  
  private String listMenu;
  private int max;


  // The displayMenuView method
  // Purpose: displays the menu, gets the user's input, and does the 
  // selected action
  // Parameters: none
  // Returns: none
  // =========================================================    
  public void displayMenuView()
  {
    int menuOption;
    do
    {
        // Display the menu
        System.out.println(listMenu);

        // Prompt the user and get the user’s input
        menuOption = getMenuOption();

        // Perform the desired action
        doAction(menuOption);

    } while (menuOption != max);
  }
  
// The ListMenuView constructor
// Purpose: Initialize the menu data
// Parameters: none
// Returns: none
// ===================================
  public ListMenuView()
  {
     listMenu = "\n" +
          "**********************************\n" +
          "* CITY OF AARON: VIEW/PRINT LIST MENU  *\n" +
          "**********************************\n" +
          " 1 - List or view the animals in the storehouse\n" +
          " 2 - List or view the tools in the storehouse\n" +
          " 3 - List or view the provisions in the storehouse\n" +
          " 4 - List or view the developers of this game\n" +
          " 5 - Back to the Game Menu\n";
        
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
        // if the option is 1, call listAnimals()
        case 1: // List or view the animals in the storehouse
          listAnimals();
          break;

        // if the option is 2, call listTools()
        case 2: // List or view the tools in the storehouse
          listTools();
          break;
  
        // if the option is 3, call listProvisions()
        case 3: // List or view the provisions in the storehouse
          listProvisions();
          break;
   
        // if the option is 4, call listTeam()
        case 4: // List or view the developers of this game
          listTeam();
          break;

        // if the option is 5, return to game menu
        case 5:
          return;
      } 
    }
    
    // The listAnimals method
    // Purpose: clists the animals in the storehouse
    // Parameters: none
    // Returns: none
    // ===================================     
    public void listAnimals()
    {
        // Display the animals in the storehouse
        System.out.println("\nList or view the animals in the storehouse selected.");
  
    }
    
    // The listTools method
    // Purpose: lists the tools in the storehouse.
    // Parameters: none
    // Returns: none
    // ===================================     
    public void listTools()
    {
        // Display the tools in the storehouse
        System.out.println("\nList or view the tools in the storehouse selected.");
    }
    
    // The listProvisions method
    // Purpose: lists the provisions in the storehouse
    // Parameters: none
    // Returns: none
    // ===================================     
    public void listProvisions()
    {
      System.out.println("\nList or view the provisions in the storehouse selected.");
    }
    
    // The listTeam method
    // Purpose: lists the developers of this game 
    // Parameters: none
    // Returns: none
    // ===================================     
    public void listTeam()
    {
      System.out.println("\nList or view the developers of this game selected.");
    }    
    
}
