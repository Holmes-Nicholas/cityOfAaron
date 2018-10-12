/*
 *This file contains the code for the TeamMember enumeration
 * CIT-260
 * Fall 2018
 * Team members: Nicholas Holmes, David Nielson, Jared Goff
 */
package model;

/**
 *
 * @author N
 */
public enum TeamMember {
    // The members of the enumeration
    NIC("Nic", "The Brick"),
    JARED("Jared", "QB"),
    DAVE("Dave", "The Wave");
    
    //Instance Fields
    private String name;
    private String title;
    
    TeamMember(String _name, String _title)
    {
     name = _name;
     title = _title;
    }
        
    // get name
    public String getName()
    {
        return name;
    }
        
    // get title
    public String getTitle()
    {
        return title;
    }
}
