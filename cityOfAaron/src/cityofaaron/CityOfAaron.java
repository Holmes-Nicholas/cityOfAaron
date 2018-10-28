/*
 * The main() class file for the cityOfAaron project
 * CIT-260
 * Fall 2018
 * Team members: Nicholas Holmes, David Nielson, Jared Goff
 */
package cityofaaron;
import model.*;

/**
 *@author aaowgne (Dave Nielson)
 * @author jgoff
 * @author Holmes-Nicholas
 */
public class CityOfAaron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create player1 and set name to Joe
        Player player1 = new Player();
        player1.setName("Joe");
        
        //create new game object and set player to player1
        Game game1 = new Game();
        game1.setPlayer(player1);
        
        //display Player1 name
        System.out.println("Player Name: " + player1.getName());
        
        //display entry from TeamMember enum
        System.out.println(TeamMember.NIC.getName() + " - " + TeamMember.NIC.getTitle());
        
        //test from CropData class. Create year1 object and set year to 1980
        CropData year1 = new CropData();
        year1.setYear(1980);
        
        //display year1 year
        System.out.println("Year Started: " + year1.getYear()); 
        
        // ListItem created by Jared Goff
        //Test the ListItem class.  Create arces and setnumber to 100
        ListItem arces = new ListItem();     
        arces.setName("arces");
        arces.setNumber(100);
        //display number of arces
        System.out.format("ListItem name is %s. ListItem number %d\n",
                arces.getName (),
                arces.getNumber ());
        // Location Data Class by Dave Nielson
        //Test location
        Location earth = new Location();
        earth.setDescription("earth");
        earth.setSymbol ("globe");
        System.out.format("");
    }

}
