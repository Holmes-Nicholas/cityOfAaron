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
public class CropControlPlantCropsTest {
    
    public CropControlPlantCropsTest() {
    }



    /**
     * Test of plantCrops method, of class CropControl.
     */
    @Test
    public void testPlantCrops() {
        System.out.println("plantCrops Test 1");
        int acresPlanted = 20;
        CropData cropData = new CropData();
        cropData.setWheatInStore(50);
        cropData.setAcresOwned(200);
        cropData.setPopulation(20);
        int expResult = 20;
        int result = CropControl.plantCrops(acresPlanted, cropData);
        assertEquals(expResult, result);
       
    }
    @Test
    public void testPlantCropstest2() {
        System.out.println("plantCrops Test2");
        int acresPlanted = 200;
        CropData cropData = new CropData();
        cropData.setWheatInStore(50);
        cropData.setAcresOwned(200);
        cropData.setPopulation(20);
        int expResult = -1;
        int result = CropControl.plantCrops(acresPlanted, cropData);
        assertEquals(expResult, result);
    }    
    
    @Test
    public void testPlantCropstest3() {
        System.out.println("plantCrops Test 3");
        int acresPlanted = 1000;
        CropData cropData = new CropData();
        cropData.setWheatInStore(50);
        cropData.setAcresOwned(200);
        cropData.setPopulation(50);
        int expResult = -1;
        int result = CropControl.plantCrops(acresPlanted, cropData);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPlantCropstest4() {
        System.out.println("plantCrops Test 4");
        int acresPlanted = 25;
        CropData cropData = new CropData();
        cropData.setWheatInStore(5);
        cropData.setAcresOwned(200);
        cropData.setPopulation(50);
        int expResult = -1;
        int result = CropControl.plantCrops(acresPlanted, cropData);
        assertEquals(expResult, result);
    }
}
