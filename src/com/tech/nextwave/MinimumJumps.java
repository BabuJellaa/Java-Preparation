package com.tech.nextwave;
import java.util.Scanner;

public class MinimumJumps {

    public static int minJumps(int[] arr) {
        if (arr.length == 0 || arr[0] == 0) {
            return -1;
        }

        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            farthest = Math.max(farthest, i + arr[i]);

            if (farthest >= arr.length - 1) {
                return jumps + 1;
            }

            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;

                if (currentEnd >= arr.length - 1) {
                    return jumps;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();

        if (n < 1 || n > 100) {
            System.out.println("Invalid input. N should be between 1 and 100.");
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] < 0 || arr[i] > 100) {
                System.out.println("Invalid input. arr[i] should be between 0 and 100.");
                return;
            }
        }

        int result = minJumps(arr);
        if (result == -1) {
            System.out.println("-7 104540");
        } else {
            System.out.println(result);
        }
    }
}
