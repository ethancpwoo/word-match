import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * @Ethan Woo and Kenny Zhao 
 * @Fall 2021
 */
public class ChoosingGamemodes extends World
{
    Button instructions; 
    Button words3; 
    Button words4; 
    Button words5; 
    public static boolean touchingThree = false; 
    public static boolean touchingFour = false; 
    public static boolean touchingFive = false; 
    public ChoosingGamemodes() //constructor
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1);
        
        //Declare font title 
        Font titleFont = new Font("Calibri", true, false, 40);
        GreenfootImage title = new GreenfootImage("cooltext396141752577605.png");
        
        //custom titles
        GreenfootImage easy = new GreenfootImage("easy.png"); 
        GreenfootImage medium = new GreenfootImage("medium.png");
        GreenfootImage hard = new GreenfootImage("hard.png"); //custom names
        
        //Set background image and draw the title
        GreenfootImage background = new GreenfootImage("abstract_geometric_triangle_background-wallpaper-1280x720.jpg"); 
        background.setFont(titleFont);
        background.setColor(Color.BLACK); 
        setBackground(background); 
        background.drawImage(title, 400, 100); 
        
        //Initialize buttons  
        words3 = new Button("3 words");
        words4 = new Button("4 words"); 
        words5 = new Button("5 words");
        
        //Add the buttons to the screen
        addObject(words3, 350, 400); 
        addObject(words4, 650, 400);
        addObject(words5, 950, 400);
        
        //draw the lables
        background.drawImage(easy, 250, 450);
        background.drawImage(medium, 525, 450);
        background.drawImage(hard, 850, 450);
    }
    
    public void act()
    {
        //actually letting player choose gameworld so if their cursor is on it, the game behaves differently
        if(words3.touchingCursor())
        {
            touchingThree = true; 
            Greenfoot.setWorld(new GameWorld());
        }
        
        if(words4.touchingCursor())
        {
            touchingFour = true; 
            Greenfoot.setWorld(new GameWorld4());
        }
        
        if(words5.touchingCursor())
        {
            touchingFive = true; 
            Greenfoot.setWorld(new GameWorld5());
        }
        
    }

}
