package com.shan.sample.megabytesconverter;

public class MegaByteaConverter {

	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		
		if ( kiloBytes < 0 ) {
			System.out.println("Invalid Value");
		} else {
			int remainingKiloBytes = kiloBytes % 1024;
			int megaBytes = kiloBytes / 1024;
			
			System.out.println(kiloBytes +" KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMegaBytesAndKiloBytes(2050);
		printMegaBytesAndKiloBytes(-5);
		printMegaBytesAndKiloBytes(2052);

	}

}
