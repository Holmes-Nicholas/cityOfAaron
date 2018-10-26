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
 * 
 */
public class CropControlTest4 {
    
    public CropControlTest4() {
    }

    /**
     * Test of buyLand method, of class CropControl.
     * Test Case 1
     */
    
    @Test
    public void testBuyLand() {
        System.out.println("buyLand");
        int landPrice = 20;
        int acresToBuy = 20;
        CropData cropData = new CropData();
        cropData.setWheatInStore(400);
        cropData.setAcresOwned(100);
        int expResult = 120;
        int result = CropControl.buyLand(landPrice, acresToBuy, cropData);
        assertEquals(expResult, result);
              
    }
    
}
