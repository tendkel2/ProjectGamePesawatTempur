import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Musuh here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Musuh extends Actor
{
    public int tahan=30;
    private int jeda=0;
    
    /**
     * Act - do whatever the Musuh wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void gerak() 
    {
        setLocation(getX(),getY()+1);
        if(getY()>500){
            setLocation(Greenfoot.getRandomNumber(500),
            Greenfoot.getRandomNumber(20));
        }
    }  
    
    public void act()
    {
        gerak();
        if(tahan==0){
            tahan=30;
        }

        if(jeda>0)jeda--;
        if(jeda==1)getWorld().addObject(new LaserMusuh(),getX(), getY()+50);
        if(jeda==0)jeda=120;
    }
}