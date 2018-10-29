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
 * @author David Nielson
 * 
 */
public class CropControlsetOfferingTest {

    private int offering;
   public CropControlsetOfferingTest() {
    }

    /**
     * Test of setOffering method, of class CropControl.
     * Test Case 1
     */
    
    @Test
    public void testsetOffering() {
        System.out.println("setOffering");
        int harvest = 20;
        CropData cropData = new CropData();
        cropData.setOffering = -3;
        int expResult = -1;
       
       
        int result = CropControl.setOffering(harvest, offering, cropData);
        assertEquals(expResult, result);
              
    }
  @Test
    public void testsetOffering2() {
        System.out.println("setOffering");
        int harvest = 20;
        CropData cropData = new CropData();
        cropData.setOffering = 101;
        int expResult = -1;
       
       
        int result = CropControl.setOffering(harvest, offering, cropData);
        assertEquals(expResult, result);
              
    } 
    
}  
