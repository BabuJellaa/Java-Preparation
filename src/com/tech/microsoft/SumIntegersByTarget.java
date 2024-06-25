package com.tech.microsoft;

public class SumIntegersByTarget {
	public static void main(String[] args) {
		
		int[] array= {3, 7, 1, 2, 8, 4, 5};
		int tatrgetNumber=10;
		
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(i+j==tatrgetNumber) {
					System.out.println(i+" and "+j+" sum is :"+tatrgetNumber);
				}
			}
		}
	}
}
