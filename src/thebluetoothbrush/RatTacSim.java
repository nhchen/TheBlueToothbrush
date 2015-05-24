/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thebluetoothbrush;
import java.awt.*;
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
        JFrame frame = new JFrame("The War of The Rats");
        //set the min and max dimensions - we don't want them shifting the
        //screen size
        Dimension dim = new Dimension(750,750);
        frame.setMinimumSize(dim);
        //now we fill it with buttons - set the layout to grid layout, then fill
        //with buttons
        frame.setLayout(new GridLayout(13,13));
        //no make the button array
        JButton [][] buttArray = new JButton[13][13];
        for(int i = 0;i<13;i++){
            for(int j = 0;j<13;j++){
                buttArray[i][j] = new JButton();
                
                        
            }
        }
        for(int i = 0;i<13;i++){
            for(int j = 0;j<13;j++){
                frame.add(buttArray[i][j]);
            }
        }
       buttArray[2][2].setVisible(false);
       for(int i = 0;i<13;i++)
        {
            for(int j = 0;j<13;j++){
                buttArray[i][j].addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    
                    System.out.println("Button Press");
                }
            });
            }
        }
        frame.setVisible(true);
    }
    
}
