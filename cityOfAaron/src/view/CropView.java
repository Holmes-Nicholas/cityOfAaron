// The CropView class - part of the view layer
// Object of this class manages the main menu
// Author: Nicholas Holmes , David Nielson, Jared Goff
// Date last modified: Nov 7 2018
//-------------------------------------------------------------
package view;

//import Control.CropControl;
import model.*;
import Control.*;
import java.util.Scanner;
import cityofaaron.CityOfAaron;

public class CropView {
    
    // Create a Scanner object
    private static Scanner keyboard = new Scanner(System.in);   
     
    // Get references to the Game object and the CropData object
    private static Game game = CityOfAaron.getGame();
    private static CropData cropData = game.getCropData();    

    // The buyLandView method
    // Purpose: interface with the user input for buying land
    // Parameters: none
    // Returns: none
    public static void buyLandView()
    {
        // Get the cost of land for this round.
        int price = CropControl.calcLandCost();

        // Prompt the user to enter the number of acres to buy
        System.out.format("Land is selling for %d bushels per acre.%n",price);
        System.out.print("\nHow many acres of land do you wish to buy? "); 

        //  Get the user’s input and save it.
        int toBuy;
        toBuy = keyboard.nextInt();

        // Call the buyLand( ) method in the control layer to buy the land
        CropControl.buyLand(price, toBuy, cropData);
    
        // output how much land we now own
        System.out.format("You now own %d acres of land. ", cropData.getAcresOwned());
    }
    
    // The feedPeopleView method()
    // Purpose: interface with the user input for setting wheat aside for feeding people 
    // Parameters: none
    // Returns: none
    // Author: Nicholas Holmes
    public static void feedPeopleView()
    {       
        // Prompt the user to enter the number of bushels of grain to set aside
        System.out.print("\nHow many bushels of grain do you want to set aside to feed the people? "); 

        //  Get the user’s input and save it.
        int wheatToFeed;
        wheatToFeed = keyboard.nextInt();

        // Call the feedPeople() method in the control layer to set aside the wheat
        CropControl.feedPeople(wheatToFeed, cropData);
        //CropData = null cropData;
    
        // output how much wheat we now have set aside to feed people and
        // how much is left in storage
        System.out.format("You now have %d bushels of grain set aside to feed people. ", cropData.getWheatForFood());
        System.out.format("\nYou now have %d bushels of grain left in storage. ", cropData.getWheatInStore());
    }
    
    //plantCropsView method()
    //Purpose: interface with the user input for planting crops
    //Parameters: none
    //Returns: None
    //Author: Jared Goff
    public static void plantCropsView()
    {
        // Prompt the user to enter the acres of land to plant
        System.out.print("\nHow many acres of land do you want to plant? ");
        
        // Get the user’s input and save it.
        int acresToPlant;
        acresToPlant = keyboard.nextInt();
        
        // Call the plantCrops() method in the control layer to plant the crops
        CropControl.plantCrops(acresToPlant, cropData);
        
        //output The number of bushels that are left in store
        System.out.format("You now have planted %d aces of land.\n", cropData.getAcresPlanted());
    }

    // The runCropView method()
    // Purpose: runs the methods to manage the crops game
    // Parameters: none
    // Returns: none
    public static void runCropView()
    {
        // call the buyLandView( ) method
        buyLandView( );

        // add calls to the other crop view methods
        // as they are written
        feedPeopleView( );
    }
}
