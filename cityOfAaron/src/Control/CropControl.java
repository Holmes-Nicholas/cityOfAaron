// The CropControl class - part of the control layer
// class contains all of the calculation methods for managing the crops
// Author: Nicholas Holmes, David Nielson, Jared Goff
// Date last modified: October 25, 2018
//---------------------
package Control;

import model.CropData;
import java.util.Random;
import exceptions.*;

/**
 *
 * Group author of buyLand method
 * Nicholas Holmes author of feedPeople method
 */
public class CropControl 
{
// constants
private static final int LAND_BASE = 17;
private static final int LAND_RANGE = 10;  

// random number generator
private static Random random = new Random();
    
// The buyLand method
// Purpose: To buy land
// Parameters: the price of land, the number of acres to buy, 
// and a reference to a CropData object
// Returns: the number of acres owned after the purchase
// Pre-conditions: acres to buy must be positive
// and  wheatInStore >=acresToBuy * landPrice

    public static void buyLand(int landPrice, int acresToBuy, CropData cropData) throws CropException{
        //if acresToBuy < 0, return -1
        if(acresToBuy < 0)
            throw new CropException("\nA negative value was input");
        
        //if acresToBuy * landPrice is > wheatInStore, return -1
        int _wheatInStore = cropData.getWheatInStore();
        if(acresToBuy * landPrice > _wheatInStore)
            throw new CropException("\nThere is insufficient wheat to buy this much land");
            
        //wheatInStore = wheatInStore – (acresToBuy * landPrice)        
        _wheatInStore -= (acresToBuy * landPrice);
        cropData.setWheatInStore(_wheatInStore);
        
        //acresOwned = acresOwned + acresToBuy
        int owned = cropData.getAcresOwned();
        owned += acresToBuy;
        cropData.setAcresOwned(owned);
              
        //return acresOwned
        //return owned;
    }
    
/**
* The feedPeople method
* Purpose: Set aside wheat to feed the people
* @param wheatToFeed the number of bushels of wheat to set aside to feed the people
* @param cropData reference to a CropData cropData object
* @return bushels of wheat in store 
* Pre-conditions: bushels of wheat to set aside must be >= zero
* and >= bushels of wheat in store 
**/

    public static int feedPeople(int wheatToFeed, CropData cropData) throws CropException{
        //if wheatToFeed < 0, return -1
        if (wheatToFeed < 0)
            throw new CropException("A negative value was input.");
        
        //if wheatToFeed > wheatInStore, return -1
        int _wheatInStore = cropData.getWheatInStore();
        if (wheatToFeed > _wheatInStore)
            throw new CropException("There is insufficient wheat to feed the people.");
               
        //wheatInStore = wheatInStore – wheatToFeed
        _wheatInStore -= wheatToFeed;
        cropData.setWheatInStore(_wheatInStore);
        
        //wheatForFood = wheatForFood + wheatToFeed
        int _wheatForFood = cropData.getWheatForFood();
        _wheatForFood += wheatToFeed;
        cropData.setWheatForFood(_wheatForFood);
        
        //return wheatInStore
        return _wheatInStore;
    }
    /**
 *
 * @author jgoff
 */

/**
* The plantCrops method
* Purpose: Set aside wheat to plant next year.
* @param acresPlanted to a CropData cropData object.
* @param cropData
* @return bushels of wheat in store 
* Pre-conditions: bushels of wheat to set aside must be >= zero
* and >= bushels of wheat in store
* Jgoff updated for exception 12.1.18
**/
    
    public static int plantCrops(int acresPlanted, CropData cropData) throws CropException
    {
        //if acresPlanted < 0, return -1
        if (acresPlanted < 0)
            throw new CropException("\nA negative value was input");
    
        //if population <= acresPlanted*.1, return -1
        int peoplePerAcre = cropData.getPopulation();
        if(peoplePerAcre <= acresPlanted * .1)
            throw new CropException("\nThere is insufficient people to plant this much land");
        
        //if wheatInStore < acresPlanted/2, return -1
        int WheatInStore = cropData.getWheatInStore();
        if (WheatInStore < acresPlanted/2)
            throw new CropException("\nThere is insufficient wheat in store to plant this much land");
               
        
        //if acresOwned is <= acresPlanted return -1
        int acresOwned = cropData.getAcresOwned();                
        if (acresOwned <= acresPlanted)
            throw new CropException("\nThere is insufficient land to plant this much land");
               
        //return acresPlanted
        return acresPlanted;  
    } 
    /**
// The setOffering method
* Purpose: To set aside a percentage of the harvest for offering
* @param harvest amount of the harvest
* @param offering percentage desired for offering
* @param cropData reference to a CropData object
* @return the amount of the offering
* Pre-conditions: offering must be > 0 
* and < 100 
*/
    public static int setOffering(int harvest, int offering, CropData cropData){
        
    //if harvest is <= 0, return 0
    if (harvest <= 0)
        return 0;  
    
    //if offering is <=0, return -1
    if (offering<=0)
        return -1;
    
    //if offering is >=100, return -1
    if (offering >=100)
        return -1;
    
    //offering = harvest*setOffering
    cropData.setOffering(offering*harvest);    
     
    //HarvestAfterOffering=harvest-offering
    var harvestAfterOffering = cropData.harvestAfterOffering();
    //return HarvestAfterOffering
    return harvestAfterOffering;

    }
    // calcLandCost() method
    // Purpose: Calculate a random land cost between 17 and 26 bushels/acre
    // Parameters: none
    // Returns: the land cost
    public static int calcLandCost()
    {        
      int landPrice = random.nextInt(LAND_RANGE) + LAND_BASE;  
      return landPrice;            
    }
    private static int landPrice;
    
    // sellLand method
    // Purpose: Sell land  - subtracts from the acres owned
    // Parameters: the price of land, the number of acres to sell, and
    //     a reference to a CropData object 
    // Pre-conditions: acresToSell >= 0 and acresToSell <= acresOwned
    // Returns: the number of acres owned after the sale
 public static int sellLand(int landprice, int acresToSell, CropData cropData) throws CropException
    {
          //if acresToSell < 0, return -1
          if(acresToSell < 0)
              throw new CropException("\nA negative value can not be input");
        
         //if acresToSell > acresOwned, return -1
        int owned = cropData.getAcresOwned();
        if(acresToSell > owned)
             throw new CropException ("\nYou have insufficient funds for the amount entered");
                //acresOwned = acresOwned - acresToSell
        owned -= acresToSell;
        cropData.setAcresOwned(owned);
        
        //wheatInStore = wheatInStore + (acresToSell x landPrice)
        int _wheatInStore = cropData.getWheatInStore();
        _wheatInStore+= (acresToSell * landPrice);
        cropData.setWheatInStore(_wheatInStore);
        
        //return acresOwned
        return owned;
    }
    
}

