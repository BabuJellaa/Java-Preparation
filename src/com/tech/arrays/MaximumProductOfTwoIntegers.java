package com.tech.arrays;

import java.util.Arrays;

public class MaximumProductOfTwoIntegers {
	public static void main(String[] args) {
		int[] nums = {2, 3, 5, 7, -7, 5, 8, -5};
		
		Arrays.sort(nums);
		
		System.out.println(nums[nums.length-1]*nums[nums.length-2]);
	}
}
