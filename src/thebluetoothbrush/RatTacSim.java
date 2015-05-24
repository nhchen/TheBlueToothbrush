/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thebluetoothbrush;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import thebluetoothbrush.Game;

/**
 *
 * @author eman0_000
 */
public class RatTacSim {
    public void updateButton(){
        //So here we plan on creating code that updates the button array based
        //on the new array
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a new Frame to hold our game
        Game rts = new Game();
        rts.newGame();
        rts.printBoard();
        
        
        
    }
    
    
}
