package com.tech.oops;

/*Write a Java program to create an abstract class Animal with an abstract method called sound(). 
Create subclasses Lion and Tiger that extend the Animal class and implement the sound() method to make a specific sound for each animal.*/

abstract class Animals{
	public abstract void sound();
}
class Lion extends Animals{
	@Override
	public void sound() {
		System.out.println("Lion roars!!");
	}
}
class Tiger extends Animals{
	@Override
	public void sound() {
		System.out.println("Tiger growls!!");
	}
}
public class AnimalAbstraction {
	public static void main(String[] args) {
		Animals animal=new Lion();
		animal.sound(); // Calls the Lion class
		Animals animals=new Tiger();
		animals.sound(); // Calls the Tiger class
	}
}
