// The ListMenuView class - part of the view layer
// Object of this class manages the List menu
// Author: Nicholas Holmes
// Date last modified: Nov 16 2018
//-------------------------------------------------------------

package view;

import model.ListItem;
import model.Game;
import Control.GameControl;
import java.util.Scanner;
import cityofaaron.CityOfAaron;
import java.util.ArrayList;

/**
 *
 * @author Nicholas Holmes
 */
//Added 'extends MenuView' so the class inherits from MenuView 11.16.18 NH
public class ListMenuView extends MenuView
{ 
    // The ListMenuView constructor
    // Purpose: Initialize the menu data
    // Parameters: none
    // Returns: none
    // ===================================
    public ListMenuView()
    {
        super("\n" + //'super' calls the base class constructor 11.16.18 NH
          "**********************************\n" +
          "* CITY OF AARON: VIEW/PRINT LIST MENU  *\n" +
          "**********************************\n" +
          " 1 - List or view the animals in the storehouse\n" +
          " 2 - List or view the tools in the storehouse\n" +
          " 3 - List or view the provisions in the storehouse\n" +
          " 4 - List or view the developers of this game\n" +
          " 5 - Back to the Game Menu\n",
        
        5);
    }
  
    // The doAction method
    // Purpose: performs the selected action
    // Parameters: none
    // Returns: none
    // ===================================       
    
    //added '@Override' to override the method declared in ViewInterface 11.16.18 NH
    @Override public void doAction(int option)
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
    
    // The listAnimals method Jared
    // Purpose: clists the animals in the storehouse
    // Parameters: none
    // Returns: none
    // ===================================     
    public void listAnimals()
    {
      // Display the animals in the storehouse
      System.out.println("\nAnimals in the City of Aaron.");
      Game theGame = CityOfAaron.getGame();
      ArrayList<ListItem> animals = theGame.getAnimals();

      System.out.format("%-16s%-24s\n", "Animals", "Quantity");
      for(ListItem animal : animals){
      System.out.format("%-16s%-24s\n", animal.getName(), animal.getNumber()); 
      }
    }
    // The listTools method
    // Purpose: lists the tools in the storehouse.
    // Parameters: none
    // Returns: none
    // ===================================     
    public void listTools()
    {
        Game theGame = CityOfAaron.getGame();
        // Display the tools in the storehouse Author David Nielson
        ArrayList<ListItem> tools = theGame.getTools();
        
        //System.out.println("\nTools in the City of Aaron");
        System.out.format("%-16s%-24s\n", "Tool", "Quantity");
        
        for(ListItem tool : tools) { 
        System.out.format("%-16s%-24s\n", tool.getName(), tool.getNumber());
}
    }
    
    // The listProvisions method
    // Purpose: lists the provisions in the storehouse
    // Parameters: none
    // Returns: none
    // ===================================     
    public void listProvisions()
    {
        //Show options to show, save or return
        System.out.format("\n" +
                      "***************************************\n" +
                      "*      DISPLAY OR PRINT PROVISIONS     *\n" +
                      "***************************************\n" +
                      " 1 - View the list of Provisions \n" +
                      " 2 - Save list of Provisions to a file \n" +
                      " 3 - Return to previous menu\n");

        System.out.print("\nPlease select an option: ");  
        int select = keyboard.nextInt();
         
        // List or view the animals in the storehouse
        Game theGame = CityOfAaron.getGame();
        ArrayList<ListItem> provisions = theGame.getProvisions();
        
         //action 1 - view the list
        if (select == 1) {
            System.out.format("%-16s%-24s\n", "Provision", "Quantity");
            for(ListItem provision : provisions) 
                { 
                   // List or view the tools in the storehouse
                   System.out.format("%-16s%-24s\n", provision.getName(), provision.getNumber());
                }
            listTools();   
            } 
        //action 2 - save the list
        else if (select == 2) {
            String filepath;
            
            //ask user to input the filepath
            System.out.println("\nPlease enter filepath: ");
            keyboard.nextLine();
            filepath = keyboard.nextLine();
            
            //call method printwriter to save the file
            GameControl.printWriter(filepath, provisions, "Provisions");
            
            //show again the tools menu
            listProvisions();
            
        } 
        //action 3 - return to previous menu
        else if (select == 3) {
            ListMenuView lmv = new ListMenuView();
            lmv.displayMenu();
        } 
        //invalid option
        else {
            System.out.print("\nNot a valid selection. Enter 1, 2, or 3.");
            listProvisions();
        }
      
     /* //if ("2".equals(answer)) /*
      {
            System.out.println("\nEnter the filepath where you want to save the provisions list: ");
            keyboard.nextLine();//This get rid nl character left in the stream
            filepath = keyboard.nextLine();   
                        
            GameControl.printWriter(filepath, provisions, "Provisions");
        }      */
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
