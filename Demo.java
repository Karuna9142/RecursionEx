package com.recursion;

//print number from 1 to 5.
public class Demo {
	
	public static void printNumb(int n)
	{
		if(n==0)
		{
			return;
		}
		System.out.println(n);
		printNumb(n-1);
	}

	public static void main(String[] args) {
		int num = 5;
		printNumb(num);

	}

}
