package com.recursion;

public class Factorial {
	public static int calFact(int n)
	{
		//base case
		if(n==1 || n==0)
		{
			return n;
		}
		int fact_nm1 = calFact(n-1);
		int fact_n = n*fact_nm1;
		return fact_n;
	}
	public static void main(String[] args)
	{ int num = 4;
	int ans = calFact(num);
	System.out.println("Factorial of "+ num+ " is:- "+ans);
	
		

	}
 
}
