package com.capgemini;

import java.util.Scanner;

public class AbhiNav {

	public static int[] maxXOr(int lo, int hi, int k) {
		int max = 0;
		int a = lo;
		int b = lo + 1;

		for (int num1 = lo; num1 <= hi; num1++) {
			for (int num2 = num1 + 1; num2 <= hi; num2++) {
				int xorValue = num1 ^ num2;
				if (xorValue <= k && xorValue > max) {
					max = xorValue;
					a = num1;
					b = num2;
				}
			}
		}
		return new int[]{a, b};
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter lo value :");
		int lo=scanner.nextInt();
		System.out.println("Enter hi value :");
		int hi=scanner.nextInt();
		System.out.println("Enter k value :");
		int k=scanner.nextInt();
		int[] result = maxXOr(lo, hi, k);


		System.out.println("Result");
		System.out.println(result[0] + result[1]);
		scanner.close();
	}
}