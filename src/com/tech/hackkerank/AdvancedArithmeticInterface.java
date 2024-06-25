package com.tech.hackkerank;

import java.util.ArrayList;
import java.util.Scanner;

/*
A Java interface can only contain method signatures and fields. The interface can be used to achieve polymorphism. In this problem, you will practice your knowledge on interfaces.

You are given an interface AdvancedArithmetic which contains a method signature int divisor_sum(int n). 
You need to write a class called MyCalculator which implements the interface.

divisorSum function just takes an integer as input and return the sum of all its divisors. 
For example divisors of 6 are 1, 2, 3 and 6, so divisor_sum should return 12. The value of n will be at most 1000.

Read the partially completed code in the editor and complete it. You just need to write the MyCalculator class only. Your class shouldn't be public.

Sample Input
6

Sample Output
12

Explanation :
Divisors of 6 are 1,2,3 and 6. 1+2+3+6=12.*/

interface AdvancedArithmetic {
	public int divisor_sum(int n);
}
class MyCalculator implements AdvancedArithmetic{
	ArrayList<Integer> arrayList= new ArrayList<Integer>();

	@Override
	public int divisor_sum(int element) {
		int sum=0;
		for(int number=1;number<=element;number++) {
			if(element%number==0) {
				sum+=number;
				arrayList.add(number);
			}
		}
		System.out.println(arrayList);
		return sum;
	}
}

public class AdvancedArithmeticInterface{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Provide a number :");
		AdvancedArithmetic advancedArithmetic= new MyCalculator();
		System.out.println(advancedArithmetic.divisor_sum(scanner.nextInt()));
		scanner.close();
	}
}

