package com.tech.nextwave;

import java.util.Scanner;

public class MatrixMultiplication {

    public static int minMultiplications(int[] arr) {
        int n = arr.length - 1; // Number of matrices

        // Create a DP table to store minimum multiplications
        int[][] dp = new int[n][n];

        // Initialize the DP table with 0 (no multiplications needed for single matrix)
        for (int i = 0; i < n; i++) {
            dp[i][i] = 0;
        }

        // Build the DP table
        // len is the chain length
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i < n - len + 1; i++) {
                int j = i + len - 1;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    int cost = dp[i][k] + dp[k + 1][j] + arr[i] * arr[k + 1] * arr[j + 1];
                    if (cost < dp[i][j]) {
                        dp[i][j] = cost;
                    }
                }
            }
        }

        // Minimum multiplications for the entire chain
        return dp[0][n - 1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of matrices
        System.out.println("Enter the number of matrices:");
        int n = scanner.nextInt();

        // Validate input size
        if (n < 2 || n > 100) {
            System.out.println("Invalid input. Number of matrices should be between 2 and 100.");
            return;
        }

        // Input dimensions of matrices
        int[] arr = new int[n + 1];
        System.out.println("Enter the dimensions of the matrices:");
        for (int i = 0; i <= n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Calculate minimum multiplications using dynamic programming
        int minMult = minMultiplications(arr);
        System.out.println("Minimum number of multiplications: " + minMult);
    }
}

