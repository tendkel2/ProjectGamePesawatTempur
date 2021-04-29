import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private int jeda=0;
    private int score;
    private int nyawa = 20;
    private int time;
    
    /**
     * Constructor for objects off class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 600, 1); 
        tampilnyawa();
        tampilscore();
        showTime();
        time=2000;
        addObject (new Pesawat(),250,550);
    }
    
    public void updatenyawa(int point)
    {
        nyawa = nyawa + point;
        tampilnyawa();
        
        if(nyawa ==0)
        {
            Greenfoot.stop();
            addObject(new kalah(),250,300);
        }
    }
    
    public void tampilnyawa()
    {
        showText("Nyawa :"+nyawa, 400, 25);
    }
    
    public void addScore (int points){
        score = score + points;
        tampilscore();
    }
    
    private void tampilscore()
    {
        showText("Score :"+score, 100, 25);
    }    
    
    private void countTime()
    {
        time--;
        showTime();
        if (time == 0)
        {
            Greenfoot.stop();
            addObject(new Menang(),250,300);
        }
    }
    
    private void showTime()
    {
        showText("Waktu :"+time,250,25);
    }
    
    public void act()
    {
        if (Greenfoot.getRandomNumber (100) < 3)
        {
            addObject(new Musuh(), Greenfoot.getRandomNumber(599), 500);
        }
        countTime();
    }
}