package com.service;

import java.util.Arrays;

public class Smallest {
	public int findSmallest(int[] values) {
		Arrays.sort(values);
		return values[0];
	}
}
