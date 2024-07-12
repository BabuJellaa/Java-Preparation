package com.tech.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Employee {
	private String name;
	private long salary;
	private int age;
	private String company;
	
	public String getName() {
		return name;
	}

	public long getSalary() {
		return salary;
	}
	public int getAge() {
		return age;
	}
	public String getCompany() {
		return company;
	}
	public Employee(String name, long salary, int age, String company) {
		super();
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.company = company;
	}

	public static void main(String[] args) {
		List<Employee> employees=new ArrayList<Employee>();
		employees.add(new Employee("Babu Jella", 30000, 23, "Techouts"));
		employees.add(new Employee("Venkatesh Karamkanti", 31000, 23, "TCS"));
		employees.add(new Employee("Ajay Durgam", 32000, 23, "Capgemini"));
		
		Optional<Employee> employee=employees.stream().sorted(Comparator.comparing(Employee::getSalary)).skip(1).findFirst();
		
		System.out.println(employee);
	}
}
