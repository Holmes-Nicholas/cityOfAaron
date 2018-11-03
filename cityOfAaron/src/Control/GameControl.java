/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import model.*;
import cityofaaron.CityOfAaron;


/**
 *
 * @author jgoff
 */
public class GameControl
{
  public static void createNewGame(String _name)
  {
    // Create a new Game object.
    Game game = new Game();

    // Create a new Player object and set the name
    Player player = new Player();
    player.setName(_name);
    
    // Store a reference to the Player object in the Game object
    game.setPlayer(player);

    // Create a CropData object
    CropData cropData = new CropData();
    
    // Initialize the data values in the CropData object
    cropData.setYear(0);
    cropData.setPopulation(100);
    cropData.setNewPeople(5);
    cropData.setCropYield(3);
    cropData.setNumberWhoDied(0);
    cropData.setWheatInStore(2700);
    cropData.setAcresOwned(1000);
    cropData.setAcresPlanted(1000);
    cropData.setHarvest(3000);
    cropData.setAcresPlanted(1000);
    
    // Save a reference to the CropData object in the Game object
    game.setCropData(cropData);
    
    // Save a reference to the Game object in the static variable
    CityOfAaron.setGame(game);
  }
}
