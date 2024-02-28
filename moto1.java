import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.World;

/**
 * Write a description of class moto1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class moto1 extends Actor
{
    private int Speed = 7;
    private int acceleration = 2;
    private int vSpeed = 0;
    private int jumpStrength = 13;
    private int coinEaten = 0;
    private int finalScore = 0;
    public GreenfootSound backSound;
    /**
     * Act - do whatever the moto1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        getCoin();
        getCoinlvl2();
        getCoinlvl3();
        checkKeys();
        checkFall();
        lose();
    }
    
    public void totalScore(int finalscore)
    {
        int TotalScore= coinEaten;
    }
    
    public void lose()
    {
        setLocation(getX(), getY());
        if (getY()>390)
        {
            kalah loser = new kalah();
            Greenfoot.setWorld(loser);
        }
    }
    
    private void checkKeys()
    {
        if(Greenfoot.isKeyDown("left"))
            moveLeft();
        
        if(Greenfoot.isKeyDown("right"))
            moveRight();
            Greenfoot.playSound("motoeffect.wav");
        
        if(Greenfoot.isKeyDown("space"))
            jump();
        
    }
    
    public void jump()
    {
        vSpeed = -16;
        fall();
    }
    
    public moto1()
    {
        GreenfootImage image = getImage();  
        image.scale(50, 50);
        setImage(image);
        }
    
    public void moveRight()
        {
            setLocation (getX() + Speed, getY());
            Greenfoot.playSound("motoeffect.wav");
        }
    
    public void moveLeft()
    { 
        setLocation (getX() - Speed, getY());
    }
   
    void getCoin()
    {
        if(isTouching(coin.class))
        {
            removeTouching(coin.class);
            coinEaten++;
            lv1 mw = (lv1)getWorld();
            mw.showText("Score is : " + coinEaten, 70, 20);
            if(coinEaten == 4)
            {
                lv2 play = new lv2();
                Greenfoot.setWorld(play);
            }
        } 
    }
    
    public void getCoinlvl2()
    {
        if (isTouching(coinlv2.class))
        {
            removeTouching(coinlv2.class);
            coinEaten++;
            lv2 mw = (lv2)getWorld();
            mw.showText("Score is : " + coinEaten, 70, 20);
            if(coinEaten == 4)
            {
                lv3 play = new lv3();
                Greenfoot.setWorld(play);
            }
        }
    }
    
    public void getCoinlvl3()
    {
        if (isTouching(coinlv3.class))
        {
            removeTouching(coinlv3.class);
            coinEaten++;
            lv3 mw = (lv3)getWorld();
            mw.showText("Score is : " + coinEaten, 70, 20);
            if(coinEaten == 4)
            {
                menang play = new menang();
                Greenfoot.setWorld(play);
            }
        }
    }
    
     public void checkFall()
    {
        if(onGround())
        {vSpeed = 0;
        }
        else {
            fall();
        }
    }
    private void fall()
    {
        setLocation (getX(), getY() + vSpeed);
        vSpeed = vSpeed + acceleration;
    }
    
    public boolean onGround()
    {
        Actor under = getOneObjectAtOffset(0, getImage().getHeight() / 2, ground1.class);
        return under != null;
    }
}
