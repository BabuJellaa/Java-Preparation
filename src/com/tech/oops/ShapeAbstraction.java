package com.tech.oops;

/*Write a Java program to create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter(). 
Create subclasses Circle and Triangle that extend the Shape class and implement the respective methods to calculate the area and perimeter of each shape.*/

abstract class ShapeOfObject{
	public abstract void calculateArea();
	public abstract void calculatePerimeter();
}
class CircleShape extends ShapeOfObject{
	int radius;
	public CircleShape(int radius) {
		super();
		this.radius = radius;
	}
	@Override
	public void calculateArea() {
		System.out.println("Area of the circle : "+ (Math.PI*radius*radius));
	}

	@Override
	public void calculatePerimeter() {
		System.out.println("Perimeter of the Circle : "+(2*Math.PI*radius));

	}
}

class TriangleShape extends ShapeOfObject{
	int length;
	int bredth;
	int height;
	public TriangleShape(int length,int bredth,int height) {
		super();
		this.length = length;
		this.bredth= bredth;
		this.height=height;
	}
	@Override
	public void calculateArea() {
		System.out.println("Area of the Triangle : "+ (0.5*bredth*height));
	}

	@Override
	public void calculatePerimeter() {
		System.out.println("Perimeter of the Circle : "+(length+bredth+height));
	}
}

public class ShapeAbstraction {
	public static void main(String[] args) {
		ShapeOfObject object=new CircleShape(2);
		object.calculateArea();
		object.calculatePerimeter();
		ShapeOfObject object2=new TriangleShape(2, 4, 8);
		object2.calculateArea();
		object2.calculatePerimeter();
	}
}
