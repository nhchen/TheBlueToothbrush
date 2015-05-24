/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thebluetoothbrush;

/**
 *
 * @author Nick
 */
public class Troop{
    
    
    private  int health;
    private  int attack;
    private  int x;
    private  int y;
    private  int type;
    private  int speed;
    Troop(){
        health = 1;
        type = 0;
        attack = 0;
        speed = 0;
        
    }
    Troop( String base ){
        type = 21;
        health = 1000;
        attack = 0;
        speed = 0;
    }
    Troop( int h ){
        health = h;
        attack = 0 ;
        type = 22;
        speed = 0;
    }
    
    Troop( int h, int a, int xc, int yc, int t ) {
        health = h;
        speed = 2;
        attack = a;
        x = xc;
        y = yc;
        type = t;
       
    }
        public int getX(){
            return x;
        }
        public int getY(){
            return y;
        }
        
        public void setAttack( int a ){
            attack = a;
        }
        
        public void setHealth( int h ){
            health = h;
        }
        
        public int getHealth(){
            return health;
        }

        public int getSpeed(){
            return speed;
        }
        public void setType(int t){
            type = t;
        }
        public int getAttack(){
            return attack;
        }
        
        public  int getType(){
            return type;
        }
        
        public void move( int x, int y ){

        }

        public void attack(){
            
        }

        public static boolean isLegal( int att, int max ){
           if( att > max || att < 1 ){
                return false;
            }
            else{
            return true;
            }
        }
}


