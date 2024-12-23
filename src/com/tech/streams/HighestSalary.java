package com.tech.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

// Find the Highest salary of the Employee using Streams.

public class HighestSalary {
	public static void main(String[] args) {
		List<HighestSalaryEmployee> employees = new ArrayList<HighestSalaryEmployee>();
		employees.add(new HighestSalaryEmployee("Babu Jella", 350000, "Software Developer"));
		employees.add(new HighestSalaryEmployee("Venkatesh Karamkanti", 400000, "UI Developer"));
		employees.add(new HighestSalaryEmployee("Ajay Durgam", 390000, "Devops Engineer"));
		
		Optional<HighestSalaryEmployee> highestSalary=employees.stream().max(Comparator.comparing(HighestSalaryEmployee :: getEmployeeSalary));
		
		highestSalary.ifPresent(employee -> System.out.println(employee));
	}
}

class HighestSalaryEmployee{
	public HighestSalaryEmployee(String employeeName, double employeeSalary, String employeeRole) {
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
	@Override
	public String toString() {
		return "HighestSalaryEmployee  : " + employeeName + " with " + employeeSalary;
	}
}