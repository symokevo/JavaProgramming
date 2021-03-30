package com.codesimonwise;

public class DemoConstructors {

	public static void main(String[] args) {
		ASuperClass subClass = new ASuperClass();
		subClass.output();

	}

}

class ASuperClass {
	public ASuperClass() {
		 System.out.println("this is string form the superclass constructor");
		}
	void output() {
		System.out.println("From a method within the superclass");
		
	}
}














