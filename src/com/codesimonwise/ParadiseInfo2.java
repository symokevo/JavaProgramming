package com.codesimonwise;

import java.util.Scanner;

public class ParadiseInfo2 {
	

	public static void main(String[] args) {
		
		/* 
		 * System.out.println("Enter your password >> ");
		 
		
		String passphrase = "codesimonwise";
		Scanner scanner = new Scanner(System.in);
		String pwd = scanner.nextLine();
		
		while(!pwd.equals(passphrase)) {
			System.out.println("Wrong! Try again");
			pwd = scanner.nextLine();
		}
		
		System.out.println("Success! Welcome");
		scanner.close();
		
		*/
		// Below is the above code in a DO WHILE LOOP;
		/*********************************************/
		
		/*
		 * Scanner scanner = new Scanner(System.in);
		String passPhrase;
		
		do {
			System.out.println("Enter your password >>");
			passPhrase = scanner.nextLine();
		} while (!pwd.equals(passPhrase));
		
		System.out.println("Success! Nice to have you back");

		 */
		 
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter cutoff price for discount >> ");
		double price = keyboard.nextDouble();
		
		System.out.print("Enter discount rate as a whole number >> ");
		double discount = keyboard.nextDouble();
		
		double savings = computeDiscountInfo(price, discount);
		
		System.out.println("Special this wek on any service over " + price);
		System.out.println("That's a saving of at least $" + savings);
		
	}
	
	public static double computeDiscountInfo(double price, double discountRate) {
		double savings = price * discountRate / 100; 
		return savings;
	}
	

}


























