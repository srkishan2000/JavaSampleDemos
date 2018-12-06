package com.shan.symbio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.IntStream;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}
	
	static Iterable<String> oneToHundred() {
		return ((Iterable<String>)IntStream.range(1, 101).mapToObj(String::valueOf)::iterator);
	}
	
	static void readAndPrintFile(String path) throws NumberFormatException, IOException {
		String line;
		FileReader f1 = new FileReader(new File(path));
		BufferedReader read = new BufferedReader(f1);

		while((line = read.readLine()) != null) {
			if(Integer.valueOf(line)%2==0) 
				System.out.println(line);
		}

		read.close();
	}

	public static void main(String[] args) throws IOException {
		
		// printing 1 to 100 in console
		for (String str : oneToHundred()) { System.out.println(str); }
		
		// write 1 to 100 in a file 
		Files.write(Paths.get("./numbers.txt"), oneToHundred());
		
		System.out.println("...............>");
		
		// read the above written file and prints in console - even number only (Half of the contents)
		readAndPrintFile("./numbers.txt");
		
	}

}
