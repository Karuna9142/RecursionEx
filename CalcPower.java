package com.recursion;

public class CalcPower {
  
	public static int calcPower(int x, int n)
	{
		if(n==0)
		{
			return 1;
		}
		if(x==0)
		{
			return 0;
		}
		int xPownm1 = calcPower(x, n-1);
		int x_pown = x*xPownm1;
		return x_pown;
	}
	public static void main(String[] args) {
		int x  = 2, n =5;
		int ans = calcPower(x, n);
		
		System.out.println(ans);

	}

}
