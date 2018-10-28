/*
* Test 1 for feedPople method
 */
package Control;

import model.CropData;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nicholas Holmes
 * 
 */
public class CropControlTestfeedPeople1 {
    
    public CropControlTestfeedPeople1() {
    }

    /**
     * Test of feedPeople method, of class CropControl.
     * Test Case 1
     */
    
    @Test
    public void testFeedPeople() {
        System.out.println("feedPeople");
        int wheatToFeed = 200;
        CropData cropData = new CropData();
        cropData.setWheatInStore(300);
        int expResult = 100;
        int result = CropControl.feedPeople(wheatToFeed, cropData);
        assertEquals(expResult, result);
              
    }
    
}
