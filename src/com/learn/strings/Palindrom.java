package com.learn.strings;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		/* Enter your code here. Print output to STDOUT. */
		String rev = "";
		if (A.length() <= 50) {
			for (int i = (A.length()) - 1; i >= 0; i--) {
				rev = rev + A.charAt(i);
			}
			if (A.equals(rev)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}

}
