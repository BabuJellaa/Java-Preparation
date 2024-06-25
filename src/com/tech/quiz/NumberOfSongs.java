package com.tech.quiz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberOfSongs {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        int[] playlist = new int[n];
	        for (int i = 0; i < n; i++) {
	            playlist[i] = scanner.nextInt();
	        }
	        Map<Integer, Integer> singerCount = new HashMap<>();
	        for (int singer : playlist) {
	            singerCount.put(singer, singerCount.getOrDefault(singer, 0) + 1);
	        }
	        int maxCount = 0;
	        for (int count : singerCount.values()) {
	            maxCount = Math.max(maxCount, count);
	        }
	        System.out.println(maxCount);
	        
	        scanner.close();
	    }
	 
		    public int[] twoSum(int[] nums, int target) {
		        for(int i=0;i<=nums.length;i++){
		            
		        }
				return nums;
		    }
}

