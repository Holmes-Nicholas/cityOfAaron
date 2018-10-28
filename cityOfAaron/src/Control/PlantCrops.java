// The PlantCrops class - part of the control layer
// class contains all of the calculation methods for planting the crops
// Author: Jared Goff
// Date last modified: October 26, 2018
//---------------------
package Control;

import model.CropData;

/**
 *
 * @author jgoff
 */
public class PlantCrops {
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
