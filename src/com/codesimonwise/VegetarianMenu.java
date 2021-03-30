package com.codesimonwise;

public class VegetarianMenu extends Menu {
	String[] vegEntreeChoices = {"Spinach Lasagna", "Chees Enchiladas", "Fruit Plate"};
	
	public VegetarianMenu() {
		super();
		for(int x = 0; x < vegEntreeChoices.length; ++x)
			getEntreeChoices()[x] = vegEntreeChoices[x];
	}

}
