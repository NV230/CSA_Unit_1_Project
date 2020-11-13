import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class red_player here.
 * 
 * @author Nibodh, Yash, Tameem, Shahil
 * @version 1.0
 */
public class red_player extends Actor
{
    /**
     * Act - do whatever the red_player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    public void act() 
    {
        // Add your action code here.
        move(-40);
        if (isAtEdge()) {
           turn(180); 
        }
    }    
}
