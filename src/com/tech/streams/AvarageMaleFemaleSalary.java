package com.tech.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//  Find the Avarage Salary of Male and Female employees using Streams.

public class AvarageMaleFemaleSalary {
	public static void main(String[] args) {
		List<FemaleMaleEmployee> employees = new ArrayList<FemaleMaleEmployee>();
		employees.add(new FemaleMaleEmployee("Padmarani Rondla", "Female", 40000));
		employees.add(new FemaleMaleEmployee("Babu Jella", "Male", 30000));
		employees.add(new FemaleMaleEmployee("Dhanusha", "Female", 41000));
		employees.add(new FemaleMaleEmployee("Raju", "Male", 45000));
		
		Map<String,Double> avarageMaleFemaleSalary=employees.stream().collect(Collectors.groupingBy(
				FemaleMaleEmployee :: getEmployeeGender, Collectors.averagingDouble(FemaleMaleEmployee :: getEmployeeSalary) ));
		
		System.out.println(avarageMaleFemaleSalary);
	}
}

class FemaleMaleEmployee{
	public FemaleMaleEmployee(String employeeName, String employeeGender, double employeeSalary) {
		super();
		this.employeeName = employeeName;
		this.employeeGender = employeeGender;
		this.employeeSalary = employeeSalary;
	}
	private String employeeName;
	private String employeeGender;
	private double employeeSalary;
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeGender() {
		return employeeGender;
	}
	public void setEmployeeGender(String employeeGender) {
		this.employeeGender = employeeGender;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
}
