/*
 * The Game() class file for the cityOfAaron project
 * CIT-260
 * Fall 2018
 * Team members: Nicholas Holmes, David Nielson, Jared Goff
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author N
 */
public class Game {
    
    // Attributes
    private Player thePlayer;    
    private CropData cropData;
    private Map map;
    private ArrayList<ListItem> tools;
    
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

    
    
    public void setMap(Map theMap) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    map = theMap;
    }
    
    //getter for Map object
    public Map getMap()
    {
        return map;
    }
    
    //setter and getter for the tool array by Dave Nielson
    public void setTools(ArrayList<ListItem> _tools) {
    tools = new ArrayList<ListItem>(_tools);    
    }
    public ArrayList<ListItem> getTools(){
        return tools;
    }
}
