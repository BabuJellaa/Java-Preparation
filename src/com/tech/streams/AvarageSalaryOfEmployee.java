package com.tech.streams;

import java.util.ArrayList;
import java.util.List;

// Avarage salary of the employee using streams..

public class AvarageSalaryOfEmployee {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("Babu Jella", 350000, "Software Developer"));
		employees.add(new Employee("Venkatesh Karamkanti", 400000, "UI Developer"));
		employees.add(new Employee("Ajay Durgam", 390000, "Devops Engineer"));
		
		double avarageSalary= employees.stream().mapToDouble(Employee :: getEmployeeSalary).average().orElse(0.0);
		
		System.out.println("Avarage Salary of the Employees : "+avarageSalary);
	}
}

class Employee{
	public Employee(String employeeName, double employeeSalary, String employeeRole) {
		super();
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.employeeRole = employeeRole;
	}
	private String employeeName;
	private double employeeSalary;
	private String employeeRole;
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public String getEmployeeRole() {
		return employeeRole;
	}
	public void setEmployeeRole(String employeeRole) {
		this.employeeRole = employeeRole;
	}
}
