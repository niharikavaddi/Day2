package com.service;

public class Acmachine {
	int temparature;
	String brand;
	int cost;

	public Acmachine(int temparature, String brand, int cost) {
		super();
		this.temparature = temparature;
		this.brand = brand;
		this.cost = cost;
	}

	public void displayData() {
		System.out.println(temparature);
		System.out.println(brand);
		System.out.println(cost);
	}

}
