/*
 * The Game() class file for the cityOfAaron project
 * CIT-260
 * Fall 2018
 * Team members: Nicholas Holmes, David Nielson, Jared Goff
 */
package model;

/**
 *
 * @author N
 */
public class Game {
    
    //public static void main(String[] args) {}
    
    // Attributes
    private Player thePlayer;
    
    //Constructor
    public Game()
    {}
    
    //Functions
    public void setPlayer(Player a)
    {
        thePlayer = a;
    }
    public Player getPlayer()
    {
        return thePlayer;
    }
     
}
