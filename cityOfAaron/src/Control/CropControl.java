// The CropControl class - part of the control layer
// class contains all of the calculation methods for managing the crops
// Author: Nicholas Holmes, David Nielson, Jared Goff
// Date last modified: October 25, 2018
//---------------------
package Control;

import model.CropData;


/**
 *
 * Group author of buyLand method
 * Nicholas Holmes author of feedPeople method
 */
public class CropControl {    
// The buyLand method
// Purpose: To buy land
// Parameters: the price of land, the number of acres to buy, 
// and a reference to a CropData object
// Returns: the number of acres owned after the purchase
// Pre-conditions: acres to buy must be positive
// and  wheatInStore >=acresToBuy * landPrice

    public static int buyLand(int landPrice, int acresToBuy, CropData cropData){
        //if acresToBuy < 0, return -1
        if(acresToBuy < 0)
            return -1;
        
        //if acresToBuy * landPrice is > wheatInStore, return -1
        int _wheatInStore = cropData.getWheatInStore();
        if(acresToBuy * landPrice > _wheatInStore)
            return -1;
            
        //wheatInStore = wheatInStore – (acresToBuy * landPrice)        
        _wheatInStore -= (acresToBuy * landPrice);
        cropData.setWheatInStore(_wheatInStore);
        
        //acresOwned = acresOwned + acresToBuy
        int owned = cropData.getAcresOwned();
        owned += acresToBuy;
        cropData.setAcresOwned(owned);
              
        //return acresOwned
        return owned;
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

    public static int feedPeople(int wheatToFeed, CropData cropData){
        //if wheatToFeed < 0, return -1
        if (wheatToFeed < 0)
            return -1;
        
        //if wheatToFeed > wheatInStore, return -1
        int _wheatInStore = cropData.getWheatInStore();
        if (wheatToFeed > _wheatInStore)
            return -1;
               
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
**/
    
    public static int plantCrops(int acresPlanted, CropData cropData){
        //if acresPlanted <= 0, return -1
        if (acresPlanted <= 0)
            return -1;
    
        //if population <= acresPlanted*.1, return -1
        int peoplePerAcre = cropData.getPopulation();
        if(peoplePerAcre <= acresPlanted * .1)
            return -1;
        
        //if wheatInStore < acresPlanted/2, return -1
        int WheatInStore = cropData.getWheatInStore();
        if (WheatInStore < acresPlanted/2)
            return -1;
               
        
        //if acresOwned is <= acresPlanted return -1
        int acresOwned = cropData.getAcresOwned();                
        if (acresOwned <= acresPlanted)
            return -1;
               
        //return acresPlanted
        return acresPlanted;  
    } 

}