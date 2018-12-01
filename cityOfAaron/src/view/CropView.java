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
import exceptions.*;

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
        System.out.format("\nLand is selling for %d bushels per acre.%n",price);
        //System.out.print("\nHow many acres of land do you wish to buy? "); 

        //  Get the user’s input and save it.
        int toBuy;
        boolean paramsNotOkay;
        do
        {
            paramsNotOkay = false;
            System.out.print("\nHow many acres of land do you wish to buy? ");  
            toBuy = keyboard.nextInt();
            try
            {
                CropControl.buyLand(price, toBuy, cropData);
            }
            catch(CropException e)
            {
                System.out.println("I am sorry master, I cannot do this.");
                System.out.println(e.getMessage());
                paramsNotOkay = true;
            }
        }while(paramsNotOkay);

       // toBuy = keyboard.nextInt();
        
       // Call the buyLand( ) method in the control layer to buy the land
       // CropControl.buyLand(price, toBuy, cropData);
    
        // output how much land we now own
        System.out.format("You now own %d acres of land. \n", cropData.getAcresOwned());
    }
    
    // The feedPeopleView method()
    // Purpose: interface with the user input for setting wheat aside for feeding people 
    // Parameters: none
    // Returns: none
    // Author: Nicholas Holmes
    public static void feedPeopleView()
    {       
        // Prompt the user to enter the number of bushels of grain to set aside
        //System.out.print("\nHow many bushels of grain do you want to set aside to feed the people? "); 

        //  Get the user’s input and save it.
        int wheatToFeed;
        boolean paramsNotOkay;
        do
        {
            paramsNotOkay = false;
            System.out.print("\nHow many bushels of grain do you want to set aside to feed the people? ");  
            wheatToFeed = keyboard.nextInt();
            try
            {
                CropControl.feedPeople(wheatToFeed, cropData);
            }
            catch(CropException e)
            {
                System.out.println("I am sorry master, I cannot do this.");
                System.out.println(e.getMessage());
                paramsNotOkay = true;
            }
        }while(paramsNotOkay);
        
        // output how much wheat we now have set aside to feed people and
        // how much is left in storage
        System.out.format("\nYou now have %d bushels of grain set aside to feed people. ", cropData.getWheatForFood());
        System.out.format("\nYou now have %d bushels of grain left in storage. ", cropData.getWheatInStore());
    }
    
    //plantCropsView method()
    //Purpose: interface with the user input for planting crops
    //Parameters: none
    //Returns: None
    //Author: Jared Goff Try and Catch 11.30.18
    public static void plantCropsView()
    {    
            
        // Prompt the user to enter the acres of land to plant
        System.out.print("\nHow many acres of land do you want to plant? ");
        
        // Get the user’s input and save it.
        int acresToPlant;
        
        boolean paramsNotOkay;
        do {
            paramsNotOkay = false;
        acresToPlant = keyboard.nextInt();
        try 
        {           
        
        // Call the plantCrops() method in the control layer to plant the crops
        CropControl.plantCrops(acresToPlant, cropData);
        
        // output the amount of wheat left in storage
        System.out.format("\nYou now have %d wheat in store. ", cropData.getWheatInStore());
        
        //output The number of bushels that are left in store
        System.out.format("\nYou now have planted %d aces of land.", cropData.getAcresPlanted());         
        }
        catch(CropException e)
                {
                System.out.println("I am sorry master, I cannot do this.");
                System.out.println(e.getMessage());
                paramsNotOkay = true;
                }
        }while(paramsNotOkay);
    }

    // The runCropView method()
    // Purpose: runs the methods to manage the crops game
    // Parameters: none
    // Returns: none
    public static void runCropView()
    {
        // call the buyLandView( ) method
        buyLandView( );
        
        // call the plantCorpView method
        plantCropsView();
        
        // add calls to the other crop view methods
        // as they are written
        feedPeopleView( );
        
        //call the sellLandView
        sellLandView( );
        
    }
    public static void sellLandView()
    {
        // Get the cost of land for this round.
        int price = CropControl.calcLandCost();

        // Prompt the user to enter the number of acres to sell
        //System.out.format("Land is selling for %d bushels per acre.%n",price);
        //System.out.print("\nHow many acres of land do you wish to sell? "); 
        // Prompt the user to enter the number of acres to buy
        System.out.format("\nLand is selling for %d bushels per acre.%n",price);
        //System.out.print("\nHow many acres of land do you wish to buy? "); 

        //  Get the user’s input and save it.
        int toSell;
        boolean paramsNotOkay;
        do
        {
            paramsNotOkay = false;
            System.out.print("\nHow many acres of land do you wish to sell? ");  
            toSell = keyboard.nextInt();
            try
            {
                CropControl.sellLand(price, toSell, cropData);
            }
            catch(CropException e)
            {
                System.out.println("I am sorry master, I cannot do this.");
                System.out.println(e.getMessage());
                paramsNotOkay = true;
            }
        }while(paramsNotOkay);

        //  Get the user’s input and save it.
        //int toSell;
        //toSell = keyboard.nextInt();

        // Call the sellLand( ) method in the control layer to buy the land
        //int sellLand = CropControl.sellLand(price, toSell, cropData);
    
        // output how much land we now own
        System.out.format("You now own %d acres of land. \n", cropData.getAcresOwned());
    }
}

