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

    //private _provisions provisions;
    private ArrayList<ListItem> provisions;
    //private _provisions provisions;
    private ArrayList<ListItem> animals;
 
    
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

    public void setProvisions(ArrayList<ListItem> _provisions) {
        provisions = new ArrayList<ListItem>(_provisions);
    }
        
    public ArrayList<ListItem> getProvisions(){
        return provisions;
    }
    //Set how many animals
    public void setAnimals(ArrayList<ListItem> _animals) {
        animals = new ArrayList<ListItem>(_animals);
    }
    
    //Get how many animals
    public ArrayList<ListItem> getAnimals(){
        return animals;
    }



    
}