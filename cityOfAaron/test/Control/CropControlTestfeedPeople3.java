package Control;

/*
* Test 3 for feedPople method
 */


import model.CropData;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nicholas Holmes
 * 
 */
public class CropControlTestfeedPeople3 {
    
    public CropControlTestfeedPeople3() {
    }

    /**
     * Test of feedPeople method, of class CropControl.
     * Test Case 3
     */
    
    @Test
    public void testFeedPeople() {
        System.out.println("feedPeople");
        int wheatToFeed = 200;
        CropData cropData = new CropData();
        cropData.setWheatInStore(100);
        int expResult = -1;
        int result = CropControl.feedPeople(wheatToFeed, cropData);
        assertEquals(expResult, result);
              
    }
    
}
