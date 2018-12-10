package com.shan.sample.reference;

import org.apache.commons.lang3.StringUtils;

public class StringReverseDemo {

	
	
	public static void main(String[] args) {
		 // We have an original string here that we'll need to reverse.
        String words = "The quick brown fox jumps over the lazy dog";

        // Using StringUtils.reverse we can reverse the string letter by letter.
        String reversed = StringUtils.reverse(words);

        // Now we want to reverse per word, we can use
        // StringUtils.reverseDelimited() method to do this.
        String delimitedReverse = StringUtils.reverseDelimited(words, ' ');
        String reversedelimitedReverse = StringUtils.reverse(StringUtils.reverseDelimited(words, ' '));

        // Print out the result
        System.out.println("Original: " + words);
        System.out.println("Reversed: " + reversed);
        System.out.println("Delimited Reverse: " + delimitedReverse);
        System.out.println("Reverse of Delimited Reverse: " + reversedelimitedReverse);

	}

}
