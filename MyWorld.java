
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;  // Imports array so we can group objects (players)
import java.util.Scanner;

/**
 * MyWorld Class
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
<<<<<<< HEAD
    
    public int timer;
    
    ArrayList <red_player> red_list = new ArrayList <red_player>(); // Idk if this works
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
=======
>>>>>>> 77a6ffed8dca56feee9e035f00a317bde7527104
    
    ArrayList<Red_Player> red_list = new ArrayList<Red_Player>(); // List of red players(Us)
    
    ArrayList <Blue_Player> blue_list = new ArrayList <Blue_Player>(); // List of blue players(defense)
    
    public MyWorld()
    {    
        // Create a new world with 800x500 cells with a cell size of 1x1 pixels.
        super(800, 500, 1);
        prepare();
        
    }
    private void prepare()
    {
<<<<<<< HEAD
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
        
        
        addObject(blue1,570, 250);
        addObject(blue2,570, 270);
        addObject(blue3,570, 290);
        addObject(blue4,570, 230);
        addObject(blue5,570, 210);
        addObject(blue6,570, 330); 
        addObject(blue7,570, 360); 
        addObject(blue8, 570, 170); 
        addObject(blue9, 570, 140); 
        addObject(blue10, 530, 250); // linebacker
        
        
        
    }
    
    public void act(){
        // showText is a buit in method which shows variables.
        // timer is divided by sixty to mirror what an actual second looks like.
        // 80 & 20 are coordinates
        
=======
        //Instantiating Red1
        Red_Player red1 = new Red_Player(1,688,250);
        addObject(red1,688, 250);
        red_list.add(red1);
        red1.readyUp();

        //Instantiating Red2
        Red_Player red2 = new Red_Player(2,688,270);
        addObject(red2,688, 270);
        red_list.add(red2);
        red2.readyUp();

        //Instantiating Red3
        Red_Player red3 = new Red_Player(3,688,290);
        addObject(red3, 688, 290);
        red_list.add(red3);
        red3.readyUp();

        //Instantiating Red4
        Red_Player red4 = new Red_Player(4,688,230);
        addObject(red4, 688, 230);
        red_list.add(red4);
        red4.readyUp();

        //Instantiating Red5
        Red_Player red5 = new Red_Player(5,688,210);
        addObject(red5, 688, 210);
        red_list.add(red5);
        red5.readyUp();

        //Instantiating Red6
        Red_Player red6 = new Red_Player(6,688,330);
        addObject(red6,688, 330);
        red_list.add(red6);
        red6.readyUp();

        //Instantiating Red7
        Red_Player red7 = new Red_Player(7,688,360);
        addObject(red7,688, 360);
        red_list.add(red7);
        red7.readyUp();

        //Instantiating Red8
        Red_Player red8 = new Red_Player(8,688,170);
        addObject(red8, 688, 170);
        red_list.add(red8);
        red8.readyUp();

        //Instantiating Red9
        Red_Player red9 = new Red_Player(9,688,140);
        addObject(red9, 688, 140);
        red_list.add(red9);
        red9.readyUp();

        //Instantiating Red10
        Red_Player red10 = new Red_Player(10,733,250);
        addObject(red10, 733, 250); //quarterback
        red_list.add(red10);
        red10.readyUp();
        
        //Instantiating Blue1
        Blue_Player blue1 = new Blue_Player(658,250);
        addObject(blue1,658, 250);
        blue_list.add(blue1);
        
        //Instantiating Blue2
        Blue_Player blue2 = new Blue_Player(658,270);
        addObject(blue2,658, 270);
        blue_list.add(blue2);
        
        //Instantiating Blue3
        Blue_Player blue3 = new Blue_Player(658,290);
        addObject(blue3,658, 290);
        blue_list.add(blue3);
        
        //Instantiating Blue4
        Blue_Player blue4 = new Blue_Player(658,230);
        addObject(blue4,658, 230);
        blue_list.add(blue4);
        
        //Instantiating Blue5
        Blue_Player blue5 = new Blue_Player(658,210);
        addObject(blue5,658, 210);
        blue_list.add(blue5);
        
        //Instantiating Blue6
        Blue_Player blue6 = new Blue_Player(658,330);
        addObject(blue6,658, 330); 
        blue_list.add(blue6);
        
        //Instantiating Blue7
        Blue_Player blue7 = new Blue_Player(658,360);
        addObject(blue7,658, 360); 
        blue_list.add(blue7);
        
        //Instantiating Blue8
        Blue_Player blue8 = new Blue_Player(658,170);
        addObject(blue8, 658, 170);
        blue_list.add(blue8);
        
        //Instantiating Blue9
        Blue_Player blue9 = new Blue_Player(658,140);
        addObject(blue9, 658, 140);
        blue_list.add(blue9);
        
        //Instantiating Blue10
        Blue_Player blue10 = new Blue_Player(618,250);
        addObject(blue10, 618, 250); // Quarterback
        blue_list.add(blue10);
>>>>>>> 77a6ffed8dca56feee9e035f00a317bde7527104
    }
}
