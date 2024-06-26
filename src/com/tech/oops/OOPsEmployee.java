package com.tech.oops;

/*Write a Java program to create a class called Employee with methods called work() and getSalary(). 
Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee()*/


class Employeee{

	long salary;

	public Employeee(long salary) {
		this.salary=salary;
	}

	public long getSalary() {
		return salary;
	}

	public void work() {
		System.out.println("Employee is working in the Organization..!!!");
	}

	public void getSalariey() {
		System.out.println(getSalary());
	}
}

class HRManagerr extends Employeee{

	public HRManagerr(long salary) {
		super(salary);
	}

	@Override
	public void work() {
		System.out.println("HR manager is also working in the Organization..!!!");
	}

	public void addEmployee() {
		System.out.println("New employee is joined in the Organization..!!!");
	}
}

public class OOPsEmployee {
	public static void main(String[] args) {
		Employeee employeee= new Employeee(30000);
		employeee.work();
		employeee.getSalariey();

		HRManager hrManager=new HRManager(50000);
		hrManager.work();
		System.out.println(hrManager.getSalary());
		hrManager.addEmployee();
	}
}
