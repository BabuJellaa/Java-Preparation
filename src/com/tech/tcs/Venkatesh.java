package com.tech.tcs;

public class Venkatesh {
	public static void main(String[] args) {
		int count=1;
		
		int targetNumber=5;
		
		for(int num=0;num<5;num++) {
			
			if(num<targetNumber) {             //num=0  -->  0 < 5  --> True    --count=2
				count++;
			}
		}
		System.out.println("Rotations count to get final target number :"+count);
	}

}