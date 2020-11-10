package com.main;

import com.service.B;

/**
 * Create class named as ‘a’ and create a sub class ‘b’. Which is extends from
 * class ‘a’. And use these classes in ‘inherit’ class.
 * 
 * @author Lakshmi Neeharika
 *
 */
public class Inherit {

	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.displayA());
		System.out.println(b.displayB());
	}

}
