package com.tech.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

// Find the Second highest salary of the Employee using Streams.

public class SecondHighestSalary {
	public static void main(String[] args) {
		List<SecondHighestSalaryEmployee>  employees = new ArrayList<SecondHighestSalaryEmployee>();
		employees.add(new SecondHighestSalaryEmployee("Babu Jella", 350000, "Software Developer"));
		employees.add(new SecondHighestSalaryEmployee("Venkatesh Karamkanti", 400000, "UI Developer"));
		employees.add(new SecondHighestSalaryEmployee("Ajay Durgam", 390000, "Devops Engineer"));

		Optional<SecondHighestSalaryEmployee> highestSalary=employees.stream().sorted(Comparator.comparing(SecondHighestSalaryEmployee :: getEmployeeSalary)).skip(1).findFirst();

		highestSalary.ifPresent(employee -> System.out.println(employee));
	}
}

class SecondHighestSalaryEmployee{
	public SecondHighestSalaryEmployee(String employeeName, double employeeSalary, String employeeRole) {
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
		return "SecondHighestSalaryEmployee  : " + employeeName + " with " + employeeSalary;
	}
}