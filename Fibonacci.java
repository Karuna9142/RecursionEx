package com.recursion;

public class Fibonacci {
	
	public static void printFibonacci(int a, int b,int num)
	{
		if(num==0)
		{
			return;
		}
		int c = a+b;
		System.out.print(" " +c);
		printFibonacci(b, c, num-1);
	}

	public static void main(String[] args) {
		int a = 0, b = 1;
		System.out.println("Fibonacci Series:- ");
		System.out.print(a+ " "+b);
		
		int num= 6;
		printFibonacci(a, b, num-2);

	}

}
