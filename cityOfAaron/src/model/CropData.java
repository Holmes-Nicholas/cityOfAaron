/*
 * The CropData() class file for the cityOfAaron project
 * CIT-260
 * Fall 2018
 * Team members: Nicholas Holmes, David Nielson, Jared Goff
 */
package model;

/**
 *
 * @author N
 */
public class CropData {
    //instance fields
    private int year; 
    private int population;
    private int acresOwned;
    private int cropYield;
    private int wheatInStore;
    private int numberWhoDied;
    private int newPeople;
    private int harvest;
    private int wheatForFood;
    private int acresPlanted;
    
    //getters and setters for instance fields
    public void setYear(int _year){
        year = _year;
    }
    public int getYear(){
        return year;
    }
    public void setPopulation(int _population){
        population = _population;
    }
    public int getPopulation(){
        return population;
    }
    public void setAcresOwned(int _acresOwned){
        acresOwned = _acresOwned;
    }
    public int getacresOwned(){
        return acresOwned;
    }
    public void setCropYield(int _cropYield){
        cropYield = _cropYield;
    }
    public int getCropYield(){
        return cropYield;
    }
    public void setWheatInStore(int _wheatInStore){
        wheatInStore = _wheatInStore;
    }
    public int getWheatInStore(){
        return wheatInStore;
    }
    public void setNumberWhoDied(int _numberWhoDied){
        numberWhoDied = _numberWhoDied;
    }
    public int getNumberWhoDied(){
        return numberWhoDied;
    }
    public void setNewPeople(int _newPeople){
        newPeople = _newPeople;
    }
    public int getNewPeople(){
        return newPeople;
    }
    public void setHarvest(int _harvest){
        harvest = _harvest;
    }
    public int getHarvest(){
        return harvest;
    }
    public void setWheatForFood(int _wheatForFood){
        wheatForFood = _wheatForFood;
    }
    public int getWheatForFood(){
        return wheatForFood;
    }
    public void setAcresPlanted(int _acresPlanted){
        acresPlanted = _acresPlanted;
    }
    public int getAcresPlanted(){
        return acresPlanted;
    }
}
