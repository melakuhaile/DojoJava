package com.codingdojo.objectmaster;

public class HumanTest {

	public static void main(String[] args) {
	   
	    Human sami= new Human();
	    Human mike = new Human();
	    sami.attack(mike);
	    
	    System.out.println("Mike's current health level is " + mike.getHealth());
	    
	    System.out.println();
        System.out.println();
        
        Wizard alatar = new Wizard();
        alatar.fireball(sami);
        alatar.heal(mike);
        
        Ninja momochi = new Ninja();
        momochi.steal(alatar);
        momochi.runAway();
        
        Samurai toyotomi = new Samurai();
        toyotomi.medidate();
        Samurai sanada = new Samurai();
        Samurai yamada = new Samurai();
        sanada.deathBlow(yamada);
        
        System.out.println(sanada.howMany());
	   
	}
}
	   
	   
	   

