package com.learn.arrays;

public class TwoDArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[][] myArray = new int[3][4];
		int[][] myArray= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		//here myArray is a outer array with 3 sub array. so myArray.length is 3 rows
		for(int i=0;i<myArray.length;i++) {
			//here myArray[0] is an array with 4 elements.So  myArray[0].length is 4 columns
			for(int j=0;j<myArray[i].length;j++) {
				System.out.print(myArray[i][j]+" ");
			}
			System.out.println("");
		}
	}

}
