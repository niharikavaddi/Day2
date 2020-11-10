package com.service;

public class SumOfDigits {
	public void printSum(int[] values) {
		int sum;
		int end = 2;
		for (int i = 0; i < values.length - 1; i++) {
			sum = 0;
			for (int j = 0; j < end; j++) {
				System.out.print(values[j]);
				if (j != end - 1)
					System.out.print("+");
				sum += values[j];
			}
			System.out.print("=" + sum);
			System.out.println();
			end++;
		}
	}
}
