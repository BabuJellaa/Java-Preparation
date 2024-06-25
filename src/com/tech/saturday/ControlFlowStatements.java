package com.tech.saturday;

public class ControlFlowStatements {

	public static void main(String[] args) {
		
		int a=5;
		int b=4;
		int c=13;
		
		if(a>b && a>c) {
			System.out.println("Greatest number is a : "+a);
		}
		else if(b>a && b>c) {
			System.out.println("Greatest number is b : "+b);
		}
		else {
			System.out.println("Greatest number is c : "+c);
		}

	}

}
