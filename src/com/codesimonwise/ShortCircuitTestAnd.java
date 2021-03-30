package com.codesimonwise;

// A program that demonstrates how short-circuiting works with the && operator
public class ShortCircuitTestAnd {

	public static void main(String[] args) {
		boolean testFalseMethod = falseMethod();
		if(trueMethod() || testFalseMethod)
			System.out.println("Both are true");
		else
			System.out.println("Both are not true");
		
		}
	
	public static boolean trueMethod() {
		System.out.println("Within the trueMethod()");
		return false;
	}
	
	public static boolean falseMethod() {
		System.out.println("Within falseMethod()");
		return true;
	}

}
