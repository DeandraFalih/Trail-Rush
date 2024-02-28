import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lv1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv1 extends World
{
    /**
     * Constructor for objects of class lv1.
     * 
     */
    public lv1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new moto1(), 20, 330);
        addObject(new ground1(), 150, 350);
        addObject(new ground1(), 350, 350);
        addObject(new ground1(), 550, 350);
        addObject(new coin(), 100, 330);
        addObject(new coin(), 200, 330);
        addObject(new coin(), 300, 330);
        addObject(new coin(), 400, 330);
        addObject(new finish(), 550, 330);
        addObject(new awan(),500, Greenfoot.getRandomNumber(150));
        addObject(new awan(),300, Greenfoot.getRandomNumber(150));
        addObject(new awan(),150, Greenfoot.getRandomNumber(150));
    }
}
