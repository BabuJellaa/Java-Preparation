package com.tech.oops;

/*Write a Java program to create a class known as Person with methods called getFirstName() and getLastName(). 
Create a subclass called Employee that adds a new method named getEmployeeId() and overrides the getLastName() method to include the employee's job title.
 */

class EmployeePerson{
	String firstName;
	String lastName;
	public EmployeePerson(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void getFirstNameOfPerson() {
		System.out.println("First name of the person is : "+getFirstName());
	}
	public void getLastNameOfPerson() { 
		System.out.println("Last name of the person is : "+getLastName());
	}
}

class PersonEmployee extends EmployeePerson{
	String employeeJobTitle;
	int employeeId;

	public PersonEmployee(String employeeJobTitle,int employeeId,String firstName,String lastName) {
		super(firstName,lastName);
		this.employeeJobTitle = employeeJobTitle;
		this.employeeId= employeeId;
	}
	public String getEmployeeJobTitle() {
		return employeeJobTitle;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	@Override
	public void getLastNameOfPerson() { 
		System.out.println("First name of the person is : "+super.getLastName()+" and Employees Job title is  : "+getEmployeeJobTitle());
	}
	public void getEmployeePersonId() {
		System.out.println("Employee Id of the employee : "+getEmployeeId());
	}
}
public class EmployeePersonInheritance {
	public static void main(String[] args) {
		EmployeePerson employeePerson=new EmployeePerson("Jella","");
		PersonEmployee employee= new PersonEmployee("Software Developer", 1839,"Jella","Babu");
		employee.getLastNameOfPerson();
		employee.getEmployeePersonId();
	}
}
