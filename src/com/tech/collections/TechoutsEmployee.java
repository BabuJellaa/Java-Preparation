package com.tech.collections;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class TechoutsEmployee {	
	public static void main(String[] args) {
		List<TechoutsEmployee> employees=new ArrayList<TechoutsEmployee>();
		employees.add(new TechoutsEmployee("Babu Jella", 30000, 21, "Techouts","Male",LocalDate.of(2022, 2, 14),"HR"));
		employees.add(new TechoutsEmployee("Venkatesh Karamkanti", 31000, 22, "TCS","Male",LocalDate.of(2023, 3, 15),"HR"));
		employees.add(new TechoutsEmployee("Ajay Durgam", 32000, 24, "Capgemini","Male",LocalDate.of(2024, 4, 16),"IT"));
		employees.add(new TechoutsEmployee("Paddu Reddy", 32000, 21, "Accenture","FeMale",LocalDate.of(2025, 5, 17),"Finance"));
		employees.add(new TechoutsEmployee("Dhanusha Jella", 32000, 25, "Peddalingapur","FeMale",LocalDate.of(2026, 6, 18),"Finance"));

		/*Find the Avarage salary of the Male and Female employees in the organization*/
		employeesSalaryAvarage(employees);

		/* Find the Employees who joined in the organization in a specific year. */
		int year=2022;
		employeeJoinedSpecificYear(employees,year);

		/* Increment the salary of employeesin the HR department by 10 percent */
		hrSalaryIncrement(employees,10);

		/* Find the oldest employee in the Organization */
		getOldestEmployee(employees);

		/* Find the youngest employee in the Organization */
		getYoungestEmployee(employees);
	}

	private static void employeesSalaryAvarage(List<TechoutsEmployee> employees) {
		int femaleSalarySum=0;
		int maleSalarySum=0;
		int femaleCount=0;
		int maleCount=0;

		for( TechoutsEmployee employee : employees) {
			if(employee.getGender() == "FeMale") {
				femaleSalarySum+=employee.getSalary();
				femaleCount++;
			}else {
				maleSalarySum+=employee.getSalary();
				maleCount++;
			}
		}
		int femaleAvarageSalary= femaleSalarySum/femaleCount;
		int maleAvarageSalary=maleSalarySum/maleCount;

		System.out.println("Avarage of Male Salary : "+maleAvarageSalary+"Avarage of Female Salary : "+ femaleAvarageSalary);
		System.out.println();
	}

	private static void employeeJoinedSpecificYear(List<TechoutsEmployee> employees,int joiningYear) {
		List<TechoutsEmployee> techoutsEmployee=new ArrayList<TechoutsEmployee>();
		for(TechoutsEmployee employee : employees) {
			if(employee.getDateOfJoining().getYear() == joiningYear) {
				techoutsEmployee.add(employee);
			}
		}
		System.out.println("Employee who joined in the Specific year : ");
		for(TechoutsEmployee employee : techoutsEmployee) {
			System.out.println("Employee name : "+employee.name+" with year of "+ employee.dateOfJoining);
			System.out.println();
		}
	}

	private static void hrSalaryIncrement(List<TechoutsEmployee> employees,double hikePercentage) {
		for(TechoutsEmployee employee : employees) {
			if("HR".equalsIgnoreCase(employee.getDepartment())) {
				employee.setSalary((long) ((employee.getSalary())+((employee.getSalary())*(hikePercentage/100))));
			}
		}
		System.out.println("HR salary increment : ");
		for(TechoutsEmployee employee : employees) {
			System.out.println(employee);
		}
		System.out.println();
	}

	private static void getOldestEmployee(List<TechoutsEmployee> employees) {
		int age=0;
		List<TechoutsEmployee> oldestEmployee = new ArrayList<TechoutsEmployee>();
		for(TechoutsEmployee employee : employees) {
			if(employee.getAge()>=age) {
				age=employee.getAge();
			}
		}
		for(TechoutsEmployee employee : employees) {
			if(employee.getAge() == age) {
				oldestEmployee.add(employee);
			}
		}
		System.out.println("Oldest Employee : "+oldestEmployee);
		System.out.println();
	}

	private static void getYoungestEmployee(List<TechoutsEmployee> employees) {
		List<TechoutsEmployee> youngestEmployee = new ArrayList<TechoutsEmployee>();
		int age=employees.get(0).age;
		for(TechoutsEmployee employee : employees) {
			if(employee.getAge()<=age) {
				age=employee.getAge();
			}
		}
		for(TechoutsEmployee employee : employees) {
			if(employee.getAge() == age) {
				youngestEmployee.add(employee);
			}
		}
		System.out.println("Youngest Employee : "+youngestEmployee);
		System.out.println();
	}

	private String name;
	private long salary;
	private int age;
	private String company;
	private String gender;
	private LocalDate dateOfJoining;
	private String department;

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
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	public TechoutsEmployee(String name, long salary, int age, String company,String gender,LocalDate dateofJoining,String department) {
		super();
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.company = company;
		this.gender=gender;
		this.dateOfJoining=dateofJoining;
		this.department=department;
	}

	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "TechoutsEmployee [name=" + name + ", salary=" + salary + ", department=" + department +",  with age =" + age + "]";
	}

}
