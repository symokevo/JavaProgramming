package com.codesimonwise;

public class BaseballPlayer {
	
	private static int countOfPlayers = 0;
	private int number;
	private double battingAverage;
	
	public BaseballPlayer(int id, double avg) {
		number = id;
		battingAverage = countOfPlayers + 1;
		
	}
	public void showPlayer() {
		System.out.println("Plyaer #" + number + " batting average is " + battingAverage + " There are " + countOfPlayers + " players");
	}

}









