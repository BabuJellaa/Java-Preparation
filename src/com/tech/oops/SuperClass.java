package com.tech.oops;

/*Write a Java program to create a class called Shape with a method called getArea(). 
 	Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.*/

//Base class
class Shape {
	public double getArea() {
		return 0.0;
	}
}

// Rectangle
class Rectangle extends Shape {
	private double width;
	private double height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	@Override
	public double getArea() {
		return width * height;
	}
}

//Circle
class Circle extends Shape {
	private double radius;

	public Circle(double radius) {
		this.radius=radius;
	}

	@Override
	public double getArea() {
		return Math.PI*radius*radius;
	}
}

public class SuperClass {
	public static void main(String[] args) {
		Shape rectangle = new Rectangle(5.2, 10);
		System.out.println("Area of the Rectangle : " + rectangle.getArea());

		Shape circle= new Circle(5);
		System.out.println("Area of the Circle : "+circle.getArea());
	}
}
