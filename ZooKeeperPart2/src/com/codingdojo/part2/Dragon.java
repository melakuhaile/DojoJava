package com.codingdojo.part2;

import com.codingdojo.zookeeperpart1.Mammal;

public class Dragon extends Mammal{
	
	protected Integer energyLevel = 300;
	
	
	public void fly() {
		this.energyLevel -= 50;
		System.out.println("The Dragon has made a loud noise and has lost some energy level");
	}
	
	public void eatHumans() {
		this.energyLevel += 25;
		System.out.println("The bad draggon has eaten two people");
	}
	
	public void attackTown() {
		this.energyLevel -= 100;
		System.out.println("The Dragon burned a town and lost an energy level of and has lost a significant energy");
	}
	

}
