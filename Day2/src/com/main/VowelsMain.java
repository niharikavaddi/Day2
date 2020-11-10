package com.main;

import java.util.Scanner;

import com.service.Vowels;

/**
 * Write a Java method to count all vowels in a string.
 * 
 * @author Lakhsmi Neeharika
 *
 */
public class VowelsMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any word:");
		Vowels vowels = new Vowels();
		System.out.println(vowels.findVowels(scanner.next()));

	}

}
