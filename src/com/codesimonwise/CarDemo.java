package com.codesimonwise;

public class CarDemo {

	public static void main(String[] args) {
		Car firstCar = new Car(2014, Model.MINIVAN, Color.BLACK);
		Car secondCar = new Car(2017, Model.CONVERTIBLE, Color.BLUE);
		firstCar.display();
		secondCar.display();

	}

}
