package com.service;

public class MiddleCharacter {
	public String findMiddleCharacter(String value) {
		if (value.length() > 2 && (value.length()) % 2 == 0)
			return Character.toString(value.charAt((value.length()) / 2));
		else
			return value.charAt((int) (((value.length()) / 2) - 0.5)) + ""
					+ value.charAt((int) (((value.length()) / 2) + 0.5));
	}
}
