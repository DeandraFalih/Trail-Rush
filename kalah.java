import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kalah here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kalah extends World
{

    /**
     * Constructor for objects of class kalah.
     * 
     */
    public kalah()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        getBackground().drawImage(new GreenfootImage("You Lose", 54, null, null), 200, 200);
        getBackground().drawImage(new GreenfootImage("Press Spacebar to Mainmenu", 20, null, null), 175, 350);
        
    }
    public void act()
    {
        backToMenu();
    }
    
    public void backToMenu()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            mainmenu cd = new mainmenu();
            Greenfoot.setWorld(cd);
        }
    }
}


