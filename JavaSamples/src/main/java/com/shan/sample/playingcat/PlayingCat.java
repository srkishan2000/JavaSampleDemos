package com.shan.sample.playingcat;

public class PlayingCat {

	public static boolean isCatPlaying(boolean summer, int temperature) {
		// in summer temperature range 25 to 45 and other season temperature range is 25 to 35
		if(summer && (temperature >= 25 && temperature <= 45)) {
			return true;
		} else if ((!summer) && (temperature >= 25 && temperature <= 35))
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(isCatPlaying(true, 10));
		System.out.println(isCatPlaying(false, 36));
		System.out.println(isCatPlaying(false, 35));
	}

}
