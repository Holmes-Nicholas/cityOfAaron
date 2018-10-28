/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import model.CropData;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jgoff
 */
public class PlantCropsTest1 {
    
    public PlantCropsTest1() {
    }

    /**
     * Test 1 of plantCrops method, of class PlantCrops.
     */
    @Test
    public void testPlantCrops() {
        System.out.println("plantCrops test ");
        int acresPlanted = 20;
        CropData cropData = new CropData();
        cropData.setWheatInStore(50);
        cropData.setAcresOwned(200);
        cropData.setPopulation(20);
        int expResult = 20;
        int result = PlantCrops.plantCrops(acresPlanted, cropData);
        assertEquals(expResult, result);
      }
    
    @Test
    public void testPlantCrops2() {
        System.out.println("plantCrops test 2 ");
        int acresPlanted = 100;
        CropData cropData = new CropData();
        cropData.setWheatInStore(50);
        cropData.setAcresOwned(200);
        cropData.setPopulation(50);
        int expResult = 100;
        int result = PlantCrops.plantCrops(acresPlanted, cropData);
        assertEquals(expResult, result);
      }
    
     @Test
    public void testPlantCrops3() {
        System.out.println("plantCrops test 3 ");
        int acresPlanted = 1000;
        CropData cropData = new CropData();
        cropData.setWheatInStore(50);
        cropData.setAcresOwned(200);
        cropData.setPopulation(50);
        int expResult = -1;
        int result = PlantCrops.plantCrops(acresPlanted, cropData);
        assertEquals(expResult, result);
      }
    
      @Test
    public void testPlantCrops4() {
        System.out.println("plantCrops test 4 ");
        int acresPlanted = 25;
        CropData cropData = new CropData();
        cropData.setWheatInStore(5);
        cropData.setAcresOwned(200);
        cropData.setPopulation(50);
        int expResult = -1;
        int result = PlantCrops.plantCrops(acresPlanted, cropData);
        assertEquals(expResult, result);
      }
}

  
 