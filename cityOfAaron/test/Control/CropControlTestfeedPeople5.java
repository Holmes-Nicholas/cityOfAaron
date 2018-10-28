/*
* Test 5 for feedPople method
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
public class CropControlTestfeedPeople5 {
    
    public CropControlTestfeedPeople5() {
    }

    /**
     * Test of feedPeople method, of class CropControl.
     * Test Case 5
     */
    
    @Test
    public void testFeedPeople() {
        System.out.println("feedPeople");
        int wheatToFeed = 0;
        CropData cropData = new CropData();
        cropData.setWheatInStore(100);
        int expResult = 100;
        int result = CropControl.feedPeople(wheatToFeed, cropData);
        assertEquals(expResult, result);
              
    }
    
}
