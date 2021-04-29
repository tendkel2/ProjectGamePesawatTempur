import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LaserMusuh here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LaserMusuh extends Actor
{
    private int nyawa;
    /**
     * Act - do whatever the LaserMusuh wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void gerak() 
    {
        setLocation(getX(),getY()+5);
        if(getY()>590){
            getWorld().removeObject(this);
        }else{
            cek_kena();
        }
    }
    
    public void cek_kena(){
        if (isTouching(Pesawat.class))
        {
            getWorld().addObject(new Ledakan2(),getX(),getY());
            MyWorld w= (MyWorld)getWorld();
            w.updatenyawa(-1);
            getWorld().removeObject(this);
            Greenfoot.playSound("meledak.mp3");
        }
    }
    
    public void act()
    {
        gerak();
    }
}