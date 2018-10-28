/*
* Test 2 for feedPople method
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
public class CropControlTestfeedPeople2 {
    
    public CropControlTestfeedPeople2() {
    }

    /**
     * Test of feedPeople method, of class CropControl.
     * Test Case 2
     */
    
    @Test
    public void testFeedPeople() {
        System.out.println("feedPeople");
        int wheatToFeed = -100;
        CropData cropData = new CropData();
        cropData.setWheatInStore(100);
        int expResult = -1;
        int result = CropControl.feedPeople(wheatToFeed, cropData);
        assertEquals(expResult, result);
              
    }
    
}
