package com.tech.assesments;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import com.tech.collections.Employee;

public class HighestSalaryEmployee {
	public HighestSalaryEmployee(int id, String name, double salary, String role, int age, long yearOfJoining,
			String gender) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.role = role;
		this.age = age;
		this.yearOfJoining = yearOfJoining;
		this.gender = gender;
	}
	private int id;
	private String name;
	private double salary;
	private String role;
	private int age;
	private long yearOfJoining;
	private String gender;
	
	 @Override
	    public String toString() {
	        return "HighestSalaryEmployee{" +
	                "id=" + id +
	                ", name='" + name + '\'' +
	                ", salary=" + salary +
	                ", role='" + role + '\'' +
	                ", age=" + age +
	                ", yearOfJoining=" + yearOfJoining +
	                ", gender='" + gender + '\'' +
	                '}';
	    }
	public static void main(String[] args) {
		List<HighestSalaryEmployee> employees= new ArrayList<HighestSalaryEmployee>();
		employees.add(new HighestSalaryEmployee(1,"Babu",30000, "Java Developer",24,2022,"Male"));
		employees.add(new HighestSalaryEmployee(2,"Ajay",31000, " Devops Engineer",24,2022,"Male"));
		employees.add(new HighestSalaryEmployee(3,"Venkatesh",50000, "AWS Cloud Engineer",25,2022,"Male"));
		employees.add(new HighestSalaryEmployee(4,"Tamannaa",35000, "Actress",29,2010,"Female"));
		
		Optional<HighestSalaryEmployee> hiOptional=employees.stream(). 
				max(Comparator.comparingDouble(HighestSalaryEmployee::getSalary));
		
		hiOptional.ifPresent(
				employee -> System.out.println("Employee with highest salary : "+employee) );
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public String getRole() {
		return role;
	}
	public int getAge() {
		return age;
	}
	public long getYearOfJoining() {
		return yearOfJoining;
	}
	public String getGender() {
		return gender;
	}
}
