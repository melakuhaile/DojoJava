package com.codingdojo.objectmaster;


public class Samurai extends Human
{
    
    private  int number;

    public Samurai()
    {
        super();
        setHealth(200);
        number ++;
    }
    
    public void deathBlow(Human name)
    {
        name.setHealth(0);
        setHealth(getHealth() / 2.0);
    }
    
    public void medidate()
    {
        setHealth(getHealth() * 1.5);
    }
    
    public int howMany()
    {
        return number;
    }
    
    

}
