import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ground extends Actor
{
    public ground()
    {
        setImage();
    }
    public void setImage()
    {
        getImage().scale(getImage().getWidth()*6,getImage().getHeight());
        GreenfootImage image = getImage();  
        image.scale(300, 40);
        setImage(image);
    }
    /**
     * Act - do whatever the ground wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
         
    }
}
