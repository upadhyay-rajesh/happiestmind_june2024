package com.facebook;

public class Variable_Demo {
	//all the variable inside class is known as global variable
	//it is of 2 type
	// a. static variable is known as class variable means we can call static variable inside other class using class name
	// b. non static variable is known as instance variable means we can call non-static variable inside other class using object of class
	
	int i;       //non static variable
	
	static int k=6; //static variable

	public static void main(String[] args) {
		//all the variable inside method or function is known as local variable
		int j=9;
		
		System.out.println(j);

	}

}
