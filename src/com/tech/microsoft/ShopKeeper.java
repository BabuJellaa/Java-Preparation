package com.tech.microsoft;
import java.util.Arrays;
import java.util.Scanner;

public class ShopKeeper {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] price = new int[n];
		for (int i = 0; i < n; i++) {
			price[i] = scanner.nextInt();
		}
		int k = scanner.nextInt();
		scanner.close();
		System.out.println(getMinimumMoves(n, price, k));
	}

	static int getMinimumMoves(int n, int[] price, int k) {
		Arrays.sort(price);

		int medianIndex = (n + 1) / 2;
		int currentMedian = price[medianIndex - 1];

		int moves = 0;

		if (currentMedian > k) {
			for (int i = medianIndex - 1; i >= 0 && price[i] > k; i--) {
				moves += price[i] - k;
			}
		} else if (currentMedian < k) {
			for (int i = medianIndex - 1; i < n && price[i] < k; i++) {
				moves += k - price[i];
			}
		}

		return moves;
	}
}
