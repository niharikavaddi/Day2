package com.main;

import java.util.Scanner;

import com.service.SumOfDigits;

/**
 * Your task is to create the class Addition and the required methods so that
 * the code prints the sum of the numbers passed to the function addition.
 * 
 * @author Lakshmi Neeharika
 *
 */
public class SumOfDigitsMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Size:");
		int size = scanner.nextInt();
		System.out.println("Enter Digits:");
		int[] values = new int[size];
		for (int i = 0; i < size; i++) {
			values[i] = scanner.nextInt();
		}
		SumOfDigits sumOfDigits = new SumOfDigits();
		sumOfDigits.printSum(values);
	}

}
