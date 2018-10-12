/*
 * The main() class file for the cityOfAaron project
 * CIT-260
 * Fall 2018
 * Team members: Nicholas Holmes, David Nielson, Jared Goff
 */
package cityofaaron;
import model.*;
/**
 *
 * @author jgoff
 * @author Holmes-Nicholas
 */
public class CityOfAaron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create a new player
        Player player = new Player();
        player.setName("Joe");
        
        //create a game object
        Game game = new Game();
        game.setPlayer(player);
        player.getName();
        
        System.out.println(TeamMember.NIC.getName() + " - " + TeamMember.NIC.getTitle());

        //System.out.println("Welcome to the City Of Aaron");
    }

}
