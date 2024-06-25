package com.tech.oops;

/*Write a Java program to create a class called "Dog" with a name and breed attribute.
Create two instances of the "Dog" class, set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.*/

public class Dog {
	private String dogName;
	private String dogBreed;
	
	public Dog(String dogName, String dogBreed) {
		System.out.println("Values coming into constructor..");
		this.dogName = dogName;
		this.dogBreed = dogBreed;
	}
	public String getDogName() {
		return dogName;
	}
	
	public void setDogName(String dogName) {
		this.dogName = dogName;
	}

	public String getDogBreed() {
		return dogBreed;
	}

	public void setDogBreed(String dogBreed) {
		this.dogBreed = dogBreed;
	}
	public static void main(String[] args) {
		Dog dog1=new Dog("Charlie", "Golden Retriever");
		
		System.out.println("Default values :");
		System.out.println("Dog name : "+dog1.dogName +"&  Breed : "+dog1.dogBreed);
		
		dog1.setDogName("Chimtu");
		dog1.setDogBreed("Pug");
		
		System.out.println("\n New Values of Dog name and Dog breed using setters :");
		System.out.println("Dog name : "+dog1.getDogName() +"&  Breed : "+dog1.getDogBreed());
	}
}
