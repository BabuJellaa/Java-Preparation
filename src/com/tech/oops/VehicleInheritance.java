package com.tech.oops;

/*Write a Java program to create a class called Vehicle with a method called drive(). 
Create a subclass called Car that overrides the drive() method to print "Repairing a car".*/

class Vehicle{
	public void drive() {
		System.out.println("Vehicles repairing..!!");
	}
}
class Car extends Vehicle{
	public void drive() {
		System.out.println("Repairing a car..!!");
	}
}
public class VehicleInheritance {
	public static void main(String[] args) {
		Vehicle vehicle=new Car();
		vehicle.drive();
	}
}
