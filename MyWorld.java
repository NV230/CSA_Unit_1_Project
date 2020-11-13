import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;  // Imports array so we can group objects (players)
/**
 * Write a description of class MyWorld here.
 * 
 * @author Nibodh, Yash, Tameem, Shahil
 * @version 1.0
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    ArrayList <red_player> list = new ArrayList <red_player>(); // Idk if this works
    red_player play1 = new red_player();
    red_player play2 = new red_player();
    red_player play3 = new red_player();
    red_player play4 = new red_player();
    red_player play5 = new red_player();
    red_player play6 = new red_player();
    red_player play7 = new red_player();
    red_player play8 = new red_player();
    red_player play9 = new red_player();
    red_player play10 = new red_player();
    red_player play11 = new red_player();

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1);
        prepare();
    }
    
    private void prepare()
    {
        addObject(play1,600, 250);
        addObject(play2,600, 270);
        addObject(play3, 600, 290);
        addObject(play4, 600, 230);
        addObject(play5, 600, 210);
        addObject(play6,600, 330); //receiver
        addObject(play7,600, 360); //receiver
        addObject(play8, 600, 170); //receiver
        addObject(play9, 600, 140); //receiver
        addObject(play10, 645, 250); //quarterback
    }
}
