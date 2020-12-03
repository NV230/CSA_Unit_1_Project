import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList; //Imports ArrayLists

/**
 * Blue_Player class
 * 
 * @author Nibodh, Yash, Shahil, Tameem 
 * @version 1.0
 */
public class Blue_Player extends Blue_Team
{
<<<<<<< HEAD
    /**
     * Act - do whatever the blue_player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int getRandomNumber(int start,int end)
    {
       int normal = Greenfoot.getRandomNumber(end-start+1);
       return normal+start;
    }
    public void act() 
    
    {
         if (!isAtEdge()){
            int distance = getRandomNumber(70, 100);
            System.out.println(distance + " units");
            move(-distance);
            Greenfoot.delay(20);
    }
        
        else{
            
            
            Greenfoot.stop();
        }
        // Need to group these actors
        // Add your action code here.
    }    
=======
    //incorporates parameters for x and y coordinates
    public Blue_Player(int h, int v) {
        xLoc=h;
        yLoc=v;
        
    }
>>>>>>> 77a6ffed8dca56feee9e035f00a317bde7527104
}
