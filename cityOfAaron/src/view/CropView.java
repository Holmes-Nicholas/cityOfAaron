/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

//import Control.CropControl;
import model.*;
import Control.*;
import java.util.Scanner;
import cityofaaron.CityOfAaron;

/**
 *
 * @author jgoff
 */
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
    }
}
