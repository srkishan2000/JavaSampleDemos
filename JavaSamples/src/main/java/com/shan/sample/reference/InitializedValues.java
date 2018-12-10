package com.shan.sample.reference;

import java.util.Arrays;
import java.util.List;

public interface InitializedValues {
	public static Integer[] integerOfArrays = {100, 800, 2500, 10, 56, 5};
	public static List<Integer> listOfIntegers = Arrays.asList(integerOfArrays);
	public static String[] stringOfArrays = {"Sridevi","Kichu","Shanmuga", "Vichu", "apple", "ABC", "abc"};
	public static List<String> listOfStrings = Arrays.asList(stringOfArrays);
}
