import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class menang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class menang extends World
{

    /**
     * Constructor for objects of class menang.
     * 
     */
    public menang()
    {    
        super(600, 400, 1); 
        getBackground().drawImage(new GreenfootImage("You Win", 54, null, null), 200, 200);
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
            return;
        }
    }
}
