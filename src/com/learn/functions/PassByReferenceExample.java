package com.learn.functions;

public class PassByReferenceExample {
	public static void main(String[] args) {
		int[] A= {1,2,3,4,5};
		System.out.println(A[0]); //prints : 1
		updateArray(A); //object reference is passed since A is array object
		System.out.println(A[0]); //prints: 25 since actual value is updated 
	} 
	public static void updateArray(int X[]) {
		X[0]=25;
	}
}
