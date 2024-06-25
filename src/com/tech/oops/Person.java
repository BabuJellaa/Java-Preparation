package com.tech.oops;

/*Write a Java program to create a class called "Person" with a name and age attribute. 
Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.*/

public class Person {
	private String name;
	private String age;

	public Person(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public String getAge() {
		return age;
	}
	public static void main(String[] args) {
		Person person1= new Person("Babu Jella", "23");
		Person person2= new Person("Venkatesh Karamkanti", "23");

		System.out.println(person1.getName() +"  "+person1.age);
		System.out.println(person2.getName() +"  "+person2.age);
	}
}
