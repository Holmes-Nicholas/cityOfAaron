// GameContol class - part of the Control layer
// Author: Nicholas Holmes , David Nielson, Jared Goff
// Date last modified: Dec 6 2018
//-------------------------------------------------------------
package Control;
import model.*;
import cityofaaron.CityOfAaron;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import model.ListItem;






/**
 *
 * @author jgoff
 */
public class GameControl
{
    // size of the Locations array
    private static final int MAX_ROW = 5;
    private static final int MAX_COL = 5;
    
    // Create a new Game object.
    private static Game game;// = new Game();

  public static void createNewGame(String _name)
  {
   game = new Game(); 

    // Create a new Player object and set the name
    Player player = new Player();
    player.setName(_name);
    
    // Store a reference to the Player object in the Game object
    game.setPlayer(player);
    
    
    //create map
    createMap();

    // create crop data object
    createCropDataObject();
    

    // Create a CropData object
    CropData cropData = new CropData();

    // create a cropdata object
    createToolList();

    
    //create provision list
    createProvisionList();
    
    //create animal list Jared
    createAnimalList();

    CityOfAaron.setGame(game);
    
  
}

      // method prologue ….
    public static void createCropDataObject()
    {
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
    //cropData.setOffering(300);
    
    // Save a reference to the CropData object in the Game object
    game.setCropData(cropData);             
    }
    
    // The createMap method
    // Purpose: creates the location objects and the map
    // Parameters: none
    // Returns: none
    public static void createMap()   
    {
        // create the Map object, it is 5 x 5
        // refer to the Map constructor
        Map theMap = new Map(MAX_ROW, MAX_COL);
        
        // create a string that will go in the Location objects
        // that contain the river
        String riverWest = "\nYou are floating down the West River. The river is the source" +
                      "\nof water for drinking and watering our crops. The West River marks the western " +
                      "\nboundary of the City of Aaron - it is desert to the West.";

        // create a new Location object
        Location loc = new Location();

        // use setters in the Location class to set the description and symbol
        loc.setDescription(riverWest  + "\nLand that borders the river is fertile farmland." +
                "\nOne bushel will plant two acres of wheat." +
                "\nIt takes 20 bushels of wheat to feed one person."); 
        loc.setSymbol("~~~");  

        // set this location object in each cell of the array in column 0      
        for(int i = 0; i < MAX_ROW; i++)
        {
            theMap.setLocation(i, 0, loc);
        }
        
        //this is the location object for the city's market.
        String market = "\nThis is the city's market. Here you can buy and sell all manner of goods.";
        
        // create a new Location object
        Location locMarket = new Location();
        
        // use setters in the Location class to set the description and symbol
        locMarket.setDescription(market);
        locMarket.setSymbol("$$$");  
        
        for(int j = 2; j < 4; j++)
        {
            theMap.setLocation(1, j, locMarket);
        }
        
         //this is the location object for the temple.
        String temple = "\nThis is the City of Aaron Temple." + 
                "\nIt is located at the center of the city. " +
                 "\nHere you can worship and make convenants.";
        
        // create a new Location object
        Location locTemple = new Location();
        
        // use setters in the Location class to set the description and symbol
        locTemple.setDescription(temple + "\nYou can give an offering of wheat." +
                                        "\nTen percent is a great idea!");
        locTemple.setSymbol("|^|");  
        
        theMap.setLocation(2, 2, locTemple);
        
         //this is the location object for the city's housing.
        String housing = "\nThis is where your home is located." +
                "\nThe City of Aaron is a master planned city." +
                "\nAll housing is located in the south east part of the city.";
        
        // create a new Location object
        Location locHousing = new Location();
        
        // use setters in the Location class to set the description and symbol
        locHousing.setDescription(housing  + "\nBe sure to plant enough wheat to feed everyone. Don't forget new residents.");
        locHousing.setSymbol("HHH");            
        
         // set this location object in each cell of the array in column 0      
        for(int i = 2; i < MAX_ROW; i++)
        {
            for(int j = 3; j < MAX_COL; j++)
            {       
            theMap.setLocation(i, j, locHousing);
            }
        }
        
         //this is the location object for the city's market.
        String lake = "\nWelcome to the waters of Aaron.  Here baptisms are performed.";
        
        // create a new Location object
        Location locLake = new Location();
        
        // use setters in the Location class to set the description and symbol
        locLake.setDescription(lake);
        locLake.setSymbol("(~)");  
        
        theMap.setLocation(1, 4, locLake);
        
        // This is the farmland object.
        String farmland = "\nThe City of Aaron has very fertile farmland.";
                      
        // create a new Location object
        Location locFarmland = new Location();

        // use setters in the Location class to set the description and symbol
        locFarmland.setDescription(farmland + "\nBe sure to own enough land so that you can grow enough wheat."); 
        locFarmland.setSymbol("FFF");  

        // set this location object in each cell of the array in column 0      
        for(int i = 1; i < MAX_ROW; i++)
        {
            theMap.setLocation(i, 1, locFarmland);
        }
        
        // This is the Lamanite boarder object.
        String border = "\nThe northen land border the Lamanite Kingdom.";
                      
        // create a new Location object
        Location locBorder = new Location();

        // use setters in the Location class to set the description and symbol
        locBorder.setDescription(border); 
        locBorder.setSymbol("xxx");  

        // set this location object in each cell of the array in column 0      
        for(int j = 1; j < MAX_COL; j++)
        {
            theMap.setLocation(0, j, locBorder);
        }
        
           // This is the undeveloped land object.
        String undeveloped = "\nThis land is undeveloped. It is a nice place to walk your dog!";
                      
        // create a new Location object
        Location locUndeveloped = new Location();

        // use setters in the Location class to set the description and symbol
        locUndeveloped.setDescription(undeveloped); 
        locUndeveloped.setSymbol(">>>");  

        // set this location object in each cell of the array in column 0      
        for(int i = 3; i < MAX_ROW; i++)
        {
            theMap.setLocation(i, 2, locUndeveloped);
        }
        game.setMap(theMap); 
    }



