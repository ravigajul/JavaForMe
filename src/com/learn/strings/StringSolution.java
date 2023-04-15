package com.learn.strings;

import java.util.Scanner;

public class StringSolution {

	/*
	 * this program demonstrates the usage of 
	 * 1. length 
	 * 2. substring 
	 * 3. compareTo
	 * String functions
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		
		//print the sum of lengths of strings
		System.out.println(A.length()+B.length());
		
		//Check if A is lexicographically larger than B
		if(A.compareTo(B)<0) {
			System.out.println("A is not larger than B lexicographically");
		}else if(A.compareTo(B)>0) {
			System.out.println("A is larger than B lexicographically");
		}else {
			System.out.println("A is equal to B");
		}
		
		//Convert the first Letter of both Strings to upper case and print with space in between them in single line
	System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+" " + B.substring(0,1).toUpperCase()+B.substring(1));
	}

}
