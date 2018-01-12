package com.codingdojo.zookeeperpart1;

public class Gorilla extends Mammal {
	
	public void throwSomething() {
		this.energyLevel -= 5;
		System.out.println("The Gorilla has thrown a banana");
	}
	
	public void eatBananas() {
		this.energyLevel += 10;
		System.out.println("The Gorilla ate a banana!");
	}
	
	public void climb() {
		this.energyLevel -= 10;
		System.out.println("The Gorilla  climb!");
	}
	
}