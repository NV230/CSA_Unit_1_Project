import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class blue_player here.
 * 
 * @author Nibodh, Yash, Shahil, Tameem 
 * @version 1.0
 */
public class blue_player extends Actor
{
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
}
