package com.tech.oops;


/*Write a Java program to create a class called Employee with methods called work() and getSalary(). 
Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().*/

class Employee{
	long salary;
	
	public Employee(long salary) {
		super();
		this.salary = salary;
	}

	public long getSalary() {
		return salary;
	}
	
	public void work() {
		System.out.println("Employee is working...!!\n");
	}
}
class HRManager extends Employee{

	public HRManager(long salary) {
		super(salary);
	}
	public long getSalary() {
		return salary;
	}
	@Override
	public void work() {
		System.out.println("Managing employees in the organization..!!\n");
	} 
	public void addEmployee() {
		System.out.println("New Employee added to the organization..!!");
	}
}
public class EmployeeInheritance {
	public static void main(String[] args) {
		Employee employee=new Employee(30000);
		HRManager hrManager=new HRManager(50000);
		System.out.println("Employee Salary : "+employee.getSalary());
		employee.work();
		System.out.println("HR manager salary : "+hrManager.getSalary());
		hrManager.work();
		hrManager.addEmployee();
	}
}
