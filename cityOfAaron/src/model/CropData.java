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
    
    //setters for instance fields
    public void setYear(int _year){
        year = _year;
    }
    public void setPopulation(int _population){
        population = _population;
    }
    public void setAcresOwned(int _acresOwned){
        acresOwned = _acresOwned;
    }
    public void setCropYield(int _cropYield){
        cropYield = _cropYield;
    }
    public void setWheatInStore(int _wheatInStore){
        wheatInStore = _wheatInStore;
    }
    public void setNumberWhoDied(int _numberWhoDied){
        numberWhoDied = _numberWhoDied;
    }
    public void setNewPeople(int _newPeople){
        newPeople = _newPeople;
    }
    public void setHarvest(int _harvest){
        harvest = _harvest;
    }
    public void setWheatForFood(int _wheatForFood){
        wheatForFood = _wheatForFood;
    }
    public void setAcresPlanted(int _acresPlanted){
        acresPlanted = _acresPlanted;
    }
    
    //getters for instance fields
    public int getYear(){
        return year;
    }
    public int getPopulation(){
        return population;
    }
    public int getAcresOwned(){
        return acresOwned;
    }
    public int getCropYield(){
        return cropYield;
    }
    public int getWheatInStore(){
        return wheatInStore;
    }
    public int getNumberWhoDied(){
        return numberWhoDied;
    }
    public int getNewPeople(){
        return newPeople;
    }
    public int getHarvest(){
        return harvest;
    }
    public int getWheatForFood(){
        return wheatForFood;
    }
    public int getAcresPlanted(){
        return acresPlanted;
    }
}
