package com.codesimonwise;

// Creating a Subclass from the Party class 

public class DinnerParty extends Party {
	private int dinnerChoice;
	public int getDinnerChoice() {
		return dinnerChoice;
	}
	
	public void setDinnerChoice(int choice) {
		dinnerChoice = choice;
	}

}
