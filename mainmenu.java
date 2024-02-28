import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mainmenu extends World
{
    private GreenfootSound backSound;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public mainmenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    private void prepare()
    {
        backSound = new GreenfootSound("sound1.mp3");
        backSound.playLoop();
    }
    
    public void act()
    {
        frontConfirmation();

    }

    public void frontConfirmation()
    {
        if(Greenfoot.isKeyDown("enter"))
        {
            lv1 play = new lv1();
            Greenfoot.setWorld(play);
        }

        if(Greenfoot.isKeyDown("q"))
        {
            Greenfoot.stop();
        }
    }

}    
