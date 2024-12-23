package com.tech.hackkerank;

import java.math.BigInteger;
import java.util.Scanner;

/*In this problem, you have to add and multiply huge numbers! These numbers are so big that you can't contain them in any ordinary data types like a long integer.

Use the power of Java's BigInteger class and solve this problem.

Input Format : 
There will be two lines containing two numbers,  and .

Constraints : 
 a and b are non-negative integers and can have maximum  digits.
 
Output Format : 
Output two lines. The first line should contain a+b, and the second line should contain a*b. Don't print any leading zeros.

Sample Input : 
1234
20

Sample Output : 
1254
24680*/

public class BigIntegerClass {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter 1st number : ");
		BigInteger number1= new BigInteger(scanner.nextLine()) ;
		System.out.println("Enter 2nd number : ");
		BigInteger number2= new BigInteger(scanner.nextLine()) ;
		
		System.out.println("Sum of the two numbers : "+number1.add(number2)); 
		System.out.println("Multiply of the two numbers : "+number1.multiply(number2)); 
		
		scanner.close();
	}
}
