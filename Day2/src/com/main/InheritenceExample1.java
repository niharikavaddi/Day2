package com.main;

import com.service.Dog;

/**
 * Consider the below code and you must add a ‘bark method to the Dog class,
 * then modify the main method accordingly so that the code prints the following
 * lines: 
 * I am walking 
 * I am eating
 * I am barking
 *
 * @author Lakshmi Neeharika
 */
public class InheritenceExample1 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.walk();
		dog.eat();
		dog.bark();

	}
}
