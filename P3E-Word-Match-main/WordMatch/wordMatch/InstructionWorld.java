import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @Ethan Woo and Kenny Zhao
 * @Fall 2021
 */

public class InstructionWorld extends World
{
    Color beige = new Color(224, 171, 113); 
    Font titleFont = new Font("Calibri", true, false, 40);
    Font textFont = new Font("Calibri", false, false, 25);
    Button back; //define objects, colors, and fonts
    public InstructionWorld()
    {    
        super(1280, 720, 1); 
        GreenfootImage background = new GreenfootImage(1280, 720);
        back = new Button("Back"); //make the button object
        background.setColor(beige);  
        background.fill(); //make the background pure beige
        background.setFont(titleFont); 
        background.setColor(Color.BLACK); 
        background.drawRect(200, 100, 880, 520); 
        background.setColor(Color.WHITE); 
        background.fillRect(201, 101, 879, 519);
        background.setColor(Color.BLACK); //make a white rectangle with a black outline
        background.drawString("Instructions", 230, 170);
        background.setFont(textFont); 
        background.drawString("1. Choose your difficulty (3, 4, or 5 letter words), you will get 11 letters in a box.", 230, 250);
        background.drawString("2. These letters are anagrams (can make up words). You will have 30 seconds.", 230, 300);
        background.drawString("3. Try to make all the possible word combinations by clicking on the letters.", 230, 350);
        background.drawString("4. You will get extra points for consecutive correct answers.", 230, 400);
        background.drawString("5. Try to beat the highest difficulty as well as your high score!", 230, 450); 
        background.drawString("6. Have fun!", 230, 500); //the actual instructions
        addObject(back, 900, 520); 
        setBackground(background); //set the background
    }
    public void act()
    {
        if(back.touchingCursor() == true)
        {
            Greenfoot.setWorld(new WelcomeWorld()); //go back to the welcome world
        }
    }
}
