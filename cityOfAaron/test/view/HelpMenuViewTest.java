/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aaowg
 */
public class HelpMenuViewTest {
    
    public HelpMenuViewTest() {
    }

    /**
     * Test of displayMenuView method, of class HelpMenuView.
     */
    @Test
    public void testDisplayMenuView() {
        System.out.println("displayMenuView");
        HelpMenuView instance = new HelpMenuView();
        instance.displayMenuView();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMenuOption method, of class HelpMenuView.
     */
    @Test
    public void testGetMenuOption() {
        System.out.println("getMenuOption");
        HelpMenuView instance = new HelpMenuView();
        int expResult = 0;
        int result = instance.getMenuOption();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doAction method, of class HelpMenuView.
     */
    @Test
    public void testDoAction() {
        System.out.println("doAction");
        int option = 0;
        HelpMenuView instance = new HelpMenuView();
        instance.doAction(option);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of viewGoals method, of class HelpMenuView.
     */
    @Test
    public void testViewGoals() {
        System.out.println("viewGoals");
        HelpMenuView instance = new HelpMenuView();
        instance.viewGoals();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of viewMapHelp method, of class HelpMenuView.
     */
    @Test
    public void testViewMapHelp() {
        System.out.println("viewMapHelp");
        HelpMenuView instance = new HelpMenuView();
        instance.viewMapHelp();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of viewMoveHelp method, of class HelpMenuView.
     */
    @Test
    public void testViewMoveHelp() {
        System.out.println("viewMoveHelp");
        HelpMenuView instance = new HelpMenuView();
        instance.viewMoveHelp();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of viewListHelp method, of class HelpMenuView.
     */
    @Test
    public void testViewListHelp() {
        System.out.println("viewListHelp");
        HelpMenuView instance = new HelpMenuView();
        instance.viewListHelp();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
