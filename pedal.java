import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pedal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pedal extends Actor
{
    /**
     * Act - do whatever the pedal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public pedal()
    {
        GreenfootImage image = getImage();  
        image.scale(100, 100);
        setImage(image);
        }
}
