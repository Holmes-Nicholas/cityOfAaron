// The CropControl class - part of the control layer
// class contains all of the calculation methods for managing the crops
// Author: Nicholas Holmes, David Nielson, Jared Goff
// Date last modified: October 25, 2018
//---------------------
package Control;

import model.CropData;


/**
 *
 * @author jgoff
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
}