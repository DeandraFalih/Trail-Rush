import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lv2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv2 extends World
{

    /**
     * Constructor for objects of class lv2.
     * 
     */
    public lv2()
    {    
        super(600, 400, 1); 
        addObject(new moto1(), 20, 330);
        addObject(new ground1(), 50, 350);
        addObject(new ground1(), 350, 300);
        addObject(new ground1(), 550, 250);
        addObject(new coinlv2(), 100, 330);
        addObject(new coinlv2(), 250, 280);
        addObject(new coinlv2(), 350, 280);
        addObject(new coinlv2(), 450, 230);
        addObject(new finish(), 550, 220);
        addObject(new awan(),500, Greenfoot.getRandomNumber(150));
        addObject(new awan(),300, Greenfoot.getRandomNumber(150));
        addObject(new awan(),150, Greenfoot.getRandomNumber(150));
    }
}
