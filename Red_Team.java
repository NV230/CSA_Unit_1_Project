import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Red_Team Class
 * 
 * @author Nibodh, Yash, Tameem, Shahil 
 * @version 1.0
 */
public class Red_Team extends Actor
{
    public int playerNumber; //Assigned numbers to players in case of future additions
    public int xLoc; //x coordinate as an integer
    public int yLoc; //y coordinate as an integer
    
    public boolean waiting; //Tells if the players are ready in position or not
    
    MyWorld field = (MyWorld) getWorld(); //Establishes connection with MyWorld clas
   
    //Setter for x coordinate
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
    
    //moves players to their starting location
    public void readyUp() {
        setLocation(xLoc, yLoc);
    }
    
    //uses boolean variable to confirm players are ready
    public void waitUp() {
        readyUp();
        waiting=true;
    }
}
