/*
 * The ListItem() class file for the cityOfAaron project
 * CIT-260
 * Fall 2018
 * Team members: Nicholas Holmes, David Nielson, Jared Goff
 */
package model;

/**
 *
 * @author jgoff
 */
public class ListItem {
        private String name;
    private int number;

   
    public ListItem(String _name, int _number) {
     name = _name;
     number = _number;
    }

    public ListItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    
}
