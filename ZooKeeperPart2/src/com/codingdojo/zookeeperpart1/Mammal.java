package com.codingdojo.zookeeperpart1;


public class Mammal {
	protected Integer energyLevel = 100;
	
	public Integer displayEnergy() {
		System.out.println(this.energyLevel);

		return this.energyLevel;
	}
}