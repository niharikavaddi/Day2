package com.main;

import java.util.Scanner;

import com.service.MiddleCharacter;

/**
 * Write a Java method to display the middle character of a string.
 * 
 * a) If the length of the string is odd there will be two middle characters.
 * 
 * b) If the length of the string is even there will be one middle character.
 * 
 * @author Lakshmi Neeharika
 *
 */
public class MiddleCharacterMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a word:");
		String value = scanner.next();
		MiddleCharacter middleCharacter = new MiddleCharacter();
		System.out.println(middleCharacter.findMiddleCharacter(value));
	}

}
