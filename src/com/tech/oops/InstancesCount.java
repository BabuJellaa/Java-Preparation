package com.tech.oops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*The Java instanceof operator is used to test if the object or instance is an instanceof the specified type.

In this problem we have given you three classes in the editor:

Student class
Rockstar class
Hacker class
In the main method, we populated an ArrayList with several instances of these classes. count method calculates 
how many instances of each type is present in the ArrayList. The code prints three integers, the number of instance of Student class, the number of instance of Rockstar class, 
the number of instance of Hacker class.

Sample Input

5
Student
Student
Rockstar
Student
Hacker

Sample Output
3 1 1*/

class Student{};
class Rockstar{};
class Hacker{};

public class InstancesCount {
	public static String getCount(ArrayList listOfInstances) {
		int studentInstanceCount=0;
		int rockstartInstanceCount=0;
		int hackerInstanceCount=0;

		for(int i=0;i<listOfInstances.size();i++) {
			Object instance= listOfInstances.get(i);

			if(instance instanceof Student)
				studentInstanceCount++;
			if(instance instanceof Rockstar)
				rockstartInstanceCount++;
			if(instance instanceof Hacker)
				hackerInstanceCount++;
		}
		return Integer.toString(studentInstanceCount)+" "+Integer.toString(rockstartInstanceCount)+" "+Integer.toString(hackerInstanceCount);
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("How many instances you want to give :"); 
		int instancesSize=scanner.nextInt();
		ArrayList instances=new ArrayList<String>();
		for(int i=0;i<instancesSize;i++) {
			String nameOftheInstance=scanner.next();
			if(nameOftheInstance.toLowerCase().equals("student")) instances.add(new Student());
			if(nameOftheInstance.toLowerCase().equals("rockstar")) instances.add(new Rockstar());
			if(nameOftheInstance.equals("hacker")) instances.add(new Hacker());
		}
		scanner.close();
		System.out.println(getCount(instances));

	}
}
