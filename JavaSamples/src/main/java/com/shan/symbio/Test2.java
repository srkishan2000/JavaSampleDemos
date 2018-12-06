package com.shan.symbio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test2 {

	public Test2() {
		// TODO Auto-generated constructor stub
	}
	
	static List<Integer> inclusiveRange(int from, int limit) {
	    return IntStream.rangeClosed(from, limit)
	            .boxed()
	            .collect(Collectors.toList());
	}
	
	static Iterable<String> inclusiveRange1(int from, int limit) {
	    return IntStream.rangeClosed(from, limit)
	    		.mapToObj(String::valueOf)::iterator;
	}

	public static void main(String[] args) throws IOException {		
		//System.out.println(inclusiveRange(1,100));
		
		//System.out.println(inclusiveRange1(1,100));
		
		
/*	
		
		//inclusiveRange1(1,100).forEach((key, value) -> {System.out.println( "Key: " + key + " - Value:" + value);});

		Iterable<String> result = ((Iterable<String>)IntStream.range(1, 101).mapToObj(String::valueOf)::iterator);
		
		for (String str : result) {
			System.out.println(str);
		}
		
		//Files.write(Paths.get("./numbers.txt"), result);
		
		
		
*/
		//Files.write(Paths.get("./numbers1.txt"),inclusiveRange1(1,100));
		
	}

}
