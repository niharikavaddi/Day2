package com.service;

public class Vowels {

	public int findVowels(String data) {
		int result = 0;
		for (int i = 0; i < data.length(); i++) {
			if (data.charAt(i) == 'a' || data.charAt(i) == 'e' || data.charAt(i) == 'i' || data.charAt(i) == 'o'
					|| data.charAt(i) == 'u') {
				result += 1;
			}
		}
		return result;
	}
}
