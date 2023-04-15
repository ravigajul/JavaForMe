package com.learn.functions;

public class VariableArgumentsFunction {
	public static void main(String[] args) {
		
		//calling show with multiple parameters of same type. Although the function is declared once.was possible by the ellipses in the function argument
		show(5);
		show(5,6);
		show(5,7,8);
	}
	public static void show(int ...x)
	{
		for (int num : x) {
            System.out.print(num + " ");
        }
		System.out.println("");
	}
}
