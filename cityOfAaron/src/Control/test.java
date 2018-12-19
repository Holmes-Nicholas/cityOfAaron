/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import model.CropData;

/**
 *
 * @author N
 */
public class test {

    int acresToBuy = 735;
    String player1 = "Bob";
    
    public void buyLandTest(int acresToBuy, String player1){
            if (acresToBuy < 100){
                System.out.println(player1 + ", " + acresToBuy + "is not a lot of land.");
            }
            else if (acresToBuy < 300){
                    System.out.println(player1 + ", " + acresToBuy + "is a good amount of land. Are you sure you don't want more?");
            }
            else if (acresToBuy < 700){
                    System.out.println(player1 + ", " + acresToBuy + "is a lot of land!");
            }
            else {
                    System.out.println(player1 + ", " + acresToBuy + "is an incredible amount of land! Thank you!");
                    }
    }        

}
               