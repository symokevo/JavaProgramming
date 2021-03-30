package com.codesimonwise;

import java.util.Scanner;

public class Convert {

	public static void main(String[] args) {
		//File name HelloWorldJava
		//Written by Simon-Kevin
		//Written on date 29th, April 2020
		scanDouble();
	}
	
	public static void printLogarithm(double x) {
		double result = Math.log(x);
		System.out.println("The log of "+ x +" is " + result);
	}
	
	public static void scanDouble() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number >> ");
		
		if (!in.hasNextDouble()) {
			String word = in.next();
			System.err.println(word + " is not a number");
			return;
		}
		double x = in.nextDouble();
		printLogarithm(x);
	}

}
