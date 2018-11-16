// The ViewInterface interface contains the common menu view classes.
// Author: David Nielson Nicholas Holmes Jared Goff
// Date last modified: 11-15-18
//-------------------------------------------------------------
package view;


public interface ViewInterface
{
    public void displayMenu();
    public int getMenuOption();
    public void doAction(int option);   
}    
