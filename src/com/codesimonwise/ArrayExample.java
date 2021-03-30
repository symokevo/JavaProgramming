package com.codesimonwise;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		String[] text = new String[] {"simon", "kevin", "Sammuel"};
		Arrays.sort(text);
		
		System.out.println(Arrays.toString(text));
		
		for (int i = 0; i < text.length; i++)
			System.out.print(text[i] + " ");

	}

}
