package com.service;

public class Bike extends Cycle {

	String define_me() {

		return "a cycle with an engine.";

	}

	public Bike() {

		System.out.println("Hello I am a motorcycle, I am " + define_me());
		System.out.println("My ancestor is a cycle, who is " + super.define_me());

	}

}
