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
    
    
    private int timer;
    public int getRandomNumber(int start,int end)
    {
       int normal = Greenfoot.getRandomNumber(end-start+1);
       return normal+start;
    }
    
    public void act() 
    {
        // Add your action code here.
        if (timer>=0)
            {
                timer++;
            }
        
        if (!isAtEdge()){
        int distance = getRandomNumber(70, 100);
        System.out.println(distance + " units");
        move(-distance);
        Greenfoot.delay(20);
    }
        
        else{
            getWorld().showText("Seconds: " + timer, 400,  200);
            getWorld().showText("Congrats You Win", 400, 250);
            Greenfoot.stop();
        }
    }    
}
