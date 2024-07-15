package com.tech.nextwave;

import java.util.*;

public class Main {
	 public static List<int[]> avarageStudents(int[][] scores) {
	        Map<Integer, PriorityQueue<Integer>> sc = new HashMap<>();

	        for (int[] score : scores) {
	            sc.computeIfAbsent(score[0], k -> new PriorityQueue<>()).add(score[1]);
	            if (sc.get(score[0]).size() > 5) {
	                sc.get(score[0]).poll();
	            }
	        }
	        
	        List<int[]> result = new ArrayList<>();
	        
	        for (Map.Entry<Integer, PriorityQueue<Integer>> entry : sc.entrySet()) {
	            int sum = 0;
	            PriorityQueue<Integer> pq = entry.getValue();
	            for (int s : pq) {
	                sum += s;
	            }
	            result.add(new int[]{entry.getKey(), sum / pq.size()});
	        }

	        result.sort(Comparator.comparingInt(a -> a[0]));
	        return result;
	    }
	    public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        int[][] scores = new int[n][2];
	        for (int i = 0; i < n; i++) {
	            scores[i][0] = s.nextInt();
	            scores[i][1] = s.nextInt();
	        }
	        List<int[]> result = avarageStudents(scores);
	        for (int[]res : result) {
	            System.out.println( res[0] + " " + res[1]);
	        }
	        s.close();
	    }
}

