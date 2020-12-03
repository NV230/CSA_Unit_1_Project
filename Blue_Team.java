import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Blue_Team Class
 * 
 * @author Nibodh, Yash, Tameem, Shahil
 * @version 1.0
 */
public class Blue_Team extends Actor
{
    public int xLoc; //x coordinate
    public int yLoc; //y coordinate
    
    MyWorld field = (MyWorld) getWorld(); // Establishes connection to myWorld subclass
   
    //setter for x coordinate
    public void setXPos(int x) 
    {
        xLoc=x;
    }  
    
    //setter for y coordinate
    public void setYPos(int y) 
    {
        yLoc=y;
    }  
    
    //getter for x coordinate
    public int getXPos() {
        return xLoc;
    }
    
    //getter for y coordinate 
    public int getYPos() {
        return yLoc;
    }
    
    //sets up players in their correct location
    public void readyUp() {
        setLocation(xLoc, yLoc);
    }
}
