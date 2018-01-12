package com.codingdojo.objectmaster;

public class Wizard extends Human
{

    public Wizard()
    {
        super();
        setIntelligence(8);
        setHealth(50);
    }
    
    public void heal(Human name)
    {
        name.setHealth(name.getHealth() + getIntelligence());
    }
    
    public void fireball(Human name)
    {
        name.setHealth(name.getHealth() - getIntelligence() * 3);
    }

}