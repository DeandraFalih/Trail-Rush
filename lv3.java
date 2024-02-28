import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lv3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv3 extends World
{

    /**
     * Constructor for objects of class lv3.
     * 
     */
    public lv3()
    {    
        super(600, 400, 1); 
        addObject(new ground1(), 50, 350);
        addObject(new ground1(), 350, 250);
        addObject(new ground1(), 20, 130);
        addObject(new moto1(), 20, 330);
        addObject(new coinlv3(), 100, 330);
        addObject(new coinlv3(), 250, 210);
        addObject(new coinlv3(), 350, 210);
        addObject(new coinlv3(), 100, 80);
        addObject(new finish(), 60, 80);
        addObject(new awan(),500, Greenfoot.getRandomNumber(150));
        addObject(new awan(),300, Greenfoot.getRandomNumber(150));
        addObject(new awan(),150, Greenfoot.getRandomNumber(150));
    }
}
