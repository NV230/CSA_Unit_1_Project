import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Scanner; //Imports scanner for user input in terminal
import java.util.List; //Imports Lists
import java.util.ArrayList; //Imports ArrayList

/**
 * Write a description of class red_player here.
 * 
 * @author Nibodh, Yash, Tameem, Shahil
 * @version 1.0
 */

public class Red_Player extends Red_Team {
    //Initializes scanner and list of distances between blue players and red players
    Scanner sc = new Scanner(System.in);
    List<Integer> distances = new ArrayList<Integer>();
    
    //constructor for Red_Player with given parameters
    public Red_Player(int n, int h, int v) {
        playerNumber=n;
        xLoc=h;
        yLoc=v;
        waiting=true;
    }

    //Act method starts game when space bar is pressed
    public void act() { 
        if (Greenfoot.isKeyDown("space")) {
            waiting=false;
            playGame();
        }  
    }
    
    //Players are set up and user is asked whether they want to begin
    public void playGame() {
        while (!waiting) {
            waitUp();
            int questionNumber = 0;
            int downs = 1;
            int numberCorrect = 0;
            String q=Greenfoot.ask("Are you ready to start (yes/no)");
            if (q.contains("yes")){
               questionNumber++;
            }
            else {
                Greenfoot.delay(100);
                waitUp();
            }
            /**
             * 10 Questions are asked of the user
             * User must make it to touchdown in 4 downs or less, but downs are restarted if the use makes it to the 50 yard line
             * Counter is made for number of problems answer correctly and the number of downs
             * Based on the different outcomes, the user either wins or loses
             **/
            if (questionNumber == 1) {
                if (downs > 4) {
                        System.out.println("Turnover. You failed to score a touchdown.");
                        getWorld().showText(("Problems Correct: " + String.valueOf(numberCorrect)+"/"+String.valueOf(questionNumber)), 130, 20);                        
                        questionNumber = 0;
                    }
                else {
                    System.out.println("Down " + String.valueOf(downs));
                System.out.println("Simplify (8)^(⅓)");
                String answerOne = sc.nextLine();
                if (answerOne.equals("2")) {
                    int yards = getRandomNumber(-25,-15);
                    keepInFront(yards);
                    gainYards(yards);
                    numberCorrect++;
                    
                    if (getX() <= 112) {
                       System.out.println("Congrats. You made a touchdown.");
                       getWorld().showText(("Problems Correct: " + String.valueOf(numberCorrect)+"/"+String.valueOf(questionNumber)), 130, 20);
                       questionNumber = 0;
                    }
                    if ((getX() <= 400) && (getX() >= 325) && (downs < 5)) {
                        downs = 0;
                    }
                    questionNumber++;
                    downs++;
                }
                else {
                    downs++;
                    
                    if (downs > 4) {
                        System.out.println("Turnover. You failed to score a touchdown.");
                        getWorld().showText(("Problems Correct: " + String.valueOf(numberCorrect)+"/"+String.valueOf(questionNumber)), 130, 20);                        
                        questionNumber = 0;
                    }
                    else {
                        questionNumber++;
                    }
                }
                }
            }
            if (questionNumber == 2) {
                if (downs > 4) {
                        System.out.println("Turnover. You failed to score a touchdown.");
                        getWorld().showText(("Problems Correct: " + String.valueOf(numberCorrect)+"/"+String.valueOf(questionNumber)), 130, 20);                        
                        questionNumber = 0;
                    }
                else {
                    System.out.println("Down " + String.valueOf(downs));
                System.out.println("Factor (x^2 -8x +7)");
                String answerTwo = sc.nextLine();
                if (answerTwo.equals("(x-7)(x-1)") || answerTwo.equals("(x-1)(x-7)")) {
                    int yards = getRandomNumber(-25,-15);
                    keepInFront(yards);
                    gainYards(yards);
                    numberCorrect++;
                    
                    if (getX() <= 112) {
                       System.out.println("Congrats. You made a touchdown.");
                       getWorld().showText(("Problems Correct: " + String.valueOf(numberCorrect)+"/"+String.valueOf(questionNumber)), 130, 20);
                       questionNumber = 0;
                    }
                    if ((getX() <= 400) && (getX() >= 325) && (downs < 5)) {
                        downs = 0;
                    }
                    questionNumber++;  
                    downs++;
                }
                else {
                    downs++;
                    
                    if (downs > 4) {
                        System.out.println("Turnover. You failed to score a touchdown.");
                        getWorld().showText(("Problems Correct: " + String.valueOf(numberCorrect)+"/"+String.valueOf(questionNumber)), 130, 20);                        
                        questionNumber = 0;
                    }
                    else {
                        questionNumber++;
                    }
                }
                }
            }
            if (questionNumber == 3) {
                if (downs > 4) {
                        System.out.println("Turnover. You failed to score a touchdown.");
                        getWorld().showText(("Problems Correct: " + String.valueOf(numberCorrect)+"/"+String.valueOf(questionNumber)), 130, 20);                        
                        questionNumber = 0;
                    }
                else {
                    System.out.println("Down " + String.valueOf(downs));
                System.out.println("Find the slope: y= 5x + 5");
                String answerThree = sc.nextLine();
                if (answerThree.equals("5")) {
                    int yards = getRandomNumber(-25,-15);
                    keepInFront(yards);
                    gainYards(yards);
                    numberCorrect++;
                    
                    if (getX() <= 112) {
                       System.out.println("Congrats. You made a touchdown.");
                       getWorld().showText(("Problems Correct: " + String.valueOf(numberCorrect)+"/"+String.valueOf(questionNumber)), 130, 20);
                       questionNumber = 0;
                    }
                    if ((getX() <= 400) && (getX() >= 325) && (downs < 5)) {
                        downs = 0;
                    }
                    questionNumber++;
                    downs++;
                }
                else {
                    downs++;
                    
                    if (downs > 4) {
                        System.out.println("Turnover. You failed to score a touchdown.");
                        getWorld().showText(("Problems Correct: " + String.valueOf(numberCorrect)+"/"+String.valueOf(questionNumber)), 130, 20);                        
                        questionNumber = 0;
                    }
                    else {
                        questionNumber++;
                    }
                }
                }
            }
            if (questionNumber == 4) {
                if (downs > 4) {
                        System.out.println("Turnover. You failed to score a touchdown.");
                        getWorld().showText(("Problems Correct: " + String.valueOf(numberCorrect)+"/"+String.valueOf(questionNumber)), 130, 20);                        
                        questionNumber = 0;
                    }
                else {
                    System.out.println("Down " + String.valueOf(downs));
                System.out.println("What is the y-int: y= 3x + 7");
                String answerFour = sc.nextLine();
                if (answerFour.equals("7")) {
                    int yards = getRandomNumber(-25,-15);
                    keepInFront(yards);
                    gainYards(yards);
                    numberCorrect++;
                    
                    if (getX() <= 112) {
                       System.out.println("Congrats. You made a touchdown.");
                       getWorld().showText(("Problems Correct: " + String.valueOf(numberCorrect)+"/"+String.valueOf(questionNumber)), 130, 20);
                       questionNumber = 0;
                    }
                    if ((getX() <= 400) && (getX() >= 325) && (downs < 5)) {
                        downs = 0;
                    }
                    downs++;
                    questionNumber++;                    
                }
                else {
                    downs++;
                    
                    if (downs > 4) {
                        System.out.println("Turnover. You failed to score a touchdown.");
                        getWorld().showText(("Problems Correct: " + String.valueOf(numberCorrect)+"/"+String.valueOf(questionNumber)), 130, 20);                        
                        questionNumber = 0;
                    }
                    else {
                        questionNumber++;
                    }
                }
                }
            }
            if (questionNumber == 5) {
                if (downs > 4) {
                        System.out.println("Turnover. You failed to score a touchdown.");
                        getWorld().showText(("Problems Correct: " + String.valueOf(numberCorrect)+"/"+String.valueOf(questionNumber)), 130, 20);                        
                        questionNumber = 0;
                    }
                else {
                    System.out.println("Down " + String.valueOf(downs));
                System.out.println("Solve: 16x^2 - 25 = 0");
                String answerFive = sc.nextLine();
                if (answerFive.equals("5/4") || answerFive.equals("5 / 4") || answerFive.equals("1.25")) {
                    int yards = getRandomNumber(-25,-15);
                    keepInFront(yards);
                    gainYards(yards);
                    numberCorrect++;
                    
                    if (getX() <= 112) {
                       System.out.println("Congrats. You made a touchdown.");
                       getWorld().showText(("Problems Correct: " + String.valueOf(numberCorrect)+"/"+String.valueOf(questionNumber)), 130, 20);
                       questionNumber = 0;
                    }
                    if ((getX() <= 400) && (getX() >= 325) && (downs < 5)) {
                        downs = 0;
                    }
                    questionNumber++;
                    downs++;
                }
                else {
                    downs++;
                    
                    if (downs > 4) {
                        System.out.println("Turnover. You failed to score a touchdown.");
                        getWorld().showText(("Problems Correct: " + String.valueOf(numberCorrect)+"/"+String.valueOf(questionNumber)), 130, 20);                        
                        questionNumber = 0;
                    }
                    else {
                        questionNumber++;
                    }
                }
                }
            }
            if (questionNumber == 6) {
                if (downs > 4) {
                        System.out.println("Turnover. You failed to score a touchdown.");
                        getWorld().showText(("Problems Correct: " + String.valueOf(numberCorrect)+"/"+String.valueOf(questionNumber)), 130, 20);                        
                        questionNumber = 0;
                    }
                else {
                    System.out.println("Down " + String.valueOf(downs));
                System.out.println("Solve the system: (x + 5y = 20) & (-3x - 5y = -20)");
                String answerSix = sc.nextLine();
                if (answerSix.equals("(0,4)") || answerSix.equals("(0 , 4)") || answerSix.equals("(0, 4)")) {
                    int yards = getRandomNumber(-25,-15);
                    keepInFront(yards);
                    gainYards(yards);
                    numberCorrect++;
                    
                    if (getX() <= 112) {
                       System.out.println("Congrats. You made a touchdown.");
                       getWorld().showText(("Problems Correct: " + String.valueOf(numberCorrect)+"/"+String.valueOf(questionNumber)), 130, 20);
                       questionNumber = 0;
                    }
                    if ((getX() <= 400) && (getX() >= 325) && (downs < 5)) {
                        downs = 0;
                    }
                    questionNumber++;  
                    downs++;
                }
                else {
                    downs++;
                    
                    if (downs > 4) {
                        System.out.println("Turnover. You failed to score a touchdown.");
                        getWorld().showText(("Problems Correct: " + String.valueOf(numberCorrect)+"/"+String.valueOf(questionNumber)), 130, 20);                        
                        questionNumber = 0;
                    }
                    else {
                        questionNumber++;
                    }
                }
                }
            }
            if (questionNumber == 7) {
                if (downs > 4) {
                        System.out.println("Turnover. You failed to score a touchdown.");
                        getWorld().showText(("Problems Correct: " + String.valueOf(numberCorrect)+"/"+String.valueOf(questionNumber)), 130, 20);                        
                        questionNumber = 0;
                    }
                else {
                    System.out.println("Down " + String.valueOf(downs));
                System.out.println("What value of a makes the expression undefined: 6 / (6a + 24)");
                String answerSeven = sc.nextLine();
                if (answerSeven.equals("-4")) {
                    int yards = getRandomNumber(-25,-15);
                    keepInFront(yards);
                    gainYards(yards);
                    numberCorrect++;
                    
                    if (getX() <= 112) {
                       System.out.println("Congrats. You made a touchdown.");
                       getWorld().showText(("Problems Correct: " + String.valueOf(numberCorrect)+"/"+String.valueOf(questionNumber)), 130, 20);
                       questionNumber = 0;
                    }
                    if ((getX() <= 400) && (getX() >= 325) && (downs < 5)) {
                        downs = 0;
                    }
                    questionNumber++;
                    downs++;
                }
                else {
                    downs++;
                    
                    if (downs > 4) {
                        System.out.println("Turnover. You failed to score a touchdown.");
                        getWorld().showText(("Problems Correct: " + String.valueOf(numberCorrect)+"/"+String.valueOf(questionNumber)), 130, 20);                        
                        questionNumber = 0;
                    }
                    else {
                        questionNumber++;
                    }
                }
                }
            }
            if (questionNumber == 8) {
                if (downs > 4) {
                        System.out.println("Turnover. You failed to score a touchdown.");
                        getWorld().showText(("Problems Correct: " + String.valueOf(numberCorrect)+"/"+String.valueOf(questionNumber)), 130, 20);                        
                        questionNumber = 0;
                    }
                else {
                    System.out.println("Down " + String.valueOf(downs));
                System.out.println("f(x) = 12x + 18, find f(3)");
                String answerEight = sc.nextLine();
                if (answerEight.equals("54")) {
                    int yards = getRandomNumber(-25,-15);
                    keepInFront(yards);
                    gainYards(yards);
                    numberCorrect++;
                    
                    if (getX() <= 112) {
                       System.out.println("Congrats. You made a touchdown.");
                       getWorld().showText(("Problems Correct: " + String.valueOf(numberCorrect)+"/"+String.valueOf(questionNumber)), 130, 20);
                       questionNumber = 0;
                    }
                    if ((getX() <= 400) && (getX() >= 325) && (downs < 5)) {
                        downs = 0;
                    }
                    questionNumber++;
                    downs++;
                }
                else {
                    downs++;
                    
                    if (downs > 4) {
                        System.out.println("Turnover. You failed to score a touchdown.");
                        getWorld().showText(("Problems Correct: " + String.valueOf(numberCorrect)+"/"+String.valueOf(questionNumber)), 130, 20);                        
                        questionNumber = 0;
                    }
                    else {
                        questionNumber++;
                    }
                }
                }
            }
            if (questionNumber == 9) {
                if (downs > 4) {
                        System.out.println("Turnover. You failed to score a touchdown.");
                        getWorld().showText(("Problems Correct: " + String.valueOf(numberCorrect)+"/"+String.valueOf(questionNumber)), 130, 20);                        
                        questionNumber = 0;
                    }
                else {
                    System.out.println("Down " + String.valueOf(downs));
                System.out.println("Simplify: ((-x^4 * y^4)(2xy^3))^0");
                String answerNine = sc.nextLine();
                if (answerNine.equals("1")) {
                    int yards = getRandomNumber(-25,-15);
                    keepInFront(yards);
                    gainYards(yards);
                    numberCorrect++;
                    
                    if (getX() <= 112) {
                       System.out.println("Congrats. You made a touchdown.");
                       getWorld().showText(("Problems Correct: " + String.valueOf(numberCorrect)+"/"+String.valueOf(questionNumber)), 130, 20);
                       questionNumber = 0;
                    }
                    if ((getX() <= 400) && (getX() >= 325) && (downs < 5)) {
                        downs = 0;
                    }
                    questionNumber++;
                    downs++;
                }
                else {
                    downs++;
                    
                    if (downs > 4) {
                        System.out.println("Turnover. You failed to score a touchdown.");
                        getWorld().showText(("Problems Correct: " + String.valueOf(numberCorrect)+"/"+String.valueOf(questionNumber)), 130, 20);                        
                        questionNumber = 0;
                    }
                    else {
                        questionNumber++;
                    }
                }
                }
            }
            if (questionNumber == 10) {
                if (downs > 4) {
                        System.out.println("Turnover. You failed to score a touchdown.");
                        getWorld().showText(("Problems Correct: " + String.valueOf(numberCorrect)+"/"+String.valueOf(questionNumber)), 130, 20);                        
                        questionNumber = 0;
                    }
                else {
                    System.out.println("Down " + String.valueOf(downs));
                System.out.println("Simplify: (64x^2 - 25) / (8x + 5)");
                String answerTen = sc.nextLine();
                if (answerTen.equals("8x-5") || answerTen.equals("8x - 5") || answerTen.equals("8x -5")) {
                    int yards = getRandomNumber(-25,-15);
                    keepInFront(yards);
                    gainYards(yards);
                    numberCorrect++;
                    
                    if (getX() <= 112) {
                       System.out.println("Congrats. You made a touchdown.");
                       getWorld().showText(("Problems Correct: " + String.valueOf(numberCorrect)+"/"+String.valueOf(questionNumber)), 130, 20);
                       questionNumber = 0;
                    }
                    if ((getX() <= 400) && (getX() >= 325) && (downs < 5)) {
                        downs = 0;
                    }
                    questionNumber++;
                    downs++;
                }
                else {
                    downs++;
                    
                    if (downs > 4) {
                        System.out.println("Turnover. You failed to score a touchdown.");
                        getWorld().showText(("Problems Correct: " + String.valueOf(numberCorrect)+"/"+String.valueOf(questionNumber)), 130, 20);                        
                        questionNumber = 0;
                    }
                    else {
                        questionNumber++;
                    }
                }
                }
            }
        }
    }
    
    //Makes a gaining yards transition for every Red_Player object
    public void gainYards(int yards) {
        List<Red_Player> red_players = getWorld().getObjects(Red_Player.class);
        if (red_players != null && !red_players.isEmpty()) {
            for (Red_Player red_player : red_players) {
                for (int i=1; i<=5; i++) {
                    red_player.move(yards);
                    Greenfoot.delay(1);
                }
            }
        }
    }
    
    //Keeps the blue players with the red players, always defending
    public void keepInFront(int yards) {
        List<Red_Player> red_players = getWorld().getObjects(Red_Player.class);
        List<Blue_Player> blue_players = getWorld().getObjects(Blue_Player.class);
        if (distances.isEmpty()) {
            for (int i=1; i<=9; i++) {
                distances.add(-30);
            }
            distances.add(-115);
        }
        int player_number = 0;
        for (Blue_Player blue_player : blue_players) {
            for (int i=1; i<=5; i++) {
                blue_player.move(yards);
                Greenfoot.delay(1);
            }
            player_number++;     
        }
    }

    //Random number generator between a range of integers
    public int getRandomNumber(int start, int end) {
        int normal = Greenfoot.getRandomNumber(end-start+1);
        return normal+start;
    }
}