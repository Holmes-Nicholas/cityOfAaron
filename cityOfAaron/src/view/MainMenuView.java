// The MainMenuView class - part of the view layer
// Object of this class manages the main menu
// Author: Nicholas Holmes , David Nielson, Jared Goff
// Date last modified: Dec 6 2018
//-------------------------------------------------------------

package view;

import Control.GameControl;
import java.util.Scanner;
import cityofaaron.CityOfAaron;
import model.Game;

//Keyword extends means that this class inherits from MenuView
public class MainMenuView extends MenuView
{    
// The MainMenuView constructor
// Purpose: Initialize the menu data
// Parameters: none
// Returns: none
// ===================================
  public MainMenuView()
  {
     super("\n" + //super calls the base class constuctor
          "**********************************\n" +
          "* CITY OF AARON: MAIN GAME MENU  *\n" +
          "**********************************\n" +
          " 1 - Start new game\n" +
          " 2 - Get and start a saved game\n" +
          " 3 - Get help on playing the game\n" +
          " 4 - Save game\n" +
          " 5 - Quit\n",        
      5);
  } 
  
    // The doAction method
    // Purpose: performs the selected action
    // Parameters: none
    // Returns: none
    // ===================================  
  
    //This Overrides the method declared in ViewInterface
    @Override public void doAction(int option) 
    {
      switch(option)
      {
        // if the option is 1, call startNewGame( )
        case 1: // create and start a new game
          startNewGame();
          break;

        // if the option is 2, call startExistingGame( )
        case 2: // get and start a saved game
          startSavedGame();
          break;
  
        // if the option is 3, call displayHelpMenu( )
        case 3: // get help menu
          displayHelpMenuView();
          break;
   
        // if the option is 4, call displaySaveGame( )
        case 4: // save game
          displaySaveGameView();
          break;

        // if the option is 5, display a goodbye message
        case 5:
          System.out.println("Thanks for playing ... goodbye.");
      } 
    }
    
    // The startNewGame method
    // Purpose: creates game object and starts the game
    // Parameters: none
    // Returns: none
    // ===================================     
    public void startNewGame()
    {
           
    // Display the Banner Page.
    System.out.println("\nWelcome to the beautiful city of Aaron.");
   
    // Prompt for and get the user’s name.
    String name;
    System.out.println("\nPlease type in your first name: ");
    name = keyboard.next();
    

    // Call the createNewGame() method in the GameControl class
    GameControl.createNewGame(name);

    // Display a welcome message
    System.out.println("Welcome " + name + " have fun!!!");

    // Display the Game menu
    GameMenuView gmv = new GameMenuView();
    gmv.displayMenu();
  
    }
    
    // The startSavedGame method
    // Purpose: get and start a saved game
    // Parameters: none
    // Returns: none
    // ===================================     
    public void startSavedGame()
    {
    
    // prompt user and get a file path      
    String filepath;    
    System.out.println("\nEnter the name of the file:");
    keyboard.nextLine();//This get rid nl character left in the stream
    filepath = keyboard.nextLine();

    // call the getSavedGame( ) method in the GameControl class to load the game
    GameControl.getSavedGame(filepath);
    
    // display the game menu for the loaded game
    GameMenuView gmv = new GameMenuView();
    gmv.displayMenu();
    }
    
    // The displayHelpMenuView method
    // Purpose: displays the help menu
    // Parameters: none
    // Returns: none
    // ===================================     
    public void displayHelpMenuView()
    {
     System.out.println("\nHelp Menu selected.");
     // this shows the help menu
     HelpMenuView hmv = new HelpMenuView();
     hmv.displayMenu();

    }
    
    // The displaySaveGameView method
    // Purpose: displays the save game menu 
    // Parameters: none
    // Returns: none
    // ===================================     
    public void displaySaveGameView()
    {
        
    //prompt user and get a file path      
    String filepath;
    System.out.println("\nEnter the filepath where you want to save the game: ");
    keyboard.nextLine();//This get rid nl character left in the stream
    filepath = keyboard.nextLine();    
   
    // call the savedGame( ) method in the GameControl class to load the game
    GameControl.saveGame(filepath);    
    
    System.out.println("\nSave game was successful.");    
    }    
    
}
