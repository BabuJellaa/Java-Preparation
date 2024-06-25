package com.capgemini;

import java.util.Scanner;

public class Ajjji {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] numCalls =new int[n];
        System.out.println("Proceed with the elements of array:");
        for (int i = 0; i < n; i++) {
            numCalls[i] = scanner.nextInt();
        }
        System.out.println("Enter Alert Thresh hold value : ");
        int alertThreshold = scanner.nextInt();
        System.out.println("Enter Proceeding minutes value : ");
        int precedingMinutes = scanner.nextInt();
        scanner.close();
        System.out.println(numOfAlerts(numCalls, alertThreshold, precedingMinutes));
    }

    private static int numOfAlerts(int[] numCalls, int alertThreshold, int precedingMinutes) {
        int[] beforeSum = new int[numCalls.length + 1];
        int numberOfAlerts = 0;
        for(int i=1;i<beforeSum.length;i++) {
            beforeSum[i] = numCalls[i-1] + beforeSum[i-1];
        }
        for(int i=precedingMinutes;i<=numCalls.length;i++) {
            if((beforeSum[i] - beforeSum[i-precedingMinutes])/precedingMinutes > alertThreshold)
                numberOfAlerts++;
        }
        
        return numberOfAlerts;
    }
}
