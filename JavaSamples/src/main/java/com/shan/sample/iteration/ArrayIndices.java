package com.shan.sample.iteration;

import java.util.stream.IntStream;

public class ArrayIndices {

	public static void main(String[] args) {
		String[] array = { "A", "B", "C", "D"  };

		IntStream.range(0, array.length)
			.mapToObj(index -> String.format("%d -> %s", index, array[index]))
			.forEach(System.out::println);

	}

}
