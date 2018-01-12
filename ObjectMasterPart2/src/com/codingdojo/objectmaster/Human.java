package com.codingdojo.objectmaster;

public class Human {
private int strength = 3;
private int intelligence = 3;
private int stealth =  3;
private double health = 100;
private String name = "";

public void setStrength(int strength) {
	this.strength = strength;
}
public int getStrength() {
	return strength;
}
public void setIntelligence(int intelligence) {
	this.intelligence = intelligence;
}

public int getIntelligence() {
	return intelligence;
}
public void setStealth(int stealth) {
	this.stealth = stealth;
}
public int getStealth() {
	return stealth;
}
public void setHealth(double health) {
	this.health = health;
}
public double getHealth() {
	return health;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public Human()
{ }

//public Human(String name, int strength, int health){
//	this.name = name;
//	this.strength = strength;
//	this.health = health;
//}

public void attack(Human name) {

   name.health -= strength;
    

}
}
 