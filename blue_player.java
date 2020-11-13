import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class blue_player here.
 * 
 * @author Nibodh, Yash, shahil, Tameem 
 * @version 1.0
 */
public class blue_player extends Actor
{
    /**
     * Act - do whatever the blue_player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(-40);
        if (isAtEdge()) {
           turn(180); 
        }
        
        // Add your action code here.
    }    
}
