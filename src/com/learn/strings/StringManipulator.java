package com.learn.strings;

import java.util.Scanner;

public class StringManipulator {

	/*
	 * this program demonstrates the usage of
	 *  1. length 
	 *  2. substring 
	 *  3. compareTo
	 * String functions
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();

		// print the sum of lengths of strings
		System.out.println(A.length() + B.length());

		// Check if A is lexicographically larger than B
		if(A.matches("[a-z]*") && B.matches("[a-z]*")) {
			if (A.compareTo(B) <= 0) {
				System.out.println("No");
			} else if (A.compareTo(B) > 0) {
				System.out.println("Yes");
			} 
			// Convert the first Letter of both Strings to upper case and print with space
			// in between them in single line
			System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase()
					+ B.substring(1));
		}
		
		//print substring in the inclusive range from start to end-1
		 System.out.println(A.substring(0,3)); 
	}

}
