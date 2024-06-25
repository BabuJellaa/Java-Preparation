package com.tech.tcs;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class EmployeeDetails implements Comparable<EmployeeDetails>{
	private String name;
	private double salary;
	private LocalDate dateOfJoining;

	public EmployeeDetails(String name,double salary,LocalDate dateOfJoining) {
		this.name=name;
		this.salary=salary;
		this.dateOfJoining=dateOfJoining;
	}
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		ArrayList<EmployeeDetails> employeeList = new ArrayList<>();

		employeeList.add(new EmployeeDetails("Some one", 50000, LocalDate.of(2000, 3, 25)));
		employeeList.add(new EmployeeDetails("Babu Jella", 60000, LocalDate.of(2001, 2, 15)));
		employeeList.add(new EmployeeDetails("Venkatesh Karamkanti", 55000, LocalDate.of(2001, 1, 25)));


		Collections.sort(employeeList);

		for (EmployeeDetails employee : employeeList) {
			System.out.println("Name: " + employee.name+", Date of Joining: " + employee.dateOfJoining);
		}
	}

	@Override
	public int compareTo(EmployeeDetails details) {
		return this.dateOfJoining.compareTo(details.dateOfJoining);
	}
}
