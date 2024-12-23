package com.tech.streams;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDetails {
	public static void main(String[] args) {
		List<TechEmployee> employeeList = new ArrayList<TechEmployee>();
		
		employeeList.add(new TechEmployee("Babu", "Tester", 30000));
		employeeList.add(new TechEmployee("Venky", "Developer", 31000));
		employeeList.add(new TechEmployee("Anji", "Mechanic", 29000));
		employeeList.add(new TechEmployee("Ajay", "Support", 32000));
		
		double highestSalary = 0;
		double secondHighestSalary=0;

		for(TechEmployee employee : employeeList ) {
			if(employee.getEmployeeSalary() > highestSalary ) {
				secondHighestSalary = highestSalary;
				highestSalary = employee.getEmployeeSalary();
			}
			else if(employee.getEmployeeSalary() > secondHighestSalary) {
				secondHighestSalary = employee.getEmployeeSalary();
			}
		}
		
		System.out.println("Highest Salary : "+ highestSalary);
		System.out.println("Second highest Salary : "+ secondHighestSalary);
	}
}

class TechEmployee{
	public TechEmployee(String employeeName, String employeeRole, double employeeSalary) {
		super();
		this.employeeName = employeeName;
		this.employeeRole = employeeRole;
		this.employeeSalary = employeeSalary;
	}
	private String employeeName;
	private String employeeRole;
	private double employeeSalary;
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeRole() {
		return employeeRole;
	}
	public void setEmployeeRole(String employeeRole) {
		this.employeeRole = employeeRole;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
}
