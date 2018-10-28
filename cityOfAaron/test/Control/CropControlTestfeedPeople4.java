/*
* Test 4 for feedPople method
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
public class CropControlTestfeedPeople4 {
    
    public CropControlTestfeedPeople4() {
    }

    /**
     * Test of feedPeople method, of class CropControl.
     * Test Case 4
     */
    
    @Test
    public void testFeedPeople() {
        System.out.println("feedPeople");
        int wheatToFeed = 300;
        CropData cropData = new CropData();
        cropData.setWheatInStore(300);
        int expResult = 0;
        int result = CropControl.feedPeople(wheatToFeed, cropData);
        assertEquals(expResult, result);
              
    }
    
}
