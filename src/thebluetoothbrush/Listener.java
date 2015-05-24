/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thebluetoothbrush;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
/**
 *
 * @author Nick
 */
public class Listener implements ActionListener{
    Troop[] temp = new Troop[2];
    int xco;
    int yco;
    int atype = 0;
    boolean toggle;
    
    Listener( int x, int y ){
    
        xco = x;
        yco = y;
        
        
    
    }
    public int getX( Listener l ){
        return l.xco;
    }
    
    public int getY( Listener l ){
        return l.yco;
    }
    
    public int determ( Troop t1, Troop t2 ){
        atype = 0;
        //if( t1.getType() > 0 & t1.getType() < 20 ){
            if( t2.getType() == 0 ){
               atype = 1; 
            }else{
                if( t2.getType() > 0 & t2.getType() < 20 ){
                    atype = 2;
                }
            }
        //}
        return atype;
        
    }
    
    public Troop[] doIt( int x, Troop t1, Troop t2 ){
        if( x == 1 ){
            temp[0] = t2;
            temp[1] = t1;
        }if( x == 2 ){
          
            temp[0].setHealth(temp[0].getHealth());
            temp[1].setHealth(temp[1].getHealth());
        }
        return temp;
    }
    
    public void actionPerformed(ActionEvent e){
    
    }     
}

   