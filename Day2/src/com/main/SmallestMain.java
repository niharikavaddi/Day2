package com.main;

import java.util.Scanner;

import com.service.Smallest;

/**
 * Write a Java method to find the smallest number among three numbers.
 * 
 * @author Lakshmi Neeharika
 *
 */
public class SmallestMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter three numbers");
		int[] values = new int[3];
		for (int i = 0; i < values.length; i++)
			values[i] = scanner.nextInt();
		Smallest smallest = new Smallest();
		System.out.println(smallest.findSmallest(values));

	}

}
