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
    
    // Attributes
    private Player thePlayer;    
    private CropData cropData;
    
    //Constructor
    public Game()
    {
        
    }
    
    //Functions
    public void setPlayer(Player _player)
    {
        thePlayer = _player;
    }
    
    public Player getPlayer()
    {
        return thePlayer;
    }

    //setter for CropData object
    public void setCropData(CropData _cropData)
    {
        cropData = _cropData;
    }
    
    //getter for CropData object
    public CropData getCropData()
    {
        return cropData;
    }
}
