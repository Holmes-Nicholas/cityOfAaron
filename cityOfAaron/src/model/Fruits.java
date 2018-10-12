/*
 *This file contains the code for the fruits enumeration
 * CIT-260
 * Fall 2018
 * Team members: Nicholas Holmes, David Nielson, Jared Goff
 */
package model;

/**
 *
 * @author N
 */
public enum Fruits {
     // The members of the enumeration
    APPLE("Apple", "red"),
    BANANA("Banana", "yellow"),
    PLUMB("Plumb", "purple");

    //data members
    private String name;
    private String color;
    
    // Public constructor
    // Purpose: initializes the values of name and color
    // Parameters: the name of the fruit and its color
    // Returns: none
    Fruits(String _name, String _color)
    {
     name = _name;
     color = _color;
    }
    
    // The getName() method
    // Purpose: returns the value stored in name
    // Parameters: none
    // Returns: the value stored in name
    public String getName()
    {
        return name;
    }
    
    // The getColor() method
    // Purpose: returns the value stored in color
    // Parameters: none
    // Returns: the value stored in color
    public String getColor()
    {
        return color;
    }
}
