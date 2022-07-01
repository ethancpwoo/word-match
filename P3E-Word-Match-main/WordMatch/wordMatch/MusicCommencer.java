import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @Ethan Woo and Kenny Zhao
 * @Fall 2021
 */
public class MusicCommencer extends World
{
    GreenfootSound bgm;

    public MusicCommencer()
    {    
        super(1280, 720, 1); 
        bgm = new GreenfootSound("acoustic-guitars-ambient-uplifting-background-music-for-videos-5642.mp3"); //call background music
    }
    public void act()
    {
        bgm.setVolume(20); 
        bgm.playLoop(); //play the loop forever
        Greenfoot.setWorld(new WelcomeWorld()); //start the game
    }
}
