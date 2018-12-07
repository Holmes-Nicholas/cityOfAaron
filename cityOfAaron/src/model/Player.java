/*
 * The Player() class file for the cityOfAaron project
 * CIT-260
 * Fall 2018
 * Team members: Nicholas Holmes, David Nielson, Jared Goff
 */
package model;

import java.io.Serializable;

/**
 *
 * @author jgoff
 */
public class Player implements Serializable {
    //Instance Fields
    private String name;
    
    //Constructor
    public Player()
    {
    }
    
    
    //Functions
    public void setName(String _name)
    {
        name = _name;
    }
    public String getName()
    {
        return name;
    }
            
}