        //create the array for the tool list from the menu Author Dave Nielson
    public static void createToolList()
    {
        ArrayList<ListItem> tools = new ArrayList<>();
        
        tools.add(new ListItem("Plows", 22));
        tools.add(new ListItem("Shovels", 74));
        tools.add(new ListItem("Hoes", 63));
        tools.add(new ListItem("Hammers", 32));
       
        game.setTools(tools);
    }



  

    
    // The createProvisionsList method
    // Purpose: creates the list of provisions
    // Parameters: none
    // Returns: none
    public static void createProvisionList()   
    {
        ArrayList<ListItem> provisions = new ArrayList<>();
        
        provisions.add(new ListItem("Water", 212));
        provisions.add(new ListItem("Honey", 100));
        provisions.add(new ListItem("Bandaids", 50));
        provisions.add(new ListItem("Scriptures", 75));
        provisions.add(new ListItem("Shoes", 30));
        provisions.add(new ListItem("Hats", 20));
        
        game.setProvisions(provisions);
        
    }
    // The createAnimalList method Jared
    // Purpose: creates the list of animals
    // Parameters: none
    // Returns: none
    public static void createAnimalList()   
    {
        ArrayList<ListItem> animals = new ArrayList<>();
        
        animals.add(new ListItem("Ox", 200));
        animals.add(new ListItem("Donkey", 50));
        animals.add(new ListItem("Chicken", 200));
        animals.add(new ListItem("cow", 500));
        animals.add(new ListItem("Pig", 100));
        
        
        game.setAnimals(animals);
        
    }
    // the getSavedGame method
    // Purpose: load a saved game from disk
    // Parameters: the file path
    // Returns: none
    // Side Effect: the game reference in the driver is updated
    public static void getSavedGame(String filepath)
    {        
        
        try (FileInputStream fips = new FileInputStream(filepath))
        {
            ObjectInputStream input = new ObjectInputStream(fips);
            game = (Game) input.readObject();
            CityOfAaron.setGame(game);
        }
        catch(Exception e)
        {
            System.out.println("\nThere was an error reading the saved game file");
        }
    }

    // the saveGame method
    // Purpose: save game to disk
    // Parameters: the file path
    // Returns: none
    // Side Effect: the game reference in the driver is updated
    public static void saveGame(String filepath)
    {
               
        try (FileOutputStream fops = new FileOutputStream(filepath))
        {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            output.writeObject(game);
            output.flush();//Clears the stream
            output.close();//Closes the stream
        }
        catch(Exception e)
        {
            System.out.println("\nThere was an error saving the game file.");
        }
    }

    public static void printWriter(String filepath, ArrayList<ListItem> list, String listTitle) {
                

        try (PrintWriter out = new PrintWriter(filepath))
        {
            //put title
            out.println("\n\n        " + listTitle + " Inventory List                ");
            //create columns
            out.printf("%n%-16s%24s", listTitle, "Quantity");
            out.printf("%n%-16s%24s", "--------", "--------"); 
            for (ListItem item : list) {
                out.printf("%n%-16s%24d", item.getName(), item.getNumber());
            }
            //put successful save message
            System.out.println("\nFile \"" + filepath + "\" was successfully saved."); 
            out.close(); //Close the stream
        }
        catch(Exception e)
        {
            //execption if it can't save file
            System.out.println("\nThere was an error saving the list.");         }
    }
}
